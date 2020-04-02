package oracle.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import oracle.db.DBManager;
import oracle.vo.DepartmentVO;

public class DeptDAO {
	DBManager manager = DBManager.getInstance();
	Connection myConn = null;
	Statement stmt = null;
	ResultSet rs = null;

	// 메소드 정의
	public void deptList() throws Exception {
		String query = "select * from department where dno=10";
		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("실패");
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
			}

			if (myConn != null) {
				myConn.close();
			}
		}
	}

	// 부서테이블의 전체 목록 출력
	public void deptList2() throws Exception {
		String query = "select * from department";
		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t\t");
				System.out.print(rs.getString(3) + "\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("실패");
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
			}

			if (myConn != null) {
				myConn.close();
			}
		}
	}

	public List<DepartmentVO> deptList3() throws Exception {
		DepartmentVO dept = null;
		String query = "select * from department";
		List<DepartmentVO> list = null; // 리턴용
		try {
			dept = new DepartmentVO();
			list = new ArrayList<DepartmentVO>();
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				dept.setDno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc((rs.getString(3)));
				list.add(dept);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("실패");
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
			}

			if (myConn != null) {
				myConn.close();
			}
		}
		return list;
	}

	// 부서로 검색하기
	public ResultSet deptSelect(int dno) throws Exception {
		String query = "select * from department where dno=" + dno;
		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString(3));
			} else {
				System.out.println("존재하지 않는 부서번호입니다.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("실패");
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
			}

			if (myConn != null) {
				myConn.close();
			}
		}
		return rs;
	}

	// 부서로 검색하기2
	public DepartmentVO deptSelect2(int dno) throws Exception {
		String query = "select * from department where dno=" + dno;
		DepartmentVO dept = null;
		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				dept = new DepartmentVO();
				dept.setDno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("실패");
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
			}
			if (myConn != null) {
				myConn.close();
			}
		}
		return dept;
	}
}
