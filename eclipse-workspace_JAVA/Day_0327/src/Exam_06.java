import java.util.Scanner;

public class Exam_06 {
	static String score(int var) {
		String result = ""; // 또는 String s= null; 문자열 변수를 초기화 시켜주는 변수이다.
		if (var >= 90) {
			result = "A";
		} else if (var >= 80) {
			result = "B";
		} else if (var >= 70) {
			result = "C";
		} else if (var >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력= ");
		int num = scn.nextInt();
		String num2 = score(num);
		System.out.println(num2);
		scn.close();
	}
}
