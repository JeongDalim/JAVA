import java.util.Scanner;

public class Exam_07 {

	static String method(int su) {
		String message = "";
		for (int i = 2; 2 <= su; i++) {
			if (su % i == 0) {
				if (su == i) {
					message = "소수입니다.";
				} else {
					System.out.println("소수가 아닙니다.");
				}
				break;
			}
		}
		return message;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하시오= ");
		int num = scn.nextInt();
		String str = method(num);
		System.out.println(str);
		scn.close();
	}
}
