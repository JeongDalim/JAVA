package oracle.main;

import oracle.dao.DeptDAO;

public class DeptMain_01 {
	public static void main(String[] args) throws Exception {
		DeptDAO dept = new DeptDAO();
		dept.deptList();
	}
}
