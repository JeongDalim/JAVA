package main;

import java.util.Scanner;

import ui.UI;

public class Main {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("=============================");
			System.out.println("==   ������ ���α׷� Ver 1.0   ==");
			System.out.println("=============================");
			System.out.println("\t[1]�� ��ü ���");
			System.out.println("\t[2]�ű� �� ���");
			System.out.println("\t[3]�� �˻�");
			System.out.println("\t[4]�� ���� ����");
			System.out.println("\t[5]�� ���� ����");
			System.out.println("\t[6]���α׷� ����");
			System.out.println("-----------------------------");
			System.out.println("�ش��׸��� �����ϼ��� ? _");
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
				System.err.println("�ٽ��Է����ּ���");
			}
		}
		scn.close();
	}
}
