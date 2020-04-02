
public class Exam_02 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[][] arr2 = { { 1, 2, 3 }, { 10, 20 }, { 100, 200, 300, 400, 500 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
