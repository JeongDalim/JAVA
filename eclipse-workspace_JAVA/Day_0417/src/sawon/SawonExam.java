package sawon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) throws FileNotFoundException {
		SawonData sd = new SawonData();
		Sawon sawon = null;
		Scanner scn = new Scanner(new File("c://text//sawon.txt"));
		Scanner scn2 = new Scanner(System.in);
		while (scn.hasNext()) {
			String[] str = scn.nextLine().split(",");
			int sabun = Integer.parseInt(str[0]);
			String name = str[1];
			int pay = Integer.parseInt(str[2]);
			sawon = new Sawon(sabun, name, pay);
			boolean sw = sd.insertSawon(sawon);
			if (sw) {
				System.out.println("사원정보 등록 성공");
			} else if (!sw) {
				System.out.println("사원정보 등록 실패");
			}
		}
		List<Sawon> list = sd.selectSawon();
		System.out.println("사번\t이름\t급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===========================================");
		System.out.print("사원번호 첫번째 자리 검색: ");
		int var = scn2.nextInt();
		List<Sawon> list2 = sd.searchSawon(var);
		System.out.println("사번\t이름\t급여");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		scn.close();
		scn2.close();
	}
}
