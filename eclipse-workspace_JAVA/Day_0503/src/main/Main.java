package main;

import java.util.Scanner;

import ui.UI;

public class Main {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("       교직원관리");
			System.out.println("[1]등록");
			System.out.println("[2]전체목록");
			System.out.println("[3]검색");
			System.out.println("[4]수정");
			System.out.println("[5]삭제");
			System.out.println("[6]종료");
			System.out.print("메뉴선택([1]~[6]): ");
			int menu = scn.nextInt();
			if (menu == 1) {
				ui.method1();
			} else if (menu == 2) {
				ui.method2();
			} else if (menu == 3) {
				ui.method3();
			} else if (menu == 4) {
				ui.method4();
			} else if (menu == 5) {
				ui.method5();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.err.println("재입력");
			}
		}
		scn.close();
	}
}
