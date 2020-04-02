package sawon.main;

import java.util.Scanner;

import sawon.action.Action;
import sawon.action.SawonDeleteAction;
import sawon.action.SawonInsertAction;
import sawon.action.SawonListAction;
import sawon.action.SawonModifyAction;
import sawon.action.SawonSearchAction;
import sawon.controller.Controller;

public class Main {
	public static void main(String[] args) {
		boolean sw = false;
		Controller c = new Controller();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("=============================");
			System.out.println("==   ������� ���α׷� Ver 1.0   ==");
			System.out.println("=============================");
			System.out.println("\t[1]��� ��ü ���");
			System.out.println("\t[2]�ű� ��� ���");
			System.out.println("\t[3]��� �˻�");
			System.out.println("\t[4]��� ���� ����");
			System.out.println("\t[5]��� ���� ����");
			System.out.println("\t[6]���α׷� ����");
			System.out.println("-----------------------------");
			System.out.println("�ش��׸��� �����ϼ��� ? _");
			System.out.println("=============================");
			int menu = scn.nextInt();
			Action action = null;
			if (menu == 1) {
				action = new SawonListAction();
			} else if (menu == 2) {
				action = new SawonInsertAction();
			} else if (menu == 3) {
				action = new SawonSearchAction();
			} else if (menu == 4) {
				action = new SawonModifyAction();
			} else if (menu == 5) {
				action = new SawonDeleteAction();
			} else if (menu == 6) {
				sw = true;
				break;
			} else {
				System.err.println("�ش��ȣ�� ����");
			}
			if (action != null) {
				c.processRequest(action, scn);
			}
			if (sw) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		scn.close();
	}
}
