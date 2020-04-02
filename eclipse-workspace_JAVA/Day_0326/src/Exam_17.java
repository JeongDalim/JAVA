import java.util.Scanner;

public class Exam_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.print("입력: ");
			int a = scn.nextInt();
			if (a == 0) {
				System.out.println("i=" + i);
				System.exit(1); //break와의 차이= break는 조건문을 종료하고 조건문 밑에 코드를 실행. exit는 전체프로그램을 종료.
			} else {
				i++;
			}
			scn.close();
		}
	}

}
