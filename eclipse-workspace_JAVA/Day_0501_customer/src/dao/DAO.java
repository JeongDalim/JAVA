package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import vo.VO;

public class DAO {

	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	VO vo = null;
	DB db = new DB();
	List<VO> list = null;

	public List<VO> print() {
		list = new ArrayList<VO>();
		String sql = "select * from customer";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setNum(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setTel(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setOffice(rs.getString(5));
				vo.setBirthday(rs.getString(6));
				vo.setSex(rs.getString(7));
				vo.setIndate(rs.getString(8));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e);
			e.getStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
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

	public int insert(VO vo) {
		int result = 0;
		String sql = "insert into customer values(?,?,?,?,?,?,?,sysdate)";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getTel());
			pstmt.setString(4, vo.getAddr());
			pstmt.setString(5, vo.getOffice());
			pstmt.setString(6, vo.getBirthday());
			pstmt.setString(7, vo.getSex());
			result = pstmt.executeUpdate();
		} catch (Exception e) {

			System.out.println(e);
			e.getStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				System.out.println(e);
				e.getStackTrace();
			}
		}
		return result;
	}

	public VO search(String name) {
		String sql = "select * from customer where name='" + name + "'";
		vo = null;
		try {
			conn = db.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setNum(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setTel(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setOffice(rs.getString(5));
				vo.setBirthday(rs.getString(6));
				vo.setSex(rs.getString(7));
				vo.setIndate(rs.getString(8));
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return vo;
	}

	public VO search(int num) {
		String sql = "select * from customer where num='" + num;
		vo = null;
		try {
			conn = db.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setNum(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setTel(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setOffice(rs.getString(5));
				vo.setBirthday(rs.getString(6));
				vo.setSex(rs.getString(7));
				vo.setIndate(rs.getString(8));
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return vo;
	}

	public VO search2(int num) {
		String sql = "select * from customer where num=" + num;
		vo = null;
		try {
			conn = db.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setNum(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setTel(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setOffice(rs.getString(5));
				vo.setBirthday(rs.getString(6));
				vo.setSex(rs.getString(7));
				vo.setIndate(rs.getString(8));
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		return vo;
	}

	public int modify(int num, String tel) {
		int result = 0;
		String sql = "update customer set tel=? where num=" + num;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tel);
			result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
				System.out.println(e);
			}
		}
		return result;
	}

	public int modify2(int num, String office) {
		int result = 0;
		String sql = "update customer set office=? where num=" + num;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, office);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
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
		return result;
	}

	public int delete(int num) {
		int result = 0;
		String sql = "delete customer where num=" + num;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
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
		return result;
	}
}
