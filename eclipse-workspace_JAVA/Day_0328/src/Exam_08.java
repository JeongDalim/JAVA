import java.util.Scanner;

public class Exam_08 {

	static void method(int s) {
		int cnt = 0;
		for (int m = 2; m <= s; m++) {// 2������ s���� Ȯ�ο� for��
			for (int i = 2; i <= m; i++) { // �Ҽ�Ȯ�ο�for��
				if (m % i == 0) { // m�� i�� ������ 0�ΰ�?
					if (m == i) {// m�� i�� ������?
						System.out.print(i + "\t"); // ���� �� ������ �����ϸ� �Ҽ��̱⶧���� ���
						cnt++; // �Ҽ����� +1
						if (cnt % 5 == 0) { // �Ҽ������� 5������
							System.out.println();// �ٹٲ��� ���ش�
						}
					}
					break;// m�� i�� ������ 0�� �ƴҰ�� ���ǹ��� �������´�
				}
			}
		}
		System.out.println("\n�Ҽ� ���� :" + cnt);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�= ");
		int num = scn.nextInt();
		method(num);
		scn.close();
	}
}
