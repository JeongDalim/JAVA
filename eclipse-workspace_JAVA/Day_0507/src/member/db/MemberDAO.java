package member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	DBManager manager = new DBManager();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<MemberVO> list = null;
	MemberVO vo = null;

	public List<MemberVO> MemberList() {
		list = new ArrayList<MemberVO>();
		String sql = "select * from member order by id desc";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setNation(rs.getString("nation"));
				vo.setEmail(rs.getString("email"));
				vo.setRegdate(rs.getString("regdate"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.getStackTrace();
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
		return list;
	}

	public boolean MemberInsert(MemberVO vo) {
		boolean sw = false;
		String sql = "insert into member(id,name,addr,nation,email,age) values (member_id_seq.nextval,?,?,?,?,?)";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getAddr());
			pstmt.setString(3, vo.getNation());
			pstmt.setString(4, vo.getEmail());
			pstmt.setInt(5, vo.getAge());
			int result = pstmt.executeUpdate();
			if (result != 0) {
				sw = true;
			}
		} catch (Exception e) {
			e.getStackTrace();
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
		return sw;
	}

	public List<MemberVO> MemberSearch(String name) {
		list = new ArrayList<MemberVO>();
		String sql = "select * from member where name=? order by regdate";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setNation(rs.getString("nation"));
				vo.setEmail(rs.getString("email"));
				vo.setAge(rs.getInt("age"));
				vo.setRegdate(rs.getString("regdate"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.getStackTrace();
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
		return list;
	}

	public List<MemberVO> MemberSearch(int id) {
		list = new ArrayList<MemberVO>();
		String sql = "select * from member where id=? order by regdate";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setNation(rs.getString("nation"));
				vo.setEmail(rs.getString("email"));
				vo.setAge(rs.getInt("age"));
				vo.setRegdate(rs.getString("regdate"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.getStackTrace();
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
		return list;
	}

	public int MemberModify(MemberVO vo) {
		int result = 0;
		String sql = "update member set name=?,addr=?,nation=?,email=?,age=? where id=?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getAddr());
			pstmt.setString(3, vo.getNation());
			pstmt.setString(4, vo.getEmail());
			pstmt.setInt(5, vo.getAge());
			pstmt.setInt(6, vo.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
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
		return result;
	}

	public int MemberDelete(int id) {
		int result = 0;
		String sql = "delete member where id=" + id;
		try {
			conn = manager.getConnection();
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
		if (result == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		return result;
	}
}
