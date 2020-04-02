package set.member;

import java.util.HashSet;
import java.util.Set;

public class MemberExam {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("AAA", 40));
		set.add(new Member("BBB", 20));
		set.add(new Member("CCC", 30));
		set.add(new Member("AAA", 40));
		set.add(new Member("EEE", 50));
		set.add(new Member("FFF", 60));

		System.out.println("ÃÑ °´Ã¼ ¼ö:" + set.size());
		for (Member m : set) {
			System.out.println(m);
		}
	}
}
