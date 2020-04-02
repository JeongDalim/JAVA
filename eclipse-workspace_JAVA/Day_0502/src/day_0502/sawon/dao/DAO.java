package day_0502.sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import day_0502.sawon.db.DB;
import day_0502.sawon.vo.DEPTVO;
import day_0502.sawon.vo.EMPVO;

public class DAO {
	DB db = new DB();
	List<EMPVO> list = null;
	List<DEPTVO> list2 = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Connection conn = null;
	EMPVO empvo = null;
	DEPTVO deptvo = null;

	public List<EMPVO> print() {
		list = new ArrayList<EMPVO>();
		String sql = "select eno,ename,job,manager,hiredate,salary,commission,dname from employee e,department d where e.dno=d.dno";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				empvo = new EMPVO();
				empvo.setEno(rs.getInt(1));
				empvo.setEname(rs.getString(2));
				empvo.setJob(rs.getString(3));
				empvo.setManager(rs.getInt(4));
				empvo.setHiredate(rs.getString(5));
				empvo.setSalary(rs.getInt(6));
				empvo.setCommission(rs.getInt(7));
				empvo.setDname(rs.getString(8));
				list.add(empvo);
			}
		} catch (Exception e) {
			System.err.println("Äõ¸®¹® ¿¡·¯");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}

	public List<DEPTVO> print2() {
		list2 = new ArrayList<DEPTVO>();
		String sql = "select * from department";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				deptvo.setDno(rs.getInt(1));
				deptvo.setDname(rs.getString(2));
				deptvo.setLoc(rs.getString(3));
				list2.add(deptvo);
			}
		} catch (Exception e) {
			System.err.println("Äõ¸®¹® ¿¡·¯");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return list2;
	}

	public int insert(String ename, String job, int manager, String hiredate, int salary, int commission, int dno) {
		String sql = "insert into employee values (employee_dno_seq.nextval,?,?,?," + hiredate + ",?,?,?)";
		int result = 0;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, manager);
			pstmt.setInt(4, salary);
			pstmt.setInt(5, commission);
			pstmt.setInt(6, dno);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("Äõ¸®¹® ¿¡·¯");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		return result;
	}

	public List<EMPVO> search(String ename) {
		String sql = "select * from employee where ename='" + ename + "'";
		list = new ArrayList<EMPVO>();
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				empvo = new EMPVO();
				empvo.setEno(rs.getInt(1));
				empvo.setEname(rs.getString(2));
				empvo.setJob(rs.getString(3));
				empvo.setManager(rs.getInt(4));
				empvo.setHiredate(rs.getString(5));
				empvo.setSalary(rs.getInt(6));
				empvo.setCommission(rs.getInt(7));
				empvo.setDname(rs.getString(8));
				list.add(empvo);
			}
		} catch (Exception e) {
			System.err.println("Äõ¸®¹® ¿¡·¯");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}

	public List<EMPVO> search(int eno) {
		String sql = "select * from employee where eno=" + eno;
		list = new ArrayList<EMPVO>();
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				empvo = new EMPVO();
				empvo.setEno(rs.getInt(1));
				empvo.setEname(rs.getString(2));
				empvo.setJob(rs.getString(3));
				empvo.setManager(rs.getInt(4));
				empvo.setHiredate(rs.getString(5));
				empvo.setSalary(rs.getInt(6));
				empvo.setCommission(rs.getInt(7));
				empvo.setDname(rs.getString(8));
				list.add(empvo);
			}
		} catch (Exception e) {
			System.err.println("Äõ¸®¹® ¿¡·¯");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}

	public int modify(int eno, String ename, String job, int manager, String hiredate, int salary, int commission,
			int dno) {
		String sql = "update employee set ename=?,job=?,manager=?,hiredate=?,salary=?,commission=?,dno=? where eno="
				+ eno;
		int result = 0;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, manager);
			pstmt.setString(4, hiredate);
			pstmt.setInt(5, salary);
			pstmt.setInt(6, commission);
			pstmt.setInt(7, dno);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("Äõ¸®¹® ¿¡·¯");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		return result;
	}

	public int delete(int eno) {
		String sql = "delete employee where eno=" + eno;
		int result = 0;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("Äõ¸®¹® ¿¡·¯");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		return result;
	}
}
