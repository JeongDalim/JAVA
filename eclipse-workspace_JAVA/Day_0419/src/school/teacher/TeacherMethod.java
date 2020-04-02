package school.teacher;

import java.util.List;

public class TeacherMethod {
	public void printTitle() {
		System.out.print("�������\n[1] �������\n[2] �����˻�\n[3] �̸��˻� \n[4] ������˻�\n[5] ����\n�޴�����([1]~[5]): ");
	}

	public void input1(List<Teacher> list) {
		System.out.println("==========================================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================================================");
	}

	public void input2(List<Teacher> list, int tno) {
		boolean sw = true;
		System.out.println("==========================================================");
		for (int i = 0; i < list.size(); i++) {
			if (tno == list.get(i).getTno()) {
				System.out.println(list.get(i));
				sw = false;
			}
		}
		System.out.println("==========================================================");
		if (sw) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
	}

	public void input3(List<Teacher> list, String name) {
		boolean sw = true;
		System.out.println("==========================================================");
		for (int i = 0; i < list.size(); i++) {
			String tempname = list.get(i).getName();
			if (tempname.indexOf(name) >= 0) {
				System.out.println(list.get(i));
				sw = false;
			}
		}
		System.out.println("==========================================================");
		if (sw) {
			System.out.println("�������� �ʴ� �Ʒ��Դϴ�.");
		}
	}

	public void input4(List<Teacher> list, String part) {
		boolean sw = true;
		System.out.println("==========================================================");
		for (int i = 0; i < list.size(); i++) {
			String parttemp = list.get(i).getPart();
			if (parttemp.indexOf(part) >= 0) {
				System.out.println(list.get(i));
				sw = false;
			}
		}
		System.out.println("==========================================================");
		if (sw) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
	}
}
