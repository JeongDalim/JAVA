package member.main;

import java.util.Scanner;

import member.action.Action;
import member.action.MemberDeleteAction;
import member.action.MemberInsertAction;
import member.action.MemberListAction;
import member.action.MemberModifyAction;
import member.action.MemberSearchAction;
import member.controller.MemberController;

public class MemberMain {
	public static void main(String[] args) {
		MemberController mc = new MemberController();
		Scanner scn = new Scanner(System.in);
		boolean isStop = false;
		do {
			System.out.println("==ȸ���������α׷�==");
			System.out.println("[1] ��ü ȸ�� ����");
			System.out.println("[2] ȸ ��      �� ��");
			System.out.println("[3] ȸ ��      �� ��");
			System.out.println("[4] ȸ�� ���� ����");
			System.out.println("[5] ȸ�� ���� ����");
			System.out.println("[6] ���α׷�  ����");
			System.out.print("�޴� ���� [1]~[6] : ");
			String menu = scn.nextLine();
			Action action = null;
			switch (menu) {
			case "1":
				action = new MemberListAction();
				break;
			case "2":
				action = new MemberInsertAction();
				break;
			case "3":
				action = new MemberSearchAction();
				break;
			case "4":
				action = new MemberModifyAction();
				break;
			case "5":
				action = new MemberDeleteAction();
				break;
			case "6":
				isStop = true;
				break;
			default:
				System.err.println("[1]~[6] �޴��� ���� �����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				break;
			}
			if (action != null) {
				mc.processRequest(action, scn);
			}
		} while (!isStop);
		{
			System.out.println("���α׷��� �����մϴ�.");
		}
		scn.close();
	}
}
