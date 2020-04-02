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
		Iterator<Member> iter = set.iterator(); // TreeSet�� �ڵ� ���ı���� ������, ����� ���� Ŭ������ ������ �Ұ��ϱ� ������ Comparable�� ����ȭ���־��
												// �Ѵ�.
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
