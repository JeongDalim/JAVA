package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExam_04 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println("list=" + list);
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
		System.out.println("list2=" + list2);
		List<String> strList = Arrays.asList("hellow", "java", "world!");
		System.out.println("strlist=" + strList);
		Collections.sort(strList);
		Collections.sort(list);
		System.out.println("list=" + list);
	}
}
