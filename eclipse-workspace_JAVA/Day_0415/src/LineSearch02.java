import java.util.Scanner;

//����(����)�˻�
public class LineSearch02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("ã�� ����: ");
		int var = scn.nextInt();
		IntData id = new IntData();
		int cnt = id.search(var);
		if (cnt == 0) {
			System.out.println(var + "�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println(var + "�� " + cnt + "��° �����մϴ�.");
		}
		scn.close();
	}
}
