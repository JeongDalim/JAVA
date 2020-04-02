package main;

import java.util.Scanner;

import ui.UI;

public class Main {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("=============================");
			System.out.println("==   고객관리 프로그램 Ver 1.0   ==");
			System.out.println("=============================");
			System.out.println("\t[1]고객 전체 목록");
			System.out.println("\t[2]신규 고객 등록");
			System.out.println("\t[3]고객 검색");
			System.out.println("\t[4]고객 정보 수정");
			System.out.println("\t[5]고객 정보 삭제");
			System.out.println("\t[6]프로그램 종료");
			System.out.println("-----------------------------");
			System.out.println("해당항목을 선택하세요 ? _");
			System.out.println("=============================");
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
				break;
			} else {
				System.err.println("다시입력해주세요");
			}
		}
		scn.close();
	}
}
