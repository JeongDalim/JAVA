package sawon.ui;

import java.util.List;
import java.util.Scanner;

import sawon.dao.DAO;
import sawon.vo.VO;

public class UI {
	DAO dao = new DAO();
	List<VO> list = null;
	VO vo = null;
	Scanner scn = new Scanner(System.in);

	public void method1(List<VO> list) {
		System.out.println("\t\t\t\t******��� ��ü ���******");
		System.out.println("�����ȣ\t�̸�\t������\t\t����ȣ\t�Ի�����\t\t�޿�\tĿ�̼�\t�μ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\t");
			if (list.get(i).getJob() == null) {
				System.out.print(list.get(i).getJob() + "\t\t");
			} else if (list.get(i).getJob().length() < 8) {
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

	public VO method2() {
		vo = new VO();
		System.out.println("\t***�ű� ��� ���� ���***");
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
			System.out.println("\t\t    �μ�����\n10=ACCOUNTING,20=RESEARCH,30=SALES,40=OPERATIONS");
			System.out.print("�μ���ȣ: ");
			dno = scn.nextLine();
			if (dno.equals("10") || dno.equals("20") || dno.equals("30") || dno.equals("40")) {
				break;
			} else {
				System.err.println("�ùٸ� �μ���ȣ�� �ƴմϴ�. �ٽ��Է����ּ���.");
			}
		}
		vo.setEname(ename);
		vo.setJob(job);
		vo.setManager(Integer.parseInt(manager));
		vo.setHiredate(hiredate);
		vo.setSalary(Integer.parseInt(salary));
		vo.setCommission(Integer.parseInt(commission));
		vo.setDno(Integer.parseInt(dno));
		while (true) {
			System.out.print("����Ͻðڽ��ϱ�?[Y]/[N]?-->");
			String answer = scn.next();
			if (answer.equalsIgnoreCase("Y")) {
				return vo;
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println("���θ޴��� ���ư��ϴ�.");
				return null;
			} else {
				System.err.println("[Y] �Ǵ� [N]�θ� �Է����ֽʽÿ�.");
			}
		}
	}

	public void method2_1(int result) {
		if (result != 0) {
			System.out.println("��� ����");
		} else {
			System.err.println("��Ͻ��� ���θ޴��� ���ư��ϴ�.");
		}
	}

	public String method3() {
		String ename;
		while (true) {
			System.out.print("�˻��Ϸ��� ����̸�: ");
			ename = scn.nextLine();
			if (dao.search(ename).isEmpty()) {
				System.err.println("�������� �ʴ� ����̸��Դϴ�.");
			} else {
				break;
			}
		}
		return ename;
	}

	public String method3_1(List<VO> list) {
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
					return method3();
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("���θ޴��� ���ư��ϴ�.");
					break;
				} else {
					System.err.println("[Y] �Ǵ� [N]�θ� �Է����ֽʽÿ�.");
				}
			}
		}
		return null;
	}

	public int method4() {
		System.out.print("�����Ϸ��� �����ȣ: ");
		String eno = scn.nextLine();
		return Integer.parseInt(eno);
	}

	public List<VO> method4_2(List<VO> list) {
		if (list.isEmpty()) {
			System.err.println("�������� �ʴ� �����ȣ�Դϴ�. ���θ޴��� �̵��մϴ�.");
		} else {
			System.out.println("�����ȣ\t�̸�\t������\t\t����ȣ\t�Ի�����\t\t�޿�\tĿ�̼�\t�μ���");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getEno() + "\t");
				System.out.print(list.get(i).getEname() + "\t");
				if (list.get(i).getJob() == null) {
					System.out.print(list.get(i).getJob() + "\t\t");
				} else if (list.get(i).getJob().length() < 8) {
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
				strarr = list.get(0).getHiredate().substring(0, 10).split("-");
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
				System.out.println("\t\t    �μ�����\n10=ACCOUNTING,20=RESEARCH,30=SALES,40=OPERATIONS");
				System.out.print("�μ���ȣ: ");
				dno = scn.nextLine();
				if (dno.equals("10") || dno.equals("20") || dno.equals("30") || dno.equals("40")) {
					break;
				} else {
					System.err.println("�ùٸ� �μ���ȣ�� �ƴմϴ�. �ٽ��Է����ּ���.");
				}
			}
			list.get(0).setEname(ename);
			list.get(0).setJob(job);
			list.get(0).setManager(Integer.parseInt(manager));
			list.get(0).setHiredate(hiredate);
			list.get(0).setSalary(Integer.parseInt(salary));
			list.get(0).setCommission(Integer.parseInt(commission));
			list.get(0).setDno(Integer.parseInt(dno));
		}
		return list;
	}

	public int method5() {
		System.out.print("�����Ϸ��� �����ȣ: ");
		String eno = scn.nextLine();
		return Integer.parseInt(eno);
	}

	public boolean method5_2(List<VO> list) {
		boolean sw = true;
		if (list.isEmpty()) {
			System.err.println("�������� �ʴ� �����ȣ�Դϴ�. ���θ޴��� �̵��մϴ�.");
			sw = false;
			return sw;
		} else {
			System.out.println("�����ȣ\t�̸�\t������\t\t����ȣ\t�Ի�����\t\t�޿�\tĿ�̼�\t�μ���");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getEno() + "\t");
				System.out.print(list.get(i).getEname() + "\t");
				if (list.get(i).getJob() == null) {
					System.out.print(list.get(i).getJob() + "\t\t");
				} else if (list.get(i).getJob().length() < 8) {
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
				System.out.print("�����Ͻðڽ��ϱ�?[Y]/[N]_");
				String answer = scn.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					break;
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("������ ����մϴ� .���θ޴��� ���ư��ϴ�.");
					sw = false;
					break;
				} else {
					System.err.println("[Y] �Ǵ� [N]�θ� �Է����ֽʽÿ�.");
				}
			}
			return sw;
		}
	}

	public void method5_3(int result) {
		if (result != 0) {
			System.out.println("��������");
		} else {
			System.err.println("��������");
		}
	}

}
