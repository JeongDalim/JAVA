
//Scanner Ŭ����
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("��ȣ: ");
		int var = scn.nextInt(); // <-�����Է�(�ڷ���)
		System.out.print("����: ");
		int var2 = scn.nextInt(); // <-�����Է�(�ڷ���)
		System.out.print("�̸�: ");
		String str = scn.next(); // <-���ڿ��Է�
		System.out.println(var + "\t" + var2 + "\t" + str);
		String str2 = scn.nextLine(); // <-���� ��ü �Է�
		System.out.println(str2);
		scn.close();
	}
}
