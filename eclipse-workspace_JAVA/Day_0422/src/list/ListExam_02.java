package list;

import java.util.*;

public class ListExam_02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("C++");
		list.add("C#");
		list.add("java");

		int index = list.indexOf("java"); // 앞에서부터 찾기
		System.out.println(index);
		int index2 = list.lastIndexOf("java"); // 뒤에서부터 찾기
		System.out.println(index2);

		List<String> list2 = list.subList(1, 4); // 1부터 4전까지
		System.out.println(list2);

		System.out.println(list.equals(list2));
		List<String> list3 = list;
		System.out.println(list3.equals(list));
	}
}
