package sawonExam;

import java.util.NoSuchElementException;
import java.util.Scanner;
import sawonUI.SawonView;

public class SawonExam {
	public static void main(String[] args) throws Exception {
		SawonView sawonView = new SawonView();
		Scanner scn = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("[1]사원정보 리스트");
				System.out.println("[2]사원정보 등록");
				System.out.println("[3]사원정보 수정");
				System.out.println("[4]사원정보 삭제");
				System.out.println("[5]사원정보 검색");
				System.out.println("[6]종료");
				System.out.print("메뉴선택([1]~[6]): ");
				int menu = scn.nextInt();
				if (menu == 1) {
					sawonView.method1();
				} else if (menu == 2) {
					sawonView.method2();
				} else if (menu == 3) {
					sawonView.method3();
				} else if (menu == 4) {
					System.out.print("삭제하려는 사원번호: ");
					int sno = scn.nextInt();
					sawonView.method4(sno);
				} else if (menu == 5) {
					System.out.print("사원번호 검색: ");
					int sno = scn.nextInt();
					sawonView.method5(sno);
				} else if (menu == 6) {
					System.out.println("프로그램 종료");
					break;
				} else {
					System.err.println("\n다시입력해 주십시오.\n");
				}
			}
		} catch (NoSuchElementException e) {
		}
		scn.close();
	}
}
