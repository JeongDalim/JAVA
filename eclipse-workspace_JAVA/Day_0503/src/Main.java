import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = scn.nextInt();
		int jinsu = scn.nextInt();
		if (jinsu == 2) {
			System.out.println(Integer.toBinaryString(num));
		} else if (jinsu == 8) {
			System.out.println(Integer.toOctalString(num));
		} else if (jinsu == 16) {
			System.out.println(Integer.toHexString(num));
		} else {
			System.err.println("���� ������ Ʋ�Ƚ��ϴ�.");
		}
		scn.close();
	}
}
