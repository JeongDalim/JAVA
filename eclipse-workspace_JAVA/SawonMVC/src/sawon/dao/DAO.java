package sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sawon.db.DB;
import sawon.vo.VO;

public class DAO {
	DB db = new DB();
	List<VO> list = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Connection conn = null;
	VO vo = null;

	public List<VO> List() {
		list = new ArrayList<VO>();
		String sql = "select eno,ename,job,manager,hiredate,salary,commission,dname from employee e,department d where e.dno=d.dno";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setEno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setManager(rs.getInt(4));
				vo.setHiredate(rs.getString(5));
				vo.setSalary(rs.getInt(6));
				vo.setCommission(rs.getInt(7));
				vo.setDname(rs.getString(8));
				list.add(vo);
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

	public int insert(VO vo) {
		int result = 0;
		try {
			String sql = "insert into employee values (employee_dno_seq.nextval,?,?,?," + vo.getHiredate() + ",?,?,?)";
			try {
				conn = db.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, vo.getEname());
				pstmt.setString(2, vo.getJob());
				pstmt.setInt(3, vo.getManager());
				pstmt.setInt(4, vo.getSalary());
				pstmt.setInt(5, vo.getCommission());
				pstmt.setInt(6, vo.getDno());
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
		} catch (Exception e) {

		}
		return result;
	}

	public List<VO> search(String ename) {
		String sql = "select * from employee where ename='" + ename + "'";
		list = new ArrayList<VO>();
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setEno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setManager(rs.getInt(4));
				vo.setHiredate(rs.getString(5));
				vo.setSalary(rs.getInt(6));
				vo.setCommission(rs.getInt(7));
				vo.setDname(rs.getString(8));
				list.add(vo);
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

	public List<VO> search(int eno) {
		String sql = "select * from employee where eno=" + eno;
		list = new ArrayList<VO>();
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				vo = new VO();
				vo.setEno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setManager(rs.getInt(4));
				vo.setHiredate(rs.getString(5));
				vo.setSalary(rs.getInt(6));
				vo.setCommission(rs.getInt(7));
				vo.setDname(rs.getString(8));
				list.add(vo);
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

	public int modify(List<VO> list) {
		String sql = "update employee set ename=?,job=?,manager=?,hiredate=?,salary=?,commission=?,dno=? where eno="
				+ list.get(0).getEno();
		int result = 0;
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, list.get(0).getEname());
			pstmt.setString(2, list.get(0).getJob());
			pstmt.setInt(3, list.get(0).getManager());
			pstmt.setString(4, list.get(0).getHiredate());
			pstmt.setInt(5, list.get(0).getSalary());
			pstmt.setInt(6, list.get(0).getCommission());
			pstmt.setInt(7, list.get(0).getDno());
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
