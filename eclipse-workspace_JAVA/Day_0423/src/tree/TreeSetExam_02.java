package tree;

import java.util.*;

public class TreeSetExam_02 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		int score[] = { 80, 90, 45, 38, 75, 82, 12 };
		for (int i = 0; i < score.length; i++) {
			tree.add(score[i]);
		}
		Iterator<Integer> iter = tree.iterator();
		int tot = 0;
		while (iter.hasNext()) {
			int var = (int) iter.next();
			tot += var;
			System.out.println(var);
		}
		System.out.println("����:" + tot);
		System.out.println("===========================================");
		System.out.println(tree);
		System.out.println("50���� ���� ��:" + tree.headSet(50));
		System.out.println("50���� ū ��:" + tree.tailSet(50));
		System.out.println("���� ���� ��:" + tree.first());
		System.out.println("���� ū ��:" + tree.last());
		System.out.println("80���� �Ʒ�:" + tree.lower(80));
		System.out.println("80���� ��:" + tree.higher(80));
		System.out.println("70���̰ų� �ٷ� �Ʒ� ����" + tree.floor(70));
		System.out.println("70���̰ų� �ٷ� �� ����" + tree.ceiling(70));
		System.out.println("===========================================");
		int var2 = 0;
		while (!tree.isEmpty()) {
			var2 = (int) tree.pollFirst(); // ��ü�� ��ȯ�ϸ鼭 �����Ѵ�. size���� �ٿ����.
			System.out.println(var2 + " ���� ��ü ��: " + tree.size());
		}
	}
}
