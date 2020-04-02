package oracle.main;

import java.util.Scanner;

import oracle.dao.DeptDAO;
import oracle.vo.DepartmentVO;

public class DeptMain_02 {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		System.out.print("부서번호 입력: ");
		int dno = scn.nextInt();
		DeptDAO dept = new DeptDAO();
		dept.deptSelect(dno);
		System.out.println("==================================");
		DepartmentVO vo = dept.deptSelect2(dno);
		if (vo != null) {
			System.out.println(vo.getDno() + "\t" + vo.getDname() + "\t" + vo.getLoc());
		} else {
			System.out.println("존재하지 않는 부서번호입니다.");
		}
		scn.close();
	}
}
