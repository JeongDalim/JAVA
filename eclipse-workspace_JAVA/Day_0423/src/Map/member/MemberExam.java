package Map.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MemberExam {
	public static void main(String[] args) {
		int score = 0;
		Scanner scn = new Scanner(System.in);
		Map<Member, Integer> map = new HashMap<Member, Integer>();
		Member member = null;
		while (true) {
			System.out.print("ȸ�������Է�: ");
			int num = scn.nextInt();
			if (num == 0) {
				break;
			}
			String name = scn.next();
			score = scn.nextInt();
			member = new Member(num, name);
			if (map.containsKey(member)) {
				System.out.println("�ߺ�! �ٽ��Է����ּ���");
			} else {
				map.put(member, score);
			}
		}
		System.out.println("��ȣ\t�̸�\t����");
		Set<Entry<Member, Integer>> set = map.entrySet();
		Iterator<Entry<Member, Integer>> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		scn.close();
	}
}
