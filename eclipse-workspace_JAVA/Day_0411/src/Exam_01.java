import java.util.Scanner;

public class Exam_01 {
	static void sosuPrint(int[] vararr2) {
		int cnt = 0;
		int tot = 0;
		for (int j = 0; j < vararr2.length; j++) {
			int var2 = vararr2[j];
			for (int k = 2; k < vararr2.length; k++) {
				if (vararr2[j] % k == 0) {
					if (vararr2[j] == k) {
						System.out.println(var2);
						cnt++;
						tot += var2;
					}
					break;
				}
			}
		}
		System.out.println();
		System.out.print("소수의 갯수는: "+cnt + "\t총합은: " + tot);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] vararr = null;
		System.out.print("정수입력 :");
		String str = scn.nextLine();
		String[] strarr = (str.split(" "));
		vararr = new int[str.length()];
		for (int i = 0; i < strarr.length; i++) {
			vararr[i] = Integer.parseInt(strarr[i]);
			System.out.print(vararr[i] + "\t");
		}
		scn.close();
		sosuPrint(vararr);
	}
}
