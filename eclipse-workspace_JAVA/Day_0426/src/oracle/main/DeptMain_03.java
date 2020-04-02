package oracle.main;

import oracle.dao.DeptDAO;

public class DeptMain_03 {
	public static void main(String[] args) throws Exception {
		DeptDAO dept = new DeptDAO();
		System.out.println("부서번호\t부서명\t\t지역명");
		dept.deptList2();
	}
}
