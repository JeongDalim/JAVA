import java.util.Scanner;

public class Exam_06 {
	static String score(int var) {
		String result = ""; // �Ǵ� String s= null; ���ڿ� ������ �ʱ�ȭ �����ִ� �����̴�.
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
		System.out.print("���� �Է�= ");
		int num = scn.nextInt();
		String num2 = score(num);
		System.out.println(num2);
		scn.close();
	}
}
