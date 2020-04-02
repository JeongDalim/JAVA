
public class HomeWork {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int cnt = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				cnt++;
				arr[i][j] = cnt;
				arr[i][arr[i].length - 1] += cnt;
				arr[arr[i].length - 1][j] += cnt;
				arr[arr.length - 1][arr[i].length - 1] += cnt;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
