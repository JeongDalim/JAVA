package binary;

import java.util.Scanner;

public class MemberSearch {
	public static void main(String[] args) {
		MemberData md = new MemberData();
		md.print();
		Scanner scn = new Scanner(System.in);
		System.out.print("Member 검색:");
		int sNO = scn.nextInt();
		String name = scn.next();
		int age = scn.nextInt();
		Member member = new Member(sNO, name, age);
		Member mem = md.binarySearch(member);
		if (mem != null) {
			System.out.print(md.binarySearch(member).getsNO() + "\t");
			System.out.print(md.binarySearch(member).getName() + "\t");
			System.out.print(md.binarySearch(member).getAge() + "\t");
			scn.close();
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}
}
