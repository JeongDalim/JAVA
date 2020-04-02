//for���� while��,dowhile��
public class Exam_01 {
	static void forTest() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.print(i);
		}
		System.out.println("for�� " + sum);
	}

	static void whileTest() {
		int sum = 0;
		int i = 0;
		while (true) {
			i++;
			System.out.print(i);
			sum = sum + i;
			if (i == 10) {
				break;
			}
		}
		System.out.println("while�� " + sum);
	}

	static void dowhileTest() {
		int sum = 0;
		int i = 0;
		do {
			i++;
			System.out.print(i);
			sum = sum + i;
		} while (i < 10);
		System.out.println("do while��" + sum);
	}

	public static void main(String[] args) {
		forTest();
		whileTest();
		dowhileTest();
	}
}
