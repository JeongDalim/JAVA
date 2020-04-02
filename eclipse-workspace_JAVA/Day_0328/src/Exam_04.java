
public class Exam_04 {
	public static void main(String[] args) {
		int sum = 0;
		int sum2=0;
		int sum3=0;
		for (int i = 1; i <= 100; i++) { // 1부터 100까지의 합
			sum += i;
			System.out.print(i + " ");
		}
		System.out.print(sum);

		System.out.println();

		for (int i = 1; i <= 100; i++) {// 1부터 100까지 홀수의 합
			if (i % 2 == 1) {
				sum2 += i;
				System.out.print(i + " ");
			}
		}
		System.out.print(sum2);
		System.out.println();

		for (int i = 1; i <= 100; i++) {// 1부터 100까지 짝수의 합
			if (i % 2 == 0) {
				sum3 += i;
				System.out.print(i + " ");
			}
		}
		System.out.print(sum3);
	}
}
