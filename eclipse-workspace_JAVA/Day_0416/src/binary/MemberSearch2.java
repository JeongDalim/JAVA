package binary;

import java.util.Scanner;

public class MemberSearch2 {
	public static void main(String[] args) {
		MemberData2 md = new MemberData2();
		md.print();
		Scanner scn = new Scanner(System.in);
		System.out.print("이름 검색:");
		String name = scn.next();
		Member mem = md.binarySearch(name);
		if (mem != null) {
			System.out.print(md.binarySearch(name).getsNO() + "\t");
			System.out.print(md.binarySearch(name).getName() + "\t");
			System.out.print(md.binarySearch(name).getAge() + "\t");
			scn.close();
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}
}
