package set.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MemberExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Set<Member> set = new HashSet<Member>();
		Member member = null;
		while (true) {
			System.out.print("입력:");
			String[] str = scn.nextLine().split(",");
			if (str[0].equalsIgnoreCase("end")) {
				break;
			}
			member = new Member(str[0], str[1], Integer.parseInt(str[2]));
			if (!set.add(member)) {
				System.out.println("중복");
			}
		}
		for (Member mem : set) {
			System.out.println(mem);
		}
		scn.close();
	}
}
