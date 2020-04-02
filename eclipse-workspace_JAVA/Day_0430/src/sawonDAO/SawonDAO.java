package sawonDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class SawonDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	SawonVO sawonVO = null;

	public List<SawonVO> sawonList() {
		List<SawonVO> list = new ArrayList<SawonVO>();
		String sql = "select * from sawon order by sno desc";
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				sawonVO = new SawonVO();
				sawonVO.setSno(rs.getInt(1));
				sawonVO.setName(rs.getString(2));
				sawonVO.setTel(rs.getString(3));
				sawonVO.setPay(rs.getInt(4));
				sawonVO.setIndate(rs.getString(5));
				list.add(sawonVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return list;
	}

	public int sawonInsert(SawonVO sawonVO) {
		String sql = "insert into sawon values(?,?,?,?,sysdate)";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sawonVO.getSno());
			pstmt.setString(2, sawonVO.getName());
			pstmt.setString(3, sawonVO.getTel());
			pstmt.setInt(4, sawonVO.getPay());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return row;
	}

	public int sawonRevise(String tell, int sno) {
		String sql = "update sawon set tel=? where sno=" + sno;
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tell);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return row;
	}

	public int sawonRevise2(int pay, int sno) {
		String sql = "update sawon set pay=? where sno=" + sno;
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pay);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return row;
	}

	public int sawonDelete(int sno) {
		String sql = "delete sawon where sno=" + sno;
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return row;
	}

	public List<SawonVO> sawonSearch(int sno) {
		List<SawonVO> list = new ArrayList<SawonVO>();
		String sql = "select * from sawon where sno=" + sno;
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				sawonVO = new SawonVO();
				sawonVO.setSno(rs.getInt(1));
				sawonVO.setName(rs.getString(2));
				sawonVO.setTel(rs.getString(3));
				sawonVO.setPay(rs.getInt(4));
				sawonVO.setIndate(rs.getString(5));
				list.add(sawonVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return list;
	}
}
