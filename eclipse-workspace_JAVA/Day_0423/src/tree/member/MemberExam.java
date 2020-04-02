package tree.member;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MemberExam {
	public static void main(String[] args) {
		Set<Member> set = new TreeSet<Member>();
		Member m1 = new Member(1, "AAA", 90);
		set.add(m1);
		set.add(new Member(2, "BBB", 80));
		set.add(new Member(3, "CCC", 70));
		set.add(new Member(4, "DDD", 60));
		set.add(new Member(1, "AAA", 90));
		Iterator<Member> iter = set.iterator(); // TreeSet은 자동 정렬기능이 있으나, 사용자 정의 클래스는 정렬이 불가하기 때문에 Comparable를 구현화해주어야
												// 한다.
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
