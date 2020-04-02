import java.util.Scanner;

public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 0;
		while (true) {
			int a = scn.nextInt();
			if (a == 0) {
				break;
			}
			i++;
			if (i == 5) {
				System.exit(1);
			}
		}
		scn.close();
	}
}
