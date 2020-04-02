package ui;

import java.util.List;
import java.util.Scanner;

import VO.VO;
import dao.DAO;

public class UI {
	List<VO> list = null;
	Scanner scn = new Scanner(System.in);
	DAO dao = new DAO();

	public void method1() {
		String name;
		String tel;
		String part;
		String birthday;
		System.out.println("���������");
		while (true) {
			System.out.print("�̸�: ");
			name = scn.nextLine();
			if (name.equals("")) {
				System.err.println("�̸��� �ʼ��Է»����Դϴ�");
			} else {
				break;
			}
		}
		System.out.print("��ȭ��ȣ: ");
		tel = scn.nextLine();
		if (tel.equals("")) {
			tel = "0";
		}
		while (true) {
			System.out.print("������: ");
			part = scn.nextLine();
			if (part.equals("")) {
				System.err.println("�������� �ʼ��Է»����Դϴ�");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("�������: ");
			birthday = scn.nextLine();
			if (birthday.equals("")) {
				System.err.println("��������� �ʼ��Է»����Դϴ�");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("����ұ��?[Y]/[N]_ ");
			String answer = scn.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				if (dao.Insert(name, tel, part, birthday) == 1) {
					System.out.println("��ϼ���! ���θ޴��� ���ư��ϴ�.");
					break;
				} else {
					System.err.println("��Ͻ���! ���θ޴��� ���ư��ϴ�.");
					break;
				}
			} else {
				System.out.println("���θ޴��� ���ư��ϴ�.");
				break;
			}
		}
	}

	public void method2() {
		list = dao.print();
		System.out.println("����\t�̸�\t��ȭ\t������\t�������\t\t�Ի���");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getTno() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getTel() + "\t");
			System.out.print(list.get(i).getPart() + "\t");
			System.out.print(list.get(i).getBirthday().substring(0, 10) + "\t");
			System.out.print(list.get(i).getRegdate() + "\n");
		}
	}

	public void method3() {
		System.out.println("�������˻�");
		System.out.print("�˻��Ϸ��� �������� ����: ");
		int tno = scn.nextInt();
		list = dao.search(tno);
		if (list.size() > 0) {
			System.out.println("����\t�̸�\t��ȭ\t\t������\t�������\t\t�Ի���");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTno() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getTel() + "\t");
				System.out.print(list.get(i).getPart() + "\t");
				System.out.print(list.get(i).getBirthday().substring(0, 10) + "\t");
				System.out.print(list.get(i).getRegdate() + "\n");
			}
			System.out.println("�˻�����! ���θ޴��� ���ư��ϴ�.");

		} else {
			System.err.println("�˻�����! �������� �ʴ� �����Դϴ�. ���θ޴��� ���ư��ϴ�.");
		}
	}

	public void method4() {
		System.out.println("����������");
		System.out.print("�����Ϸ��� �������� ����: ");
		int tno = scn.nextInt();
		list = dao.search(tno);
		if (list.size() > 0) {
			System.out.println("����\t�̸�\t��ȭ\t\t������\t�������\t\t�Ի���");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTno() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getTel() + "\t");
				System.out.print(list.get(i).getPart() + "\t");
				System.out.print(list.get(i).getBirthday().substring(0, 10) + "\t");
				System.out.print(list.get(i).getRegdate() + "\n");
			}

			scn.nextLine();
			String name;
			String tel;
			String part;
			String birthday;
			while (true) {
				System.out.print("�����Ϸ��� �̸�: ");
				name = scn.nextLine();
				if (name.equals("")) {
					break;
				} else {
					break;
				}
			}
			System.out.print("�����Ϸ��� ��ȭ��ȣ: ");
			tel = scn.nextLine();
			if (tel.equals("")) {
				tel = "0";
			}
			while (true) {
				System.out.print("�����Ϸ��� ������: ");
				part = scn.nextLine();
				if (part.equals("")) {
					System.err.println("�������� �ʼ��Է»����Դϴ�");
				} else {
					break;
				}
			}
			while (true) {
				System.out.print("�����Ϸ��� �������: ");
				birthday = scn.nextLine();
				if (birthday.equals("")) {
					System.err.println("��������� �ʼ��Է»����Դϴ�");
				} else {
					break;
				}
			}
			System.out.print("�����Ͻðڽ��ϱ�?[Y]/[N]_");
			String answer = scn.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				dao.modify(tno, name, tel, part, birthday);
				System.out.println("��������! ���θ޴��� ���ư��ϴ�.");
			} else {
				System.out.println("���θ޴��� ���ư��ϴ�.");
			}
		} else {
			System.err.println("�˻�����! �������� �ʴ� �����Դϴ�. ���θ޴��� ���ư��ϴ�.");
		}
	}

	public void method5() {
		System.out.println("����������");
		System.out.print("�����Ϸ��� �������� ����: ");
		int tno = scn.nextInt();
		list = dao.search(tno);
		if (list.size() > 0) {
			System.out.println("����\t�̸�\t��ȭ\t\t������\t�������\t\t�Ի���");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTno() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getTel() + "\t");
				System.out.print(list.get(i).getPart() + "\t");
				System.out.print(list.get(i).getBirthday().substring(0, 10) + "\t");
				System.out.print(list.get(i).getRegdate() + "\n");
			}
			System.out.print("�����Ͻðڽ��ϱ�?[Y]/[N]_");
			String answer = scn.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				if (dao.delete(tno) == 1) {
					System.out.println("��������! ���θ޴��� ���ư��ϴ�.");
				}
			}
		} else {
			System.err.println("�˻�����! �������� �ʴ� �����Դϴ�. ���θ޴��� ���ư��ϴ�.");
		}
	}
}
