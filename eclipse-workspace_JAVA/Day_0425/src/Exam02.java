//석차계산법
public class Exam02 {
	public static void main(String[] args) {
		int[][] arr = { { 70, 0 }, { 80, 0 }, { 75, 0 }, { 87, 0 }, { 50, 0 }, { 60, 0 }, { 75, 0 } };
		System.out.println("점수\t석차");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===========================");
		for (int x = 0; x < arr.length; x++) { // 등수 계산법
			int rank = 1;// arr[x][1]=1;
			for (int y = 0; y < arr.length; y++) {
				if (arr[x][0] < arr[y][0]) {
					rank++;// arr[x][1]++;
				}
			}
			arr[x][1] = rank;// 제거
		}
		System.out.println("점수\t석차");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
