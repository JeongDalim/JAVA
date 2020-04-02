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
			System.out.println("==회원관리프로그램==");
			System.out.println("[1] 전체 회원 정보");
			System.out.println("[2] 회 원      등 록");
			System.out.println("[3] 회 원      검 색");
			System.out.println("[4] 회원 정보 수정");
			System.out.println("[5] 회원 정보 삭제");
			System.out.println("[6] 프로그램  종료");
			System.out.print("메뉴 선택 [1]~[6] : ");
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
				System.err.println("[1]~[6] 메뉴만 선택 가능합니다. 다시 입력해 주십시오.");
				break;
			}
			if (action != null) {
				mc.processRequest(action, scn);
			}
		} while (!isStop);
		{
			System.out.println("포로그램을 종료합니다.");
		}
		scn.close();
	}
}
