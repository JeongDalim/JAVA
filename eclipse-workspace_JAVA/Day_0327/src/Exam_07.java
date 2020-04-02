import java.util.Scanner;

public class Exam_07 {
	static int minScore(int a, int b, int c) {
		int min = 0;
		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = a;
		} else if (c < a && c < b) {
			min = c;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 1 =");
		int num1 = scn.nextInt();
		System.out.print("정수 2 =");
		int num2 = scn.nextInt();
		System.out.print("정수 3 =");
		int num3 = scn.nextInt();
		int min = minScore(num1, num2, num3);
		System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + min);
		scn.close();
	}
}
