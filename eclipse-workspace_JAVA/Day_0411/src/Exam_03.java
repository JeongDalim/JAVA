
public class Exam_03 {

	static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != 0) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int cnt = 1;
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		print(arr);
		System.out.println("============================================");
		cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k <= 5 - i; k++) {
				System.out.print("\t");
			}
			for (int j = 0; j <= i; j++) {
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("============================================");
		cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					cnt++;
					arr[i][j] = cnt;
				}

			} else {
				for (int j = 0; j < arr.length; j++) {
					cnt++;
					arr[i][4 - j] = cnt;
				}
			}
		}
		print(arr);
	}
}
