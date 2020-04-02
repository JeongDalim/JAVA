package oracle.main;

import java.util.Scanner;

import oracle.dao.EmployeeDAO;

public class EmployeeMain {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		System.out.print("����(1,2): ");
		int choice = scn.nextInt();
		EmployeeDAO employee = null;
		if (choice == 1) {
			// ��ü ���ڵ� ��
			employee = new EmployeeDAO();
			try {
				System.out.println("��ü �ο� �� : " + employee.employeecount());
			} catch (Exception e) {
				System.out.println("����");
			}
		} else if (choice == 2) {
			employee = new EmployeeDAO();
			System.out.print("�μ���ȣ �Է�:");
			int choice2 = scn.nextInt();
			System.out.println(employee.employeeSelect(choice2));
		} else {
			System.out.print("�Է¿���");
		}
		scn.close();
	}
}
