//�̸��� Ű����� �Է¹޾� list�� ��� �� ����
//�̸��� end�� ����
//��, ������ �̸��� ��ϵ���  �ʵ��� �����Ѵ�

package list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest_01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		while (true) {
			boolean sw = true;
			System.out.print("�̸� �Է�:");
			String name = scn.next();
			if (name.equalsIgnoreCase("end")) {
				break;
			}
			if (list.contains((name))) {
				sw = false;
			}
			if (sw) {
				list.add(name);
			}
		}
		for (String strarr : list) {
			System.out.println(strarr);
		}
		scn.close();
	}
}
