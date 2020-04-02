package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExam_03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(1);
		list.add(11);
		list.add(8);
		list.add(4);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=====================");
		// Ȯ��for��
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("=====================");
		// �ݺ��ڷ� ��ȯ ���
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(list); // ���� ��
		Collections.sort(list); // �ݷ����� �������ִ� �޼ҵ�
		System.out.println(list);// ���� ��
	}
}
