package joinexam.ui;

import java.util.List;
import java.util.Scanner;
import joinexam.dao.DAO;
import joinexam.vo.VO;

public class UI {
	DAO dao = new DAO();
	Scanner scn = new Scanner(System.in);
	private List<VO> list;

	public void method1() {// ȸ�� ��� ����
		List<VO> list = dao.print();
		System.out.println("[1.ȸ�� ��� ����]");
		System.out.println("=================��üȸ�����=================");
		System.out.println("���̵�\t�̸�\t�̸���\t\t�������");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getUserid() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			if (list.get(i).getEmail() == null) {// �̸����� NULL�� ����� �ٸ���
				System.out.print(list.get(i).getEmail() + "\t\t");
			} else if (list.get(i).getEmail().length() < 10) {// �̸����� 10���� ������ ����� �ٸ���
				System.out.print(list.get(i).getEmail() + "\t\t");
			} else {
				System.out.print(list.get(i).getEmail() + "\t");// �Ѵ� �ƴ� ����� �ٸ���
			}
			System.out.print(list.get(i).getRegdate().substring(0, 10) + "\n");// ������� ��/��/�ϸ� ���
		}
	}

	public void method2() {// ȸ�� ���� ���
		VO vo = new VO();
		System.out.println("[2.ȸ�� ���� ���]");
		String userid = null;
		while (true) {
			boolean sw = true;
			if (userid != null) {
				break;
			}
			System.out.print("ID: ");
			userid = scn.nextLine();
			if (userid.length() > 10) {// ���̵� ���� ����ó��
				System.err.println("���̵�� 10�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				sw = false;
				userid = null;
			}
			if (sw) {
				if (dao.insertOverlap(userid) == true) {// �ߺ�����
					System.err.println(userid + "�� �̹� ������� ���̵��Դϴ�.(���Է�)");
					userid = null;
				} else {
					System.out.println(userid + "�� ��ϰ����մϴ�.");
					break;
				}
			}
		}
		String name;
		while (true) {
			boolean sw = true;
			System.out.print("�̸�: ");
			name = scn.nextLine();
			for (int i = 0; i < name.length(); i++) { // �̸��� ������ ��� ����ó��
				for (int j = 0; j < 10; j++) {
					if (name.substring(i).contains(j + "")) {
						System.err.println("�̸��� ������ �� �����ϴ�. �ٽ� �Է��� �ֽʽÿ�");
						sw = false;
						i = name.length();
						break;
					}
				}
			}
			if (sw) {
				if (name.equals("")) {// �ʼ� �Է� ����
					System.err.println("�̸��� �ʼ��Է»����Դϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else if (name.length() > 12) {// �̸� ���� ����ó��
					System.err.println("�̸��� 12�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else {
					break;
				}
			}
		}
		String passwd;
		while (true) {
			System.out.print("��й�ȣ: ");
			passwd = scn.nextLine();
			if (passwd.equals("")) {// �ʼ� �Է� ����
				System.err.println("��й�ȣ�� �ʼ��Է»����Դϴ�. �ٽ� �Է��� �ֽʽÿ�.");
			} else if (passwd.length() > 12) {// ��й�ȣ ���� ����ó��
				System.err.println("��й�ȣ�� 12�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
			} else {
				break;
			}
		}
		String email;
		while (true) {
			System.out.print("�̸���: ");
			email = scn.nextLine();
			if (email.equals("")) {// ENTER�Է� �� ���� �Է�
				email = " ";
				break;
			} else if (email.length() > 20) {// �̸��� ���� ����ó��
				System.err.println("�̸����� 20�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
			} else if (!email.contains("@")) {// �̸��� ���� ����ó��
				System.err.println("�̸��� ������ ���� �ʽ��ϴ�. �ٽ� �Է��� �ֽʽÿ�. ex)XXX@XXX");
			} else {
				break;
			}
		}
		String age;
		while (true) {
			boolean sw = true;
			System.out.print("����: ");
			age = scn.nextLine();
			for (int i = 0; i < age.length(); i++) {
				if (age.charAt(i) > '9' || age.charAt(i) < '0') {// ���� ��� ���� �Է½� ����ó��
					System.err.println("���̴� ������ �� �����ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
					sw = false;
					break;
				}
			}

			if (sw) {
				if (age.equals("")) {
					age = "0";
					break;
				} else if (age.length() > 3) {// ���� �ڸ��� ����ó��
					System.err.println("���̴� 3�ڸ� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else if (Integer.parseInt(age) < 0) {// ���̿� ���� �Է½� ����ó��
					System.err.println("���̴� ������ �� �����ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else {
					break;
				}
			}
		}
		while (true) {
			System.out.print("����Ͻðڽ��ϱ�?[Y]/[N] ");
			String answer = scn.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				vo.setUserid(userid);
				vo.setName(name);
				vo.setPasswd(passwd);
				vo.setEmail(email);
				vo.setAge(Integer.parseInt(age));
				if (dao.insert(vo) != 0) {
					System.out.println(userid + "���� ������ ����Ͽ����ϴ�. ���θ޴��� ���ư��ϴ�.");
				} else {// ������ ������ ���� ���� ���� ���� ����ó��
					System.err.println("��Ͻ���! ���θ޴��� ���ư��ϴ�.");
				}
				break;
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println("����� ����մϴ�. ���θ޴��� ���ư��ϴ�.");
				break;
			} else {// [Y] �Ǵ� [N]�̿��� �ɼ��� �Է����� ��� ����ó��
				System.err.println("[Y] �Ǵ� [N]�θ� �Է°����մϴ�. �ٽ��Է��Ͽ� �ֽʽÿ�");
			}
		}
	}

	public void method3() {// �α���
		int cnt = 1;
		System.out.println("[3.�α���] ");
		String userid = null;
		while (cnt <= 3) {
			while (true) {
				System.out.print("ID: ");
				userid = scn.nextLine();
				if (userid.equals("")) {// �ʼ� �Է� ����
					System.err.println("���̵�� �ʼ��Է»����Դϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else if (userid.length() > 10) {// ���̵� ���� ����ó��
					System.err.println("���̵�� 10�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else {
					break;
				}
			}
			String passwd = null;
			while (true) {
				System.out.print("PASS: ");
				passwd = scn.nextLine();
				if (passwd.equals("")) {// �ʼ� �Է� ����
					System.err.println("��й�ȣ�� �ʼ��Է»����Դϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else if (passwd.length() > 12) {// ��й�ȣ ���� ����ó��
					System.err.println("��й�ȣ�� 12�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else {
					break;
				}
			}
			int result = dao.login(userid, passwd);
			if (result == 1) {
				System.out.println("�α��� �Ϸ�");
				break;
			} else if (result == -1) {
				System.err.println("��й�ȣ �����Դϴ�.");
			} else {
				System.err.println("���̵� �Ǵ� ��й�ȣ �����Դϴ�.");
			}
			cnt++;
		}
		if (cnt == 4) {// �α��� 3ȸ ������ ���θ޴��� �̵�
			System.err.println("�α��� 3ȸ ����! ���θ޴��� ���ư��ϴ�.");
		}
	}

	public void method4() {// ȸ�� ���� �˻�
		System.out.println("[4.ȸ�� ���� �˻�]");
		list = null;
		boolean sw2 = true;
		while (sw2) {
			System.out.println("�˻��� I D[1] �Ǵ� �̸�[2] ���� �� �˻�  ex)1,ȫ�浿:  ");
			String answer = scn.nextLine();
			boolean sw = true;
			String[] option = new String[answer.length()];
			option = answer.split(",");
			try {
				if (Integer.parseInt(option[0]) >= 3 || Integer.parseInt(option[0]) < 0) {
					System.err.println("�ɼ� 1�� [1]�Ǵ� [2]�θ� ���� �����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
					sw = false;
				}
			} catch (NumberFormatException e) {
				System.err.println("������ ������ �ƴմϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				sw = false;
			}
			if (sw) {
				for (int i = 0; i < option[0].length(); i++) {
					if (option[0].charAt(i) > '9' || option[0].charAt(i) < '0') { // �ɼ� 1�� ���� �Է½� ����ó��
						System.err.println("�ɼ� 1�� ������ �� �����ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
						sw = false;
						break;
					}
				}
			}
			if (sw) {
				if (Integer.parseInt(option[0]) == 1) {
					list = dao.search1(option[1]);
				} else if (Integer.parseInt(option[0]) == 2) {
					list = dao.search2(option[1]);
				}
			}
			if (sw) {
				if (list.isEmpty()) {// �������� �ʴ� ID�� ��� ����ó��
					System.err.print("�������� �ʴ� ID �Ǵ� �̸��Դϴ�. �ٽ� �˻��ұ��?[Y]/[N]: ");
					String answer2 = scn.nextLine();
					if (answer2.equalsIgnoreCase("Y")) {
					} else {
						System.out.println("���θ޴��� �̵��մϴ�.");
						break;
					}
				} else {
					System.out.println("====================" + option[1] + "���� ����====================");
					System.out.println("���̵�\t�̸�\t�̸���\t\t����\t�������");
					for (int i = 0; i < list.size(); i++) {
						System.out.print(list.get(i).getUserid() + "\t");
						System.out.print(list.get(i).getName() + "\t");
						if (list.get(i).getEmail() == null) {// �̸����� NULL�� ����� �ٸ���
							System.out.print(list.get(i).getEmail() + "\t\t");
						} else if (list.get(i).getEmail().length() < 10) {// �̸����� 10���� ������ ����� �ٸ���
							System.out.print(list.get(i).getEmail() + "\t\t");
						} else {
							System.out.print(list.get(i).getEmail() + "\t");// �Ѵ� �ƴ� ����� �ٸ���
						}
						System.out.print(list.get(i).getAge() + "\t");
						System.out.print(list.get(i).getRegdate().substring(0, 10) + "\n");
					}
					while (true) {
						System.out.print("��� �˻��Ͻðڽ��ϱ�?[Y]/[N]: ");
						String answer2 = scn.nextLine();
						if (answer2.equalsIgnoreCase("Y")) {
							break;
						} else if (answer2.equalsIgnoreCase("N")) {
							System.out.println("���θ޴��� ���ư��ϴ�.");
							sw2 = false;
							break;
						} else {// [Y] �Ǵ� [N]�̿��� �ɼ��� �Է����� ��� ����ó��
							System.err.println("[Y] �Ǵ� [N]�θ� �Է°����մϴ�. �ٽ��Է��Ͽ� �ֽʽÿ�");
						}
					}
				}
			}
		}
	}

	public void method5() {// ȸ�� ���� ����
		System.out.println("[5.ȸ�� ���� ����]");
		System.out.print("������ ID: ");
		String userid = scn.nextLine();
		VO vo = new VO();
		List<VO> list = dao.search1(userid);
		String star = "";
		if (list.isEmpty()) {// �������� �ʴ� ID�� ��� ����ó��
			System.err.println("�������� �ʴ� ID�Դϴ�. ���θ޴��� ���ư��ϴ�.");
		} else {
			System.out.println("===============������" + userid + "���� ����===============");
			System.out.println("���̵�\t�̸�\t��й�ȣ\t�̸���\t\t����");
			System.out.print(list.get(0).getUserid() + "\t");
			System.out.print(list.get(0).getName() + "\t");
			for (int j = 0; j < list.get(0).getPasswd().length(); j++) {// ��й�ȣ�� ���ڼ���ŭ "*" ����
				star = star + "*";
			}
			System.out.print(star);
			System.out.print("\t" + list.get(0).getEmail() + "\t\t");
			System.out.print(list.get(0).getAge() + "\n");
			///////////////////////////////////////////////////////////////////////////////
			String name;
			while (true) {
				System.out.print("�̸�(" + list.get(0).getName() + "): ");
				name = scn.nextLine();
				if (name.equals("")) {
					name = list.get(0).getName();
				} else if (name.length() > 12) {
					System.err.println("�̸��� 12�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else {
					break;
				}
			}
			System.out.print("��й�ȣ(" + star + "): ");// "*"���
			String passwd;
			while (true) {
				passwd = scn.nextLine();
				if (passwd.equals("")) {// ENTER �Է� �� ������ ������ �Է�
					passwd = list.get(0).getPasswd();
				} else if (name.length() > 12) {
					System.err.println("��й�ȣ�� 12�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else {
					break;
				}
			}
			String email;
			while (true) {
				System.out.print("�̸���(" + list.get(0).getEmail() + "): ");
				email = scn.nextLine();
				if (email.equals("")) {// ENTER �Է� �� ������ ������ �Է�
					email = list.get(0).getEmail();
				} else if (!email.contains("@")) {// �̸��� ���� ����ó��
					System.err.println("�̸��� ������ ���� �ʽ��ϴ�. �ٽ� �Է��� �ֽʽÿ�. ex)XXX@XXX");
				} else if (email.length() > 20) { // �̸��� ���� ����ó��
					System.err.println("�̸����� 20�� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else {
					break;
				}
			}
			String age;
			while (true) {
				boolean sw = true;
				System.out.print("����(" + list.get(0).getAge() + "): ");
				age = scn.nextLine();
				for (int i = 0; i < age.length(); i++) {
					if (age.charAt(i) > '9' || age.charAt(i) < '0') {// ���� ��� ���� �Է½� ����ó��
						System.err.println("���̴� ������ �� �����ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
						sw = false;
						break;
					}
				}
				if (sw) {
					if (age.equals("")) {// ENTER �Է� �� ������ ������ �Է�
						age = list.get(0).getAge() + "";
						break;
					} else if (age.length() > 3) {// ���� �ڸ��� ����ó��
						System.err.println("���̴� 3�ڸ� ���Ϸθ� �Է°����մϴ�. �ٽ� �Է��� �ֽʽÿ�.");
					} else if (Integer.parseInt(age) < 0) {// ���̿� ���� �Է½� ����ó��
						System.err.println("���̴� ������ �� �����ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
					} else {
						break;
					}
				}
			}
			vo.setUserid(userid);
			vo.setName(name);
			vo.setPasswd(passwd);
			vo.setEmail(email);
			vo.setAge(Integer.parseInt(age));
			while (true) {
				System.out.print(userid + "���� ������ �����ұ��?[Y]/[N]: ");
				String answer = scn.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					if (dao.modify(vo) != 0) {
						System.out.println(userid + "���� ������ �����Ǿ����ϴ�. ���θ޴��� �̵��մϴ�.");
						break;
					} else {// ������ ������ ���� ���� ���� ���� ����ó��
						System.err.println("���� ����! ���θ޴��� �̵��մϴ�.");
						break;
					}
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("������ ����մϴ�. ���θ޴��� �̵��մϴ�.");
					break;
				} else { // [Y] �Ǵ� [N]�̿��� �ɼ��� �Է����� ��� ����ó��
					System.err.println("[Y] �Ǵ� [N]�θ� �Է°����մϴ�. �ٽ��Է��Ͽ� �ֽʽÿ�");
				}
			}
		}
	}

	public void method6() {// ȸ�� ���� ����
		System.out.println("[6.ȸ�� ���� ����]");
		System.out.print("������ ID: ");
		String userid = scn.nextLine();
		List<VO> list = dao.search1(userid);
		if (list.isEmpty()) {// �������� �ʴ� ID�� ��� ����ó��
			System.err.println("�������� �ʴ� ID�Դϴ�. ���θ޴��� �̵��մϴ�.");
		} else {
			System.out.println("========������" + userid + "���� ����==========");
			System.out.println("���̵�\t�̸�\t�̸���");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getUserid() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				if (list.get(i).getEmail() == null) {// �̸����� NULL�� ����� �ٸ���
					System.out.print(list.get(i).getEmail() + "\t\t");
				} else if (list.get(i).getEmail().length() < 10) {// �̸����� 10���� ������ ����� �ٸ���
					System.out.print(list.get(i).getEmail() + "\t\t");
				} else {
					System.out.print(list.get(i).getEmail() + "\n");// �Ѵ� �ƴ� ����� �ٸ���
				}
			}
			while (true) {
				System.out.print(userid + "���� ������ �����ұ��?[Y]/[N]: ");
				String answer = scn.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					if (dao.delete(userid) != 0) {
						System.out.println(userid + "���� ������ �����Ǿ����ϴ�. ���θ޴��� �̵��մϴ�.");
						break;
					} else {// ������ ������ ���� ���� ���� ���� ����ó��
						System.err.println("��������! ���θ޴��� ���ư��ϴ�.");
					}
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("������ ����մϴ�. ���θ޴��� �̵��մϴ�.");
					break;
				} else {// [Y] �Ǵ� [N]�̿��� �ɼ��� �Է����� ��� ����ó��
					System.err.println("[Y] �Ǵ� [N]�θ� �Է°����մϴ�. �ٽ��Է��Ͽ� �ֽʽÿ�");
				}
			}
		}
	}
}