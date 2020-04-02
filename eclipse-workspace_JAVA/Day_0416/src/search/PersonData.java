package search;

import java.util.ArrayList;
import java.util.List;

public class PersonData {
	List<Person> list = new ArrayList<Person>();
	Person person = null;

	public PersonData() {
		list.add(new Person(10, "ȫ�浿"));
		list.add(new Person(15, "���ڹ�"));
		list.add(new Person(20, "�̸���"));
		list.add(new Person(30, "ȫ�繫"));
		list.add(new Person(40, "���̽�"));
		list.add(new Person(55, "�̼���"));
		list.add(new Person(65, "�����"));
		list.add(new Person(70, "������"));
		list.add(new Person(80, "������"));
		list.add(new Person(90, "�����"));
	}

	public Person print1(int var) {
		int low = 0;
		int high = list.size() - 1;
		int mid = 0;
		while (true) {
			if (low > high) {
				return new Person(999, "�������� �ʽ��ϴ�");
			}
			mid = (low + high) / 2;
			if (var == list.get(mid).getNum()) {
				person = list.get(mid);
				break;
			}
			if (var > list.get(mid).getNum()) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return person;
	}

	public Person print2(String name) {
		boolean sw = true;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				person = list.get(i);
				sw = false;
				break;
			}
		}
		if (sw) {
			return new Person(999, "�������� �ʽ��ϴ�.");

		}
		return person;
	}
}
