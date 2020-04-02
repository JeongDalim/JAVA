
public class HomeWork_02 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int var = 0;
		int tot = 0;
		int tot2 = 0;
		int tot3 = 0;
		for (int i = 0; i < arr.length - 1; i++) {// ÁÙÀÇ °¹¼ö¸¸Å­
			for (int j = 0; j < arr[i].length - 1; j++) {// Ä­ÀÇ °¹¼ö¸¸Å­
				arr[i][j] = ++var;
				System.out.print(arr[i][j] + "\t");
				tot += var;
			}
			System.out.println(tot);
			System.out.println();
			tot = 0;
		}
		for (int k = 0; k <= arr.length - 2; k++) {
			for (int z = 0; z < arr[k].length - 1; z++) {
				tot2 = tot2 + arr[z][k];
				tot3 = tot3 + arr[z][k];
			}
			System.out.print(tot2 + "\t");
			tot2 = 0;
		}
		System.out.print(tot3);
	}
}
