package search;

import java.util.Scanner;

public class PersonSearch {
	public static void main(String[] args) {
		PersonData pd = null;
		Scanner scn = new Scanner(System.in);
		System.out.println("[1]번호로 검색(2진검색)\n[2]이름으로 검색(선형검색)\n[3]프로그램 종료\n메뉴선택(1~3)");
		int var = scn.nextInt();
		if (var == 1) {
			System.out.print("찾을번호: ");
			int num = scn.nextInt();
			pd = new PersonData();
			System.out.print("번호:" + pd.print1(num).getNum() + "\t");
			System.out.print("이름:" + pd.print1(num).getName() + "\t");
		} else if (var == 2) {
			pd = new PersonData();
			System.out.print("찾을이름: ");
			String name = scn.next();
			System.out.print("번호:" + pd.print2(name).getNum() + "\t");
			System.out.print("이름:" + pd.print2(name).getName() + "\t");
		} else if (var == 3) {
			System.exit(0);
		}

		scn.close();
	}
}
