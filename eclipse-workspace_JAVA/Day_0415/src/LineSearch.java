import java.util.Scanner;

//����(����)�˻�
public class LineSearch {
	public static void main(String[] args) {
		int[] sawon = { 67, 20, 80, 50, 77, 95, 35, 45, 68, 81, 45 };
		Scanner scn = new Scanner(System.in);
		System.out.print("ã�� ����: ");
		int var = scn.nextInt();

		for (int i = 0; i < sawon.length; i++) {
			System.out.print(sawon[i] + "\t");
		}
		System.out.println();
		boolean sw = true;
		for (int i = 0; i < sawon.length; i++) {
			if (var == sawon[i]) {
				System.out.println(var + "��" + (i + 1) + "��° ��ġ�մϴ�.");
				sw = false;
				break;
			}
		}
		if (sw) {
			System.out.println(var + "�� �������� �ʽ��ϴ�.");
		}

		scn.close();
	}
}
