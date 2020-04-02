package oracle.main;

import java.util.Scanner;

import oracle.dao.EmployeeDAO;

public class EmployeeMain {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		System.out.print("선택(1,2): ");
		int choice = scn.nextInt();
		EmployeeDAO employee = null;
		if (choice == 1) {
			// 전체 레코드 수
			employee = new EmployeeDAO();
			try {
				System.out.println("전체 인원 수 : " + employee.employeecount());
			} catch (Exception e) {
				System.out.println("오류");
			}
		} else if (choice == 2) {
			employee = new EmployeeDAO();
			System.out.print("부서번호 입력:");
			int choice2 = scn.nextInt();
			System.out.println(employee.employeeSelect(choice2));
		} else {
			System.out.print("입력오류");
		}
		scn.close();
	}
}
