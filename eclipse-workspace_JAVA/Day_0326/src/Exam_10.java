
//조건연산자
import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력= ");
		int var = scn.nextInt();
		String str = (var % 2 == 0) ? "짝수" : "홀수";
		System.out.println(var + "는 " + str + "입니다.");

		System.out.print("정수입력= ");
		int var2 = scn.nextInt();
		String str2 = (var2 > 70 && var < 90) ? "ok" : "no";
		System.out.println(str2);
scn.close();
	}
}
