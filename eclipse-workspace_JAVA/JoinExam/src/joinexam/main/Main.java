package joinexam.main;

import java.util.Scanner;

import joinexam.ui.UI;

public class Main {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("[����]");
			System.out.println("====ȸ���������α׷�  Ver.1.03====");
			System.out.println("[1] ȸ�� ��� ����");
			System.out.println("[2] ȸ�� ���� ���");
			System.out.println("[3] �α���");
			System.out.println("[4] ȸ�� ���� �˻�");
			System.out.println("[5] ȸ�� ���� ����");
			System.out.println("[6] ȸ�� ���� ����");
			System.out.println("[7] ����");
			System.out.print("�޴�����([1]~[7]): ");
			String menu = scn.nextLine();
			if (menu.equals("1")) {
				ui.method1();
			} else if (menu.equals("2")) {
				ui.method2();
			} else if (menu.equals("3")) {
				ui.method3();
			} else if (menu.equals("4")) {
				ui.method4();
			} else if (menu.equals("5")) {
				ui.method5();
			} else if (menu.equals("6")) {
				ui.method6();
			} else if (menu.equals("7")) {
				System.out.println("���α׷��� �����մϴ�.");
				scn.close();
				System.exit(0);
			} else {
				System.err.println("�ùٸ� �Է��� �ƴմϴ�. �ٽ� �Է��� �ֽʽÿ�.");
			}
		}
	}
}
