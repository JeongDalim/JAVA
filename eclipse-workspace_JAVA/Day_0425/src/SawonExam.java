
//Ŭ���� �迭�� �̿��� ��ü�� �����Ͽ� Ŭ���� �迭�� �־� ���߿� ����ϴ� ���α׷�
import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon[] sArr = new Sawon[10]; // Ŭ���� �迭 �ʱ�ȭ
		int cnt = 0;
		int sabun = 0;
		String name = null;
		Sawon s1 = null; // ��ü ����
		while (true) {
			System.out.print("��� �Է�: ");
			sabun = scn.nextInt();
			if (sabun == 0) {
				break;
			}
			System.out.print("�̸� �Է�: ");
			name = scn.next();
			System.out.print("���� �Է�: ");
			int age = scn.nextInt();
			s1 = new Sawon(sabun, name, age); // �Ҵ�
			sArr[cnt] = s1; // Ŭ�����迭�� �Ű������� �� ��ü���� �ݺ� 1ȸ�� �ϳ��� �ֱ�
			cnt++;
		}
		sArr[0].title();
		for (int i = 0; i < cnt; i++) {
			sArr[i].dataPrint();
		}
		scn.close();
	}
}
