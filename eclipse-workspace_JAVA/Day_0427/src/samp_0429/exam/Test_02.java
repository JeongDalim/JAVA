package samp_0429.exam;

import java.util.List;
import java.util.Scanner;

import samp_0429.dao.EmpBean;
import samp_0429.dao.EmpDAO;

public class Test_02 {
	public static void main(String[] args) throws Exception {
		EmpDAO emp = new EmpDAO();
		Scanner scn = new Scanner(System.in);
		System.out.print("사원번호입력: ");
		int eno = scn.nextInt();
		List<EmpBean> list = emp.method2(eno);
		System.out.println("Eno\t\tEname\t\tJob\t\tSalary");
		System.out.println("============================================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t\t");
			System.out.print(list.get(i).getEname() + "\t\t");
			System.out.print(list.get(i).getJob() + "\t\t");
			System.out.println(list.get(i).getSalary());
		}
		scn.close();
	}
}
