import java.util.ArrayList;
import java.util.List;

public class SawonData {
	List<Sawon> list;

	public SawonData() {
		list = new ArrayList<Sawon>();
		list.add(new Sawon("1010", "ȫ�浿"));
		list.add(new Sawon("2011", "�̱浿"));
		list.add(new Sawon("1113", "�ڱ浿"));
		list.add(new Sawon("1510", "�ֱ浿"));
		list.add(new Sawon("1310", "��浿"));
		list.add(new Sawon("1015", "���浿"));
		list.add(new Sawon("1115", "���浿"));
		list.add(new Sawon("1416", "��浿"));
		list.add(new Sawon("1510", "�ձ浿"));
		list.add(new Sawon("1117", "���浿"));
		list.add(new Sawon("1245", "Ȳ�浿"));
		list.add(new Sawon("1114", "���浿"));
	}

	public void search(String bun) {
		boolean sw = true;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBun().equals((bun))) {
				System.out.println("���:" + list.get(i).getBun());
				System.out.println("����̸�:" + list.get(i).getName());
				sw = false;
				break;
			}
		}
		if (sw) {
			System.out.println("���" + bun + "�� �������� �ʴ� �����ȣ�Դϴ�.");
		}
	}
}
