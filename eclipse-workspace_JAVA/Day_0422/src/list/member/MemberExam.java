package list.member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberExam {
	public static void main(String[] args) {
		List<Object> mlist = new ArrayList<Object>();
		Member m = new Member(1, "홍길동", 20);
		mlist.add(m);
		mlist.add(new Member(2, "김자바", 30));
		m = new Member(3, "파이썬", 40);
		mlist.add(m);
		System.out.println("========for문==========");
		for (int i = 0; i < mlist.size(); i++) {
			Member m2 = (Member) mlist.get(i);
			System.out.println(m2);
		}
		System.out.println("========for문2=========");
		for (int i = 0; i < mlist.size(); i++) {
			System.out.println(mlist.get(i));
		}
		System.out.println("=======확장for문========");
		for (Object o : mlist) {
			System.out.println(o);
		}
		System.out.println("========반복자==========");
		Iterator<Object> i = mlist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
