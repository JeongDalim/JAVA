
//���ǿ�����
import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�����Է�= ");
		int var = scn.nextInt();
		String str = (var % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(var + "�� " + str + "�Դϴ�.");

		System.out.print("�����Է�= ");
		int var2 = scn.nextInt();
		String str2 = (var2 > 70 && var < 90) ? "ok" : "no";
		System.out.println(str2);
scn.close();
	}
}
