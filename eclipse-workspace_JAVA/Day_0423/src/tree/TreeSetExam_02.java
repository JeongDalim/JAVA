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
		System.out.println("총합:" + tot);
		System.out.println("===========================================");
		System.out.println(tree);
		System.out.println("50보다 작은 값:" + tree.headSet(50));
		System.out.println("50보다 큰 값:" + tree.tailSet(50));
		System.out.println("가장 작은 값:" + tree.first());
		System.out.println("가장 큰 값:" + tree.last());
		System.out.println("80보다 아래:" + tree.lower(80));
		System.out.println("80보다 위:" + tree.higher(80));
		System.out.println("70점이거나 바로 아래 점수" + tree.floor(70));
		System.out.println("70점이거나 바로 위 점수" + tree.ceiling(70));
		System.out.println("===========================================");
		int var2 = 0;
		while (!tree.isEmpty()) {
			var2 = (int) tree.pollFirst(); // 객체를 반환하면서 제거한다. size또한 줄여든다.
			System.out.println(var2 + " 남은 객체 수: " + tree.size());
		}
	}
}
