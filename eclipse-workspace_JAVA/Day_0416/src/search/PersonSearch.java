package search;

import java.util.Scanner;

public class PersonSearch {
	public static void main(String[] args) {
		PersonData pd = null;
		Scanner scn = new Scanner(System.in);
		System.out.println("[1]��ȣ�� �˻�(2���˻�)\n[2]�̸����� �˻�(�����˻�)\n[3]���α׷� ����\n�޴�����(1~3)");
		int var = scn.nextInt();
		if (var == 1) {
			System.out.print("ã����ȣ: ");
			int num = scn.nextInt();
			pd = new PersonData();
			System.out.print("��ȣ:" + pd.print1(num).getNum() + "\t");
			System.out.print("�̸�:" + pd.print1(num).getName() + "\t");
		} else if (var == 2) {
			pd = new PersonData();
			System.out.print("ã���̸�: ");
			String name = scn.next();
			System.out.print("��ȣ:" + pd.print2(name).getNum() + "\t");
			System.out.print("�̸�:" + pd.print2(name).getName() + "\t");
		} else if (var == 3) {
			System.exit(0);
		}

		scn.close();
	}
}
