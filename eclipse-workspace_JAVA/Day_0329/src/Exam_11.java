//���߹迭
public class Exam_11 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {// ���� ������ŭ
			for (int j = 0; j < i + 1; j++) {// ĭ�� ������ŭ
				System.out.print(arr[i][j] + "\t");
				cnt++;
				arr[i][j] = cnt;
				// arr[i][j]=++cnt;�� ����
			}
			System.out.println();
		}
		System.out.println("===============================================");
		// 2�����迭 ���
		for (int i = 0; i < arr.length; i++) {// ���� ������ŭ
			for (int j = 0; j < arr[i].length; j++) {// ĭ�� ������ŭ
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
