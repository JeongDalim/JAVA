//�迭 �ִ� �ּڰ� ���ϱ�2
public class Exam_07 {

	static int method(int[] data2) {
		int max = data2[0];// �迭�� ù��° ���� �ʱ�ȭ // int min=data2[0];
		for (int i = 1; i < data2.length; i++) {
			if (max < data2[i]) { // �迭�� �ִ� ������ ���ϴ� �� min>data2[i]'
				max = data2[i];// min=data2[i];
			}
		}
		return max;// min
	}

	public static void main(String[] args) {
		int[] data = { 79, 56, 78, 79, 90, 74, 46, 95, 55, 70 };
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("�ִ���= " + method(data));
	}
}
