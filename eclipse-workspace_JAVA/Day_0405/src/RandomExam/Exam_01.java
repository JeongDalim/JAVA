//Math.random()�� ���������� ������ �߻������ִ� Ŭ����  Math.random()�� 0�� 1������ �Ǽ��� ������ �ݸ�, RandomŬ������ �ڷ����� ���� ������ �����Ӵ�.
package RandomExam;

import java.util.Random;

public class Exam_01 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.print("������ ���� �߻�: ");
		System.out.println(r.nextInt(10));// �Ű������� 10���� ���ָ� 10���� ���� ������ ��ȯ�Ѵ�.

		System.out.println("=======================================");
		System.out.print("������ ���� �߻� 1��: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(r.nextInt(10) + 1 + "\t");
		}
		System.out.println("=======================================");
		System.out.print("������ ���� �߻� 2��: ");
		Random r2;
		for (int i = 0; i < 10; i++) {
			r2 = new Random(i); // �Ű������� 0���� 9���� ���ָ� ������ ���� ����� �˱� �����.
			System.out.print(r2.nextInt(10) + 1 + "\t");
		}
		System.out.println("=======================================");
		System.out.print("������ ���� �߻� 3��: ");
		Random r3;
		for (int i = 0; i < 10; i++) {
			r3 = new Random(System.currentTimeMillis()); // �Ű������� �ż����ʷ� ���ָ� ������ ���� ����� �� �� ����.
			System.out.print(r3.nextInt(10) + 1 + "\t");
		}
	}
}
