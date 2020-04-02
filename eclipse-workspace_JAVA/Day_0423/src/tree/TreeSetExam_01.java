package tree;

import java.util.*;

public class TreeSetExam_01 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for (; set.size() < 6;) {
			int r = (int) (Math.random() * 45) + 1;
			set.add(r);
		}
		System.out.println("==========Set==========");
		System.out.println(set);
		Set<Integer> tree = new TreeSet<Integer>();
		System.out.println("========TreeSet========");
		for (; tree.size() < 6;) {
			int r = (int) (Math.random() * 45) + 1;
			tree.add(r);
		}
		System.out.println(tree); // treeSet은 자동 정렬이 된다.
	}
}
