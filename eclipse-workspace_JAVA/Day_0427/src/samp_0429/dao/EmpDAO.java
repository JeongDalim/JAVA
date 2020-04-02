package samp_0429.dao;

import java.sql.*;
import java.util.*;

import samp_0429.util.DBUtil;

public class EmpDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public List<EmpBean> method() throws Exception {
		List<EmpBean> list = new ArrayList<EmpBean>();
		DBUtil manager = DBUtil.getinstance();
		manager.getConnection();
		try {
			String sql = "select ename,job from employee where job=(select job from employee where eno=7788)";
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				EmpBean bean = new EmpBean();
				bean.setEname(rs.getString("ename"));
				bean.setJob(rs.getString("job"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println("실패!");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					rs.close();
				}
				if (conn != null) {
					rs.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return list;
	}

	public List<EmpBean> method2(int eno) throws Exception {
		List<EmpBean> list = new ArrayList<EmpBean>();
		DBUtil manager = DBUtil.getinstance();
		manager.getConnection();
		try {
			String sql = "select eno,ename,job,salary from employee where salary > (select salary from employee where eno="
					+ eno + ")";
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				EmpBean bean = new EmpBean();
				bean.setEno(rs.getInt("eno"));
				bean.setEname(rs.getString("ename"));
				bean.setJob(rs.getString("job"));
				bean.setSalary(rs.getInt("salary"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println("실패!");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					rs.close();
				}
				if (conn != null) {
					rs.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return list;
	}
}
