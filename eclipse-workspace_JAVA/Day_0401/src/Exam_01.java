
public class Exam_01 {
	static void method(int[][] arr2) {
		System.out.println("\t\t�����϶�ǥ");
		System.out.println("��ȣ\t����\t����\t����\t����");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 95, 88, 79, 0 }, { 5, 93, 85, 89, 0 }, { 3, 85, 78, 70, 0 }, { 2, 89, 92, 85, 0 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length - 1; j++)
				arr[i][arr[i].length - 1] += arr[i][j];
		}
		method(arr);
	}
}
