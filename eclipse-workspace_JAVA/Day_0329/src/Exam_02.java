
public class Exam_02 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };// �迭�� ���� �Ҵ� �ʱ�ȭ���� ���ÿ� �Ѵ�.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i]; // �迭���� ����
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t"); // �迭���� �� ���
		}
		System.out.println(sum); // ���� ���
//=========================�Ǵ�================================
		int[] arr2 = { 10, 20, 30, 40, 50, 60, 0 };
		for (int j = 0; j < arr2.length - 1; j++) {
			arr[arr.length - 1] += arr[j];
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j] + "\t"); // �迭���� �� ���
		}
	}
}
