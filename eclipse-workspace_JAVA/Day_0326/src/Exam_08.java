import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10����=");
		int num10 = scn.nextInt();
		String str4 = Integer.toBinaryString(num10);
		/*System.out.print("2����=");
		int num2 = scn.nextInt();
		String str = Integer.toBinaryString(num2);*/
		System.out.print("8����=");
		int num8 = scn.nextInt();
		String str2 = Integer.toBinaryString(num8);
	/*	System.out.print("16����=");
		int num16 = scn.nextInt();
		String str3 = Integer.toOctalString(num16);*/
		System.out.println("10����" + num10 + "�� 2���� " + str4);
		/*System.out.println("2����" + num2 + "�� 10���� " + str);*/
		System.out.println("8���� " + num8 + "�� 2���� " + str2);
		/*System.out.println("16���� " + num16 + " 8���� " + str3);*/
		scn.close();
	}
}
