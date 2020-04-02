//Math.random()과 마찬가지로 난수를 발생시켜주는 클래스  Math.random()는 0과 1사이의 실수만 나오는 반면, Random클래스는 자료형에 따라 범위가 자유롭다.
package RandomExam;

import java.util.Random;

public class Exam_01 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.print("임의의 난수 발생: ");
		System.out.println(r.nextInt(10));// 매개변수를 10으로 해주면 10보다 작은 난수를 반환한다.

		System.out.println("=======================================");
		System.out.print("임의의 난수 발생 1번: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(r.nextInt(10) + 1 + "\t");
		}
		System.out.println("=======================================");
		System.out.print("임의의 난수 발생 2번: ");
		Random r2;
		for (int i = 0; i < 10; i++) {
			r2 = new Random(i); // 매개변수를 0부터 9까지 해주면 다음에 나올 결과를 알기 힘들다.
			System.out.print(r2.nextInt(10) + 1 + "\t");
		}
		System.out.println("=======================================");
		System.out.print("임의의 난수 발생 3번: ");
		Random r3;
		for (int i = 0; i < 10; i++) {
			r3 = new Random(System.currentTimeMillis()); // 매개변수를 매순매초로 해주면 다음에 나올 결과를 알 수 없다.
			System.out.print(r3.nextInt(10) + 1 + "\t");
		}
	}
}
