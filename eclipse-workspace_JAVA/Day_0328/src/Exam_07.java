import java.util.Scanner;

public class Exam_07 {

	static String method(int su) {
		String message = "";
		for (int i = 2; 2 <= su; i++) {
			if (su % i == 0) {
				if (su == i) {
					message = "�Ҽ��Դϴ�.";
				} else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}
				break;
			}
		}
		return message;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�= ");
		int num = scn.nextInt();
		String str = method(num);
		System.out.println(str);
		scn.close();
	}
}
