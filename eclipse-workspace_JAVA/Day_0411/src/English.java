import java.util.Scanner;

public class English {

	public static void main(String[] args) {

		int[] arr = new int[26];
		Scanner scn = new Scanner(System.in);
		System.out.print("����ܾ� �Է�:");
		String str = scn.next();
		for (int i = 0; i < str.length(); i++) {
			int ch = str.toUpperCase().charAt(i);
			arr[ch - 65]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.print((char) (i + 65) + ":" + arr[i] + "\t");
			}
		}
		scn.close();
	}
}