
public class Exam_05 {

	static void multiFor() {
		for (int i = 1; i <= 25; i++) {
			System.out.print("*  ");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		multiFor();
		System.out.println();
		for (int i = 1; i <= 5; i++) { // ���� �޼ҵ�� ����� ������ ������ �ٸ���. ����for���� ������������ ��������� �ִ�.
			for (int j = 1; j <= 5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
