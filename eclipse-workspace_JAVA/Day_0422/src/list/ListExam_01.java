package list;

import java.util.ArrayList;
import java.util.List;

public class ListExam_01 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		// 삽입
		list.add(123); // list.add(new Integer(123));
		list.add("hellow");
		list.add("java");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println(list.size()); // list에 속한 객체의 수
		System.out.println(list.isEmpty()); // list가 비엇는지
		list.set(0, 456); // list의 0번째 주소의 값을 바꿈
		System.out.println(list.get(0));
		System.out.println(list.contains(456)); // 값을 포함하는지
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
	}
}
