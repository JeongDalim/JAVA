package binary;

import java.util.ArrayList;
import java.util.List;

public class MemberData2 {
	List<Member> list = null;
	Member member = null;

	public MemberData2() {
		list = new ArrayList<Member>();
		list.add(new Member(1, "AAA", 40));
		list.add(new Member(3, "BBB", 25));
		list.add(new Member(7, "CCC", 30));
		list.add(new Member(9, "DDD", 12));
		list.add(new Member(10, "EEE", 26));
		list.add(new Member(11, "FFF", 31));
		list.add(new Member(15, "GGG", 18));
		list.add(new Member(17, "HHH", 32));
		list.add(new Member(19, "III", 51));
		list.add(new Member(21, "JJJ", 27));
		list.add(new Member(31, "KKK", 20));
	}

	public void print() {
		for (int i = 0; i < list.size(); i++) {
			Member mem = list.get(i);
			System.out.print(mem.getsNO() + "\t");
			System.out.print(mem.getName() + "\t");
			System.out.print(mem.getAge() + "\t");
			System.out.println();
		}
	}

	public Member binarySearch(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (name.equalsIgnoreCase(list.get(i).getName())) {
				member = list.get(i);
			}
		}
		return member;
	}

}
