package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.DAO;
import vo.VO;

public class UI {
	DAO dao = new DAO();
	Scanner scn = new Scanner(System.in);
	VO vo = null;

	public void method1() {
		System.out.println("����ȣ\t�̸�\t����ó\t\t�ּ�\t�����\t�������\t\t����\t�������");
		List<VO> list = new ArrayList<VO>();
		list = dao.print();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getNum() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getTel() + "\t");
			System.out.print(list.get(i).getAddr() + "\t");
			System.out.print(list.get(i).getOffice() + "\t");
			System.out.print(list.get(i).getBirthday().substring(0, 10) + "\t");
			System.out.print(list.get(i).getSex() + "\t");
			System.out.print(list.get(i).getIndate() + "\n");
		}
	}

	public void method2() {
		vo = new VO();
		System.out.println("�ű� �� ���� ���");
		System.out.print("����ȣ: ");
		int num = scn.nextInt();
		System.out.print("����: ");
		String name = scn.next();
		System.out.print("����ó: ");
		String tel = scn.next();
		System.out.print("�ּ�: ");
		String addr = scn.next();
		System.out.print("�����: ");
		String office = scn.next();
		System.out.print("�������: ");
		String birthday = scn.next();
		System.out.print("����: ");
		String sex = scn.next();
		vo.setNum(num);
		vo.setName(name);
		vo.setTel(tel);
		vo.setAddr(addr);
		vo.setOffice(office);
		vo.setBirthday(birthday);
		vo.setSex(sex);
		if (dao.insert(vo) == 1) {
			System.out.print("����Ͻðڽ��ϱ�? [Y]/[N]");
			String answer = scn.next();
			if (answer.equalsIgnoreCase("Y")) {
				System.out.println("��� �Ϸ�");
			} else {
				System.out.println("��� �Ϸ�");
			}
		} else {
			System.out.println("��� ����");
		}
	}

	public void method3() {
		System.out.println("\t**�� ���� �˻�**");
		System.out.print("���ϴ� ���� �̸��� �Է��ϼ���? ");
		String name = scn.next();
		if (dao.search(name) != null) {
			System.out.println("����ȣ\t�̸�\t����ó\t\t�ּ�\t�����\t�������\t\t����\t�������");
			System.out.print(dao.search(name).getNum() + "\t");
			System.out.print(dao.search(name).getName() + "\t");
			System.out.print(dao.search(name).getTel() + "\t");
			System.out.print(dao.search(name).getAddr() + "\t");
			System.out.print(dao.search(name).getOffice() + "\t");
			System.out.print(dao.search(name).getBirthday().substring(0, 10) + "\t");
			System.out.print(dao.search(name).getSex() + "\t");
			System.out.println(dao.search(name).getIndate());
			System.out.println("�˻�����");
		} else {
			System.err.println("�������� �ʴ� �̸��Դϴ�.");
		}
	}

	public void method4() {
		System.out.println("\t**�� ���� ����**");
		System.out.print("������ ���ϴ� ���� ��ȣ�� �Է��ϼ���? ");
		int num = scn.nextInt();
		String tel;
		String office;
		System.out.println("����: " + dao.search2(num).getName() + "\t *������ '����ó' , '�����' �� ��������");
		while (true) {
			System.out.print("����ó��: ");
			tel = scn.nextLine();
			if (tel.equals("")) {
				System.out.println("����ó���� �ʼ� �Դϴ�.");
			} else {
				if (dao.modify(num, tel) == 1) {
					System.out.println("�����Ϸ�");
				} else {
					System.err.println("��������");
				}
				break;
			}
		}
		while (true) {
			System.out.print("�����: ");
			office = scn.nextLine();
			if (office.equals("")) {
				System.out.println("������� �ʼ� �Դϴ�.");
			} else {
				if (dao.modify2(num, office) == 1) {
					System.out.println("�����Ϸ�");
				} else {
					System.err.println("��������");
				}
				break;
			}
		}

	}

	public void method5() {
		System.out.println("\t**�� ���� ����**");
		System.out.print("������ ���ϴ� ���� ��ȣ�� �Է��ϼ���? ");
		int num = scn.nextInt();
		System.out.print("�����Ͻðڽ��ϱ�?[Y]/[N]");
		String answer = scn.next();
		if (answer.equalsIgnoreCase("Y")) {
			dao.delete(num);
			System.out.println("��������");
		}
	}
}
