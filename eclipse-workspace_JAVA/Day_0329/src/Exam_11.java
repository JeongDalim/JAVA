//다중배열
public class Exam_11 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {// 줄의 갯수만큼
			for (int j = 0; j < i + 1; j++) {// 칸의 갯수만큼
				System.out.print(arr[i][j] + "\t");
				cnt++;
				arr[i][j] = cnt;
				// arr[i][j]=++cnt;도 가능
			}
			System.out.println();
		}
		System.out.println("===============================================");
		// 2차원배열 출력
		for (int i = 0; i < arr.length; i++) {// 줄의 갯수만큼
			for (int j = 0; j < arr[i].length; j++) {// 칸의 갯수만큼
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
