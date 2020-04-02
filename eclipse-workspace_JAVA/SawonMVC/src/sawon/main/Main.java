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
			System.out.println("==   사원관리 프로그램 Ver 1.0   ==");
			System.out.println("=============================");
			System.out.println("\t[1]사원 전체 목록");
			System.out.println("\t[2]신규 사원 등록");
			System.out.println("\t[3]사원 검색");
			System.out.println("\t[4]사원 정보 수정");
			System.out.println("\t[5]사원 정보 삭제");
			System.out.println("\t[6]프로그램 종료");
			System.out.println("-----------------------------");
			System.out.println("해당항목을 선택하세요 ? _");
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
				System.err.println("해당번호가 없음");
			}
			if (action != null) {
				c.processRequest(action, scn);
			}
			if (sw) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		scn.close();
	}
}
