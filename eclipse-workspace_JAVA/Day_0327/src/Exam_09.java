import java.util.Scanner;

public class Exam_09 {

	static void fun(int score) {
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println(score + ":" + "A");
			break;
		case 8:
			System.out.println(score + ":" + "B");
			break;
		case 7:
			System.out.println(score + ":" + "C");
			break;
		case 6:
			System.out.println(score + ":" + "D");
			break;
		default:
			System.out.println(score + ":" + "F");
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력= ");
		int num = scn.nextInt();
		fun(num);
		scn.close();
	}
}
