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
				System.out.println("[1]������� ����Ʈ");
				System.out.println("[2]������� ���");
				System.out.println("[3]������� ����");
				System.out.println("[4]������� ����");
				System.out.println("[5]������� �˻�");
				System.out.println("[6]����");
				System.out.print("�޴�����([1]~[6]): ");
				int menu = scn.nextInt();
				if (menu == 1) {
					sawonView.method1();
				} else if (menu == 2) {
					sawonView.method2();
				} else if (menu == 3) {
					sawonView.method3();
				} else if (menu == 4) {
					System.out.print("�����Ϸ��� �����ȣ: ");
					int sno = scn.nextInt();
					sawonView.method4(sno);
				} else if (menu == 5) {
					System.out.print("�����ȣ �˻�: ");
					int sno = scn.nextInt();
					sawonView.method5(sno);
				} else if (menu == 6) {
					System.out.println("���α׷� ����");
					break;
				} else {
					System.err.println("\n�ٽ��Է��� �ֽʽÿ�.\n");
				}
			}
		} catch (NoSuchElementException e) {
		}
		scn.close();
	}
}
