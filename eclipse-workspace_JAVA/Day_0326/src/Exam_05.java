
//Ű���� �Է¹��2
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);// Scanner��� Ʋ�� scn�̶�� ��ĳ�ʸ� ����� main�̶�� ��ǻ�Ϳ� �� ���ذ�
		System.out.print("�����Է�: ");
		int num = scn.nextInt();// ������ �Է¹޾� num�� ����
		System.out.println("10����=" + num);
		System.out.println("2����=" + Integer.toBinaryString(num));// Ư���ϰ� ���ڿ��� �����Ѵ� �׷��Ƿ� ���� ���� �� String���� �����ؾ��Ѵ�.
		System.out.println("8����=" + Integer.toOctalString(num));// ��������
		System.out.println("16����=" + Integer.toHexString(num));// ��������

		String str = scn.next();// ���ڿ� �Է¹޾� str�� ���� ������ �������� ��. String str2 =
		System.out.println(str);
		scn.nextLine();// ���� ��ü�� �Է¹޾� str2�� ���� �ٹٲ��� �������� ��.
		scn.close();
	}
}
