package StudentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Student s = null; // Ŭ���� ���� ����
		Scanner scn = new Scanner(System.in); // ��ĳ�� ���� �� �Ҵ�
		List<Student> list = new ArrayList<Student>(); // ����Ʈ ���� �� �Ҵ�
		while (true) { // �ݺ��Ѵ�
			System.out.print("�� ��ȣ ü��"); // �� ��ȣ ü��
			int ban = scn.nextInt(); // �ݿ� �Է�
			if (ban == 0) { // ���� 0�ϰ�� break;
				break;
			}
			int bun = scn.nextInt(); // ���� �Է�
			int kg = scn.nextInt(); // kg�� �Է�
			s = new Student(ban, bun, kg); // s �Ű������� �� �� kg�Է�
			list.add(s); // ����Ʈ�� s �߰�
		}
		s.printTitle(); // Ÿ��Ʋ ���
		int maxkg = list.get(0).kg;
		int minkg = list.get(0).kg;
		for (int i = 0; i < list.size(); i++) {
			if (maxkg < list.get(i).kg) {
				maxkg = list.get(i).kg;
			}
			if (minkg > list.get(i).kg) {
				minkg = list.get(i).kg;
			}
		}

		int bantemp = 0;

		for (int i = 0; i < list.size(); i++) {
			if (bantemp != list.get(i).ban) {
				bantemp = list.get(i).ban;
				System.out.println(list.get(i));
			} else {
				System.out.println(list.get(i).sameClass());
			}
		}

		System.out.println("�ּ�ü��:" + minkg + "kg");
		System.out.println("�ִ�ü��:" + maxkg + "kg");
		scn.close();
	}
}
