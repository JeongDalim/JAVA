package list;

import java.util.ArrayList;
import java.util.List;

public class ListExam_01 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		// ����
		list.add(123); // list.add(new Integer(123));
		list.add("hellow");
		list.add("java");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println(list.size()); // list�� ���� ��ü�� ��
		System.out.println(list.isEmpty()); // list�� �������
		list.set(0, 456); // list�� 0��° �ּ��� ���� �ٲ�
		System.out.println(list.get(0));
		System.out.println(list.contains(456)); // ���� �����ϴ���
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
	}
}
