import java.util.Scanner;

public class Exam_09 {
	static int search(int var2) {
		int result = 0;
		int cnt = 1;
		int data[] = { 44, 66, 55, 88, 90, 86, 75, 45, 70, 40, 50, 60 };
		for (int i = 0; i < data.length; i++) {
			if (data[i] != var2) {
				cnt++;
			} else if (data[i] == var2) {
				result = cnt;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var = 0;
		while (true) {
			if (var == 0) {
				break;
			}
			System.out.print("������ ã��(0�̸� ����)= ");
			var = scn.nextInt();
			System.out.println(var + "��" + search(var) + "��° �����մϴ�.");

		}
		scn.close();
	}
}
