import java.util.Scanner;

public class Exam_08 {

	static void method(int s) {
		int cnt = 0;
		for (int m = 2; m <= s; m++) {// 2서부터 s까지 확인용 for문
			for (int i = 2; i <= m; i++) { // 소수확인용for문
				if (m % i == 0) { // m을 i로 나누면 0인가?
					if (m == i) {// m이 i와 같은가?
						System.out.print(i + "\t"); // 위의 두 조건을 만족하면 소수이기때문에 출력
						cnt++; // 소수갯수 +1
						if (cnt % 5 == 0) { // 소수갯수를 5개마다
							System.out.println();// 줄바꿈을 해준다
						}
					}
					break;// m을 i로 나누면 0이 아닐경우 조건문을 빠져나온다
				}
			}
		}
		System.out.println("\n소수 개수 :" + cnt);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하시오= ");
		int num = scn.nextInt();
		method(num);
		scn.close();
	}
}
