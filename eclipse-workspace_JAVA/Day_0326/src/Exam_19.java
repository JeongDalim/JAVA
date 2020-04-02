import java.util.Scanner;

public class Exam_19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.print("ют╥б");
			int a = scn.nextInt();
			if (a == 0) {
				break;
			}
			i++;
			if (a == 0 || i == 5) {
				System.exit(1);
			}

		}
		scn.close();
	}
}
