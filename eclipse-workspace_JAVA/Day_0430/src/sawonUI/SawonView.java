package sawonUI;

import java.util.List;
import java.util.Scanner;

import sawonDAO.SawonDAO;
import sawonDAO.SawonVO;

public class SawonView {
	Scanner scn = new Scanner(System.in);
	SawonDAO sawonDAO = new SawonDAO();
	List<SawonVO> list = null;

	public void method1() {
		System.out.println("======================������� ����Ʈ======================");
		System.out.println("�����ȣ\t����̸�\t�������ó\t����޿�\t�Ի�����");
		list = sawonDAO.sawonList();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSno() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getTel() + "\t");
			System.out.print(list.get(i).getPay() + "\t");
			System.out.println(list.get(i).getIndate());
		}
		System.out.println("=======================================================");
	}

	public void method2() {
		System.out.println("===������� ���===");
		System.out.print("�����ȣ: ");
		int sno = scn.nextInt();
		System.out.print("����̸�: ");
		String name = scn.next();
		System.out.print("�������ó: ");
		String tel = scn.next();
		System.out.print("����޿�: ");
		int pay = scn.nextInt();

		SawonVO sawonVO = new SawonVO();
		sawonVO.setSno(sno);
		sawonVO.setName(name);
		sawonVO.setTel(tel);
		sawonVO.setPay(pay);
		int row = sawonDAO.sawonInsert(sawonVO);

		if (row == 1) {
			System.out.println("�Է� ����");
		} else {
			System.out.println("�Է� ����");
		}
		scn.close();
	}

	public void method3() {
		System.out.print("�����Ϸ��� �����ȣ :");
		int sno = scn.nextInt();
		method5(sno);
		System.out.print("������ �������ó: ");
		String tel = scn.next();
		if (tel.equals("no")) {
		} else {
			if (sawonDAO.sawonRevise(tel, sno) == 1) {
				sawonDAO.sawonRevise(tel, sno);
				System.out.println("��������");
			} else {
				System.out.println("��������");
			}
		}
		System.out.print("������ ����޿�: ");
		int pay = scn.nextInt();
		if (pay == 0) {
		} else {
			if (sawonDAO.sawonRevise2(pay, sno) == 1) {
				sawonDAO.sawonRevise2(pay, sno);
				System.out.println("��������");
			} else {
				System.out.println("��������");
			}
		}
	}

	public void method4(int sno) {
		if (sawonDAO.sawonDelete(sno) == 1) {
			System.out.print("�����ұ��? [Y]/[N]: ");
			String anwers = scn.next();
			if (anwers.equalsIgnoreCase("Y")) {
				sawonDAO.sawonDelete(sno);
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}
		}
	}

	public void method5(int sno) {
		System.out.println("========================���========================");
		System.out.println("�����ȣ\t����̸�\t�������ó\t����޿�\t�Ի�����");
		list = sawonDAO.sawonSearch(sno);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSno() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getTel() + "\t");
			System.out.print(list.get(i).getPay() + "\t");
			System.out.println(list.get(i).getIndate());
		}
		System.out.println("===================================================");
	}
}
