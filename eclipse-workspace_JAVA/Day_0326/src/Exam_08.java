import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수=");
		int num10 = scn.nextInt();
		String str4 = Integer.toBinaryString(num10);
		/*System.out.print("2진수=");
		int num2 = scn.nextInt();
		String str = Integer.toBinaryString(num2);*/
		System.out.print("8진수=");
		int num8 = scn.nextInt();
		String str2 = Integer.toBinaryString(num8);
	/*	System.out.print("16진수=");
		int num16 = scn.nextInt();
		String str3 = Integer.toOctalString(num16);*/
		System.out.println("10진수" + num10 + "는 2진수 " + str4);
		/*System.out.println("2진수" + num2 + "는 10진수 " + str);*/
		System.out.println("8진수 " + num8 + "는 2진수 " + str2);
		/*System.out.println("16진수 " + num16 + " 8진수 " + str3);*/
		scn.close();
	}
}
