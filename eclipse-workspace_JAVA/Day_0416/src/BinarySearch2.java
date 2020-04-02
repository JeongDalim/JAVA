import java.util.Scanner;

//�����˻���
//�ʼ����� : �������� �Ǵ� ���������̾�� �Ѵ�
public class BinarySearch2 {
	public static void main(String[] args) {
		int intData[] = { 10, 20, 30, 35, 45, 50, 60, 65, 77, 79, 85, 90, 95 };
		Scanner scn = new Scanner(System.in);
		System.out.print("ã�� ��: ");
		int var = scn.nextInt();
		int low = 0; // ù���� �����Ͱ� ��ġ
		int high = intData.length - 1; // ������ �����Ͱ� ��ġ
		int mid = 0; // �߾Ӱ� ����
		boolean sw = true;
		while (low <= high) {
			mid = (low + high) / 2;
			if (var == intData[mid]) {
				System.out.println(var + "�� " + (mid + 1) + "��° �����մϴ�.");
				sw = false;
				break;
			}
			if (var > intData[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		if (sw) {
			System.out.println(var + "�� �������� �ʽ��ϴ�.");
		}
		scn.close();
	}
}
