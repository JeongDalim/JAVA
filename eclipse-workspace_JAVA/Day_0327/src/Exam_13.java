import java.util.Scanner;

public class Exam_13 {

	static void sum() {
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1~10의 합= " + sum);
		System.out.println();
	}

	static void odd() {
		int oddsum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				oddsum = oddsum + i;
			}
		}
		System.out.println("1~10의 짝수의 합= " + oddsum);
		System.out.println();
	}

	static void even() {
		int evensum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				evensum = evensum + i;
			}
		}
		System.out.println("1~10의 홀수의 합= " + evensum);
		System.out.println();
	}

	static void oddeven() {
		int evensum = 0;
		int oddsum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				evensum += i;
			} else {
				oddsum += i;
			}
		}
		System.out.println("1~10의 짝수의 합= " + evensum);
		System.out.println("1~10의 홀수의 합= " + oddsum);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("[1] 1~10의 합");
			System.out.println("[2] 1~10의 홀수의 합");
			System.out.println("[3] 1~10의 짝수의 합");
			System.out.println("[4] 1~10의 홀수 짝수의 합");
			System.out.println("[0] 프로그램 종료 ");
			System.out.println("메뉴선택(a1~4)");

			int menu = scn.nextInt();
			if (menu == 1) {
				sum();
			} else if (menu == 2) {
				odd();
			} else if (menu == 3) {
				even();
			} else if (menu == 4) {
				oddeven();
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력해주세요.");
			}
			scn.close();
		}
	}
}
