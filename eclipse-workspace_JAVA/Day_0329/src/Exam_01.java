
public class Exam_01 {
	public static void main(String[] args) {
		int[] arr;// �迭���� ����
		arr = new int[5];// �Ҵ�(������ Ȯ��)
		System.out.println(arr); // arr�迭�� ù���� �ּҰ��� ��µɰ��̴�
		System.out.println(arr[0]);// �Ҵ��ϴ� ���� ����Ʈ�� 0�� ���� 0�� ��µȴ�
		arr[0] = 10; // ����
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr.length);// �迭�� ���̸� �˷��ش�
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} // for���� �̿��Ͽ� �迭 ���� ���� ���� ��°����ϴ�
	}
}
