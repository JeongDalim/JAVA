package joinexam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import joinexam.db.DBManager;
import joinexam.vo.VO;

public class DAO {
	VO vo = null;
	DBManager manager = new DBManager();;
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner scn = new Scanner(System.in);
	List<VO> list = null;

	public List<VO> print() { // 회원 목록 보기
		list = new ArrayList<VO>();
		String sql = "select * from join order by regdate desc";
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setUserid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setPasswd(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setRegdate(rs.getString(6));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e);
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

	public int insert(VO vo) {// 회원 정보 등록

		int result = 0;
		String sql = "insert into join values (?,?,?,?,?,sysdate)";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPasswd());
			pstmt.setString(4, vo.getEmail());
			pstmt.setInt(5, vo.getAge());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
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
		return result;
	}

	public boolean insertOverlap(String userid) {// 회원정보 등록 시 아이디 중복 검사
		boolean sw = false;
		String sql = "select userid from join where userid=?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			String id = "";
			if (rs.next()) {
				id = rs.getString("userid");
			}
			if (userid.equals(id)) {
				sw = true;
			}
		} catch (Exception e) {
			System.out.println(e);
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

			}
		}
		return sw;
	}

	public int login(String userid, String passwd) {// 로그인
		int result = 0; // 아이디오류
		String sql = "select userid, passwd from join where userid= ?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			String id = "";
			String pw = "";
			if (rs.next()) {
				id = rs.getString("userid");
				pw = rs.getString("passwd");
			}
			if (userid.equals(id)) {
				if (passwd.equals(pw)) {
					result = 1; // 로그인성공
				} else {
					result = -1; // 비밀번호 오류
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return result;
	}

	public List<VO> search1(String option2) {// 회원 정보 검색(userid)
		List<VO> list = new ArrayList<VO>();
		String sql = "select * from join where userid='" + option2 + "'";
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setUserid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setPasswd(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setAge(rs.getInt(5));
				vo.setRegdate(rs.getString(6));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e);
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

	public List<VO> search2(String option2) {// 회원 정보 검색(name)
		String sql = "select * from join where name='" + option2 + "'";
		list = new ArrayList<VO>();
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setUserid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setPasswd(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setAge(rs.getInt(5));
				vo.setRegdate(rs.getString(6));
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e);
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

	public int modify(VO vo) {// 회원 정보 수정
		int result = 0;
		String sql = "update join set name=?,passwd=?,email=?,age=? where userid='" + vo.getUserid() + "'";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPasswd());
			pstmt.setString(3, vo.getEmail());
			pstmt.setInt(4, vo.getAge());
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
				System.err.println(e);
			}
		}
		return result;
	}

	public int delete(String userid) {// 회원 정보 삭제
		int result = 0;
		String sql = "delete join where userid='" + userid + "'";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return result;
	}
}
