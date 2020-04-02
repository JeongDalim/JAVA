import java.util.Scanner;

//선형(순차)검색
public class LineSearch {
	public static void main(String[] args) {
		int[] sawon = { 67, 20, 80, 50, 77, 95, 35, 45, 68, 81, 45 };
		Scanner scn = new Scanner(System.in);
		System.out.print("찾는 정수: ");
		int var = scn.nextInt();

		for (int i = 0; i < sawon.length; i++) {
			System.out.print(sawon[i] + "\t");
		}
		System.out.println();
		boolean sw = true;
		for (int i = 0; i < sawon.length; i++) {
			if (var == sawon[i]) {
				System.out.println(var + "는" + (i + 1) + "번째 위치합니다.");
				sw = false;
				break;
			}
		}
		if (sw) {
			System.out.println(var + "는 존재하지 않습니다.");
		}

		scn.close();
	}
}
