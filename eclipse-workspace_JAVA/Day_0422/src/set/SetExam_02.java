package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExam_02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("jsp");
		set.add("c");
		set.add("c++");
		set.add("c#");
		set.add("python");
		set.add("java");

		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("=======================");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("=======================");

		List list = new ArrayList(set);
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
