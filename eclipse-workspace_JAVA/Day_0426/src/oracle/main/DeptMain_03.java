package oracle.main;

import oracle.dao.DeptDAO;

public class DeptMain_03 {
	public static void main(String[] args) throws Exception {
		DeptDAO dept = new DeptDAO();
		System.out.println("�μ���ȣ\t�μ���\t\t������");
		dept.deptList2();
	}
}
