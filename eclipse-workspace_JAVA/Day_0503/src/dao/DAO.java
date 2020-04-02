package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import VO.VO;
import db.DB;

public class DAO {
	VO vo = null;
	DB db = new DB();
	List<VO> list = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public int Insert(String name, String tel, String part, String birthday) {
		int result = 0;
		String sql = "insert into teacher values(teacher_tno_seq.nextval,?,?,?,?,sysdate)";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, part);
			pstmt.setString(4, birthday);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
		return result;
	}

	public List<VO> print() {
		String sql = "select * from teacher";
		list = new ArrayList<VO>();
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setTno(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setTel(rs.getString(3));
				vo.setPart(rs.getString(4));
				vo.setBirthday(rs.getString(5));
				vo.setRegdate(rs.getString(6));
				list.add(vo);
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
		return list;
	}

	public List<VO> search(int tno) {

		String sql = "select * from teacher where tno=" + tno;
		list = new ArrayList<VO>();
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setTno(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setTel(rs.getString(3));
				vo.setPart(rs.getString(4));
				vo.setBirthday(rs.getString(5));
				vo.setRegdate(rs.getString(6));
				list.add(vo);
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
		return list;
	}

	public int modify(int tno, String name, String tel, String part, String birthday) {
		int result = 0;
		String sql = "update teacher set name=?,tel=?,part=?,birthday=? where tno=" + tno;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, part);
			pstmt.setString(4, birthday);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
		return result;
	}

	public int delete(int tno) {
		int result = 0;
		String sql = "delete teacher where tno=" + tno;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
		return result;
	}
}
