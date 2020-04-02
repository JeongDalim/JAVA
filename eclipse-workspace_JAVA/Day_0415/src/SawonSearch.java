import java.util.Scanner;

public class SawonSearch {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사원번호입력 :");
		String bun = scn.next();
		SawonData sd = new SawonData();
		sd.search(bun);
		scn.close();
	}
}
