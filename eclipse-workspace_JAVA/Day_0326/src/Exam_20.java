import java.util.Scanner;

public class Exam_20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		int cnt2 = 0;
		while (true) {
			int a = scn.nextInt();
			cnt++;
			if (a >= 80) {
				cnt2++;
			}
			if (cnt == 10 || cnt2 == 5) {
				break;
			}
		}
		scn.close();
	}
}
