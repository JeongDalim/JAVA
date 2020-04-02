package joinexam.main;

import java.util.Scanner;

import joinexam.ui.UI;

public class Main {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("[메인]");
			System.out.println("====회원관리프로그램  Ver.1.03====");
			System.out.println("[1] 회원 목록 보기");
			System.out.println("[2] 회원 정보 등록");
			System.out.println("[3] 로그인");
			System.out.println("[4] 회원 정보 검색");
			System.out.println("[5] 회원 정보 수정");
			System.out.println("[6] 회원 정보 삭제");
			System.out.println("[7] 종료");
			System.out.print("메뉴선택([1]~[7]): ");
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
				System.out.println("프로그램을 종료합니다.");
				scn.close();
				System.exit(0);
			} else {
				System.err.println("올바른 입력이 아닙니다. 다시 입력해 주십시오.");
			}
		}
	}
}
