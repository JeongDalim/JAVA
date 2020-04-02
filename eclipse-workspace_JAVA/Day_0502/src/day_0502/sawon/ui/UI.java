package day_0502.sawon.ui;

import java.util.List;
import java.util.Scanner;

import day_0502.sawon.dao.DAO;
import day_0502.sawon.vo.DEPTVO;
import day_0502.sawon.vo.EMPVO;

public class UI {
	DAO dao = new DAO();
	List<EMPVO> list = null;
	List<DEPTVO> list2 = null;
	EMPVO emp = new EMPVO();
	Scanner scn = new Scanner(System.in);

	public void method1() {
		list = dao.print();
		System.out.println("\t\t\t\t******��� ��ü ���******");
		System.out.println("�����ȣ\t�̸�\t������\t\t����ȣ\t�Ի�����\t\t�޿�\tĿ�̼�\t�μ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\t");
			if (list.get(i).getJob().length() < 8) {
				System.out.print(list.get(i).getJob() + "\t\t");
			} else {
				System.out.print(list.get(i).getJob() + "\t");
			}
			System.out.print(list.get(i).getManager() + "\t");
			System.out.print(list.get(i).getHiredate().substring(0, 10) + "\t");
			System.out.print(list.get(i).getSalary() + "\t");
			System.out.print(list.get(i).getCommission() + "\t");
			System.out.println(list.get(i).getDname() + "\n");
		}
		while (true) {
			System.out.println("���� �޴��� �̵��մϴ�(Enter)? -->");
			String answer = scn.nextLine();
			if (answer.equals("")) {
				break;
			} else {
				System.err.println("�ٽ��Է����ּ���");
			}
		}
	}

	public void method2() {
		System.out.println("\t***�ű� �� ���� ���***");
		String ename;
		while (true) {
			System.out.print("����̸�: ");
			ename = scn.nextLine();
			if (ename.equals("")) {
				System.err.println("����̸��� �ʼ��Է� �����Դϴ� �ٽ� �Է��� �ֽʽÿ�.");
			} else {
				break;
			}
		}
		String job;
		while (true) {
			System.out.print("��  ��  ��: ");
			job = scn.nextLine();
			if (job.equals("")) {
				job = null;
				break;
			} else {
				break;
			}
		}
		String manager;
		while (true) {
			System.out.print("����ȣ: ");
			manager = scn.nextLine();
			if (manager.equals("")) {
				manager = "0";
				break;
			} else {
				break;
			}
		}
		System.out.print("�Ի�����(19/05/02): ");
		String hiredate = scn.nextLine();
		if (hiredate.equals("")) {
			hiredate = "sysdate";
		}
		String salary;
		while (true) {
			System.out.print("��      ��: ");
			salary = scn.nextLine();
			if (salary.equals("")) {
				salary = "0";
				break;
			} else {
				break;
			}
		}
		String commission;
		while (true) {
			System.out.print("Ŀ  ��  ��: ");
			commission = scn.nextLine();
			if (commission.equals("")) {
				commission = "0";
				break;
			} else {
				break;
			}
		}
		String dno;
		while (true) {
			System.out.print("�μ���ȣ: ");
			dno = scn.nextLine();
			if (dno.equals("10") || dno.equals("20") || dno.equals("30") || dno.equals("40")) {
				break;
			} else {
				System.err.println("�ùٸ� �μ���ȣ�� �ƴմϴ�. �ٽ��Է����ּ���.");
			}
		}
		while (true) {
			System.out.print("����Ͻðڽ��ϱ�?[Y]/[N]?-->");
			String answer = scn.next();
			if (answer.equalsIgnoreCase("Y")) {
				dao.insert(ename, job, Integer.parseInt(manager), hiredate, Integer.parseInt(salary),
						Integer.parseInt(commission), Integer.parseInt(dno));
				System.out.println("��ϼ���");
				break;
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println("���θ޴��� ���ư��ϴ�.");
				break;
			} else {
				System.err.println("[Y] �Ǵ� [N]�θ� �Է����ֽʽÿ�.");
			}
		}
	}

	public void method3() {
		while (true) {
			boolean sw = true;
			System.out.print("�˻��Ϸ��� ����̸�: ");
			String ename = scn.nextLine();
			if (dao.search(ename).size() > 0) {
				list = dao.search(ename);
				System.out.println("�����ȣ\t�̸�\t������\t\t����ȣ\t�Ի�����\t\t�޿�\tĿ�̼�\t�μ���");
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i).getEno() + "\t");
					System.out.print(list.get(i).getEname() + "\t");
					System.out.print(list.get(i).getJob() + "\t\t");
					System.out.print(list.get(i).getManager() + "\t");
					System.out.print(list.get(i).getHiredate().substring(0, 10) + "\t");
					System.out.print(list.get(i).getSalary() + "\t");
					System.out.print(list.get(i).getCommission() + "\t");
					System.out.println(list.get(i).getDname() + "\n");
					while (true) {
						System.out.print("�˻��� ����ұ��?[Y]/[N]?-->");
						String answer = scn.nextLine();
						if (answer.equalsIgnoreCase("Y")) {
							sw = false;
							break;
						} else if (answer.equalsIgnoreCase("N")) {
							System.out.println("���θ޴��� ���ư��ϴ�.");
							break;
						} else {
							System.err.println("[Y] �Ǵ� [N]�θ� �Է����ֽʽÿ�.");
						}
					}
				}
				if (sw) {
					break;
				}
			} else {
				System.err.println("�������� �ʴ� �����ȣ�Դϴ�.");
			}
		}
	}

	public void method4() {
		System.out.print("�����Ϸ��� �����ȣ: ");
		int eno = scn.nextInt();
		if (dao.search(eno).size() > 0) {
			list = dao.search(eno);
			System.out.println("�����ȣ\t�̸�\t������\t\t����ȣ\t�Ի�����\t\t�޿�\tĿ�̼�\t�μ���");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getEno() + "\t");
				System.out.print(list.get(i).getEname() + "\t");
				System.out.print(list.get(i).getJob().substring(0, 5) + "\t\t");
				System.out.print(list.get(i).getManager() + "\t");
				System.out.print(list.get(i).getHiredate().substring(0, 10) + "\t");
				System.out.print(list.get(i).getSalary() + "\t");
				System.out.print(list.get(i).getCommission() + "\t");
				System.out.println(list.get(i).getDname() + "\n");
			}
			scn.nextLine();
			String ename;
			while (true) {
				System.out.print("������ ����̸�: ");
				ename = scn.nextLine();
				if (ename.equals("")) {
					ename = list.get(0).getEname();
					break;
				} else {
					break;
				}
			}
			String job;
			while (true) {
				System.out.print("������  ������: ");
				job = scn.nextLine();
				if (job.equals("")) {
					job = list.get(0).getJob();
					break;
				} else {
					break;
				}
			}
			String manager;
			while (true) {
				System.out.print("������ ����ȣ: ");
				manager = scn.nextLine();
				if (manager.equals("")) {
					manager = list.get(0).getManager() + "";
					break;
				} else {
					break;
				}
			}
			System.out.print("������  �Ի�����: ");
			String hiredate = scn.nextLine();
			if (hiredate.equals("")) {
				String[] strarr = new String[3];
				strarr = list.get(0).getHiredate().split("-");
				hiredate = strarr[0] + "/" + strarr[1] + "/" + strarr[2];
			}
			String salary;
			while (true) {
				System.out.print("������ �޿�: ");
				salary = scn.nextLine();
				if (salary.equals("")) {
					salary = list.get(0).getSalary() + "";
					break;
				} else {
					break;
				}
			}
			String commission;
			while (true) {
				System.out.print("������ Ŀ�̼�: ");
				commission = scn.nextLine();
				if (commission.equals("")) {
					commission = list.get(0).getCommission() + "";
					break;
				} else {
					break;
				}
			}
			String dno;
			while (true) {
				System.out.print("�μ���ȣ: ");
				dno = scn.nextLine();
				if (dno.equals("10") || dno.equals("20") || dno.equals("30") || dno.equals("40")) {
					break;
				} else {
					System.err.println("�ùٸ� �μ���ȣ�� �ƴմϴ�. �ٽ��Է����ּ���.");
				}
			}
			dao.modify(eno, ename, job, Integer.parseInt(manager), hiredate, Integer.parseInt(salary),
					Integer.parseInt(commission), Integer.parseInt(dno));
		} else {
			System.err.println("�������� �ʴ� �����ȣ�Դϴ�.");
		}
	}

	public void method5() {
		System.out.print("�����Ϸ��� �����ȣ: ");
		int eno = scn.nextInt();
		if (dao.search(eno).size() > 0) {
			list = dao.search(eno);
			System.out.println("�����ȣ\t�̸�\t������\t\t����ȣ\t�Ի�����\t\t�޿�\tĿ�̼�\t�μ���");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getEno() + "\t");
				System.out.print(list.get(i).getEname() + "\t");
				System.out.print(list.get(i).getJob().substring(0, 5) + "\t\t");
				System.out.print(list.get(i).getManager() + "\t");
				System.out.print(list.get(i).getHiredate().substring(0, 10) + "\t");
				System.out.print(list.get(i).getSalary() + "\t");
				System.out.print(list.get(i).getCommission() + "\t");
				System.out.println(list.get(i).getDname() + "\n");
			}
			while (true) {
				scn.nextLine();
				System.out.println("�����Ͻðڽ��ϱ�?[Y]/[N]?-->");
				String answer = scn.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					dao.delete(eno);
					System.out.println("��������");
					break;
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("���θ޴��� ���ư��ϴ�.");
					break;
				} else {
					System.err.println("[Y] �Ǵ� [N]�θ� �Է����ֽʽÿ�.");
				}
			}
		} else {
			System.err.println("�������� �ʴ� �����ȣ�Դϴ�.");
		}
	}
}
