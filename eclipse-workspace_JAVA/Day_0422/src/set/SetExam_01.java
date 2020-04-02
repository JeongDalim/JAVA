package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam_01 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add("java");
		set.add("hellow");
		set.add(1234);
		set.add("DataBase");
		set.add("java");
		set.add("Servlet");
		System.out.println("size:" + set.size());
		System.out.println(set);
		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + "\t");
		}
		System.out.println(set.contains("java"));
	}
}
