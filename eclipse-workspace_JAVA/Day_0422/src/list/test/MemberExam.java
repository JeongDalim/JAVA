package list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Member mem = null;
		List<Member> mlist = new ArrayList<Member>();
		while (true) {
			boolean sw = true;
			System.out.print("회원등록: ");
			String[] str = scn.nextLine().split(",");
			String id = str[0];
			if (id.equalsIgnoreCase("end")) {
				break;
			}
			for (int i = 0; i < mlist.size(); i++) {
				if (mlist.get(i).getId().equals(id)) {
					sw = false;
					System.out.println("등록불가! \"" + str[0] + "\"은 이미 존재하는 ID입니다");
				}
			}
			String name = str[1];
			int age = Integer.parseInt(str[2]);
			mem = new Member(id, name, age);
			if (sw) {
				mlist.add(mem);
			}
		}
		for (Member mem2 : mlist) {
			System.out.println(mem2);
		}
		scn.close();
	}
}
