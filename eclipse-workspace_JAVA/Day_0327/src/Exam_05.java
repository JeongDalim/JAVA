
//리턴타입은 있지만, 매개변수가 없는 경우.
import java.util.Scanner;

public class Exam_05 {
	static int fun() {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		int tot = 0;
		while (true) {
			System.out.print("입력 = ");
			int a = scn.nextInt();
			tot = tot + a;
			cnt++;
			if (cnt == 5) {
				break;
			}
		}
		scn.close();
		return tot;
	}

	public static void main(String[] args) {
		if (fun() >= 400) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

}
