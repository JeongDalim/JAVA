import java.util.Scanner;

public class Exam_06 {
	static void menu1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void menu2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void menu3() {
		for (int i = 1; i <= 5; i++) {
			for (int z = 1; z <= 5 - i; z++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void menu4() {
		for (int i = 1; i <= 4; i++) {
			for (int z = 1; z <= 4-i; z++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	static void menu5() {
		for (int i = 4; i <= 1; i--) {
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print('*');
			}for(int z=0; z<=i-4; z--) {
				System.out.print(' ');
			}
			System.out.println();
		}
	}

	static void menu6() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j <= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("[1] 정사각형을 출력하시오");
			System.out.println("[2] 좌 직각삼각형을 출력하시오");
			System.out.println("[3] 우 직각삼각형을 출력하시오");
			System.out.println("[4] 정삼각형을 출력하시오");
			System.out.println("[5] 역 정삼각형을 출력하시오");
			System.out.println("[0] 종료 ");
			int menu = scn.nextInt();
			if (menu == 1) {
				menu1();
			} else if (menu == 2) {
				menu2();
			} else if (menu == 3) {
				menu3();
			} else if (menu == 4) {
				menu4();
			} else if (menu == 5) {
				menu5();
			} else if (menu == 6) {
				menu6();
			} else if (menu == 0) {
				break;
			}
			scn.close();
		}

	}
}
