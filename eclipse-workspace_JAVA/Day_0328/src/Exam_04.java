
public class Exam_04 {
	public static void main(String[] args) {
		int sum = 0;
		int sum2=0;
		int sum3=0;
		for (int i = 1; i <= 100; i++) { // 1���� 100������ ��
			sum += i;
			System.out.print(i + " ");
		}
		System.out.print(sum);

		System.out.println();

		for (int i = 1; i <= 100; i++) {// 1���� 100���� Ȧ���� ��
			if (i % 2 == 1) {
				sum2 += i;
				System.out.print(i + " ");
			}
		}
		System.out.print(sum2);
		System.out.println();

		for (int i = 1; i <= 100; i++) {// 1���� 100���� ¦���� ��
			if (i % 2 == 0) {
				sum3 += i;
				System.out.print(i + " ");
			}
		}
		System.out.print(sum3);
	}
}
