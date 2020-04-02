import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = scn.nextInt();
		int jinsu = scn.nextInt();
		if (jinsu == 2) {
			System.out.println(Integer.toBinaryString(num));
		} else if (jinsu == 8) {
			System.out.println(Integer.toOctalString(num));
		} else if (jinsu == 16) {
			System.out.println(Integer.toHexString(num));
		} else {
			System.err.println("진수 형식이 틀렸습니다.");
		}
		scn.close();
	}
}
