package main;

import java.util.Scanner;

import ui.UI;

public class Main {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("       ����������");
			System.out.println("[1]���");
			System.out.println("[2]��ü���");
			System.out.println("[3]�˻�");
			System.out.println("[4]����");
			System.out.println("[5]����");
			System.out.println("[6]����");
			System.out.print("�޴�����([1]~[6]): ");
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
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.err.println("���Է�");
			}
		}
		scn.close();
	}
}
