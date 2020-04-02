import java.util.Scanner;

//선형(순차)검색
public class LineSearch02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("찾는 정수: ");
		int var = scn.nextInt();
		IntData id = new IntData();
		int cnt = id.search(var);
		if (cnt == 0) {
			System.out.println(var + "는 존재하지 않습니다.");
		} else {
			System.out.println(var + "는 " + cnt + "번째 존재합니다.");
		}
		scn.close();
	}
}
