package member.ui;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;

public class MemberView {
	Scanner scn = new Scanner(System.in);

	public void memberList(List<MemberVO> list) {
		if (list.isEmpty()) {
			System.err.println("��ϵ� �ڷᰡ �����ϴ�.");
		} else {
			System.out.println("===========================ȸ����ü����Ʈ===========================");
			System.out.println("ȸ����: " + list.size() + "��");
			System.out.println("���̵�\t�̸�\t����\t�̸���\t\t\t�����");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getId() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getNation() + "\t");
				System.out.print(list.get(i).getEmail() + "\t");
				System.out.print(list.get(i).getRegdate().substring(0, 10) + "\n");
				if ((i + 1) % 5 == 0) {
					System.out.print("����Ͻðڽ��ϱ�?[Y]/[N]_");
					String answer = scn.nextLine();
					if (answer.equalsIgnoreCase("Y")) {
					} else {
						break;
					}
				}
			}
		}
	}

	public MemberVO memberInsert(Scanner scn) {
		System.out.println("ȸ�����");
		MemberVO vo = null;
		while (true) {
			vo = new MemberVO();
			String name;
			while (true) {
				System.out.print("�̸�: ");
				name = scn.nextLine();
				if (name.equals("")) {
					System.err.println("�̸��� �ʼ��Է»����Դϴ�.");
				} else {
					break;
				}
			}
			System.out.print("�ּ�: ");
			String addr = scn.nextLine();
			if (addr.equals("")) {
				addr = "";
			}
			System.out.print("����: ");
			String nation = scn.nextLine();
			if (nation.equals("")) {
				nation = "";
			}
			System.out.print("�̸���: ");
			String email = scn.nextLine();
			if (email.equals("")) {
				email = "";
			}
			System.out.print("����: ");
			String age = scn.nextLine();
			if (age.equals("")) {
				age = "0";
			}
			vo.setName(name);
			vo.setAddr(addr);
			vo.setNation(nation);
			vo.setEmail(email);
			vo.setAge(Integer.parseInt(age));
			return vo;
		}
	}

	public String memberSearch(Scanner scn) {
		System.out.println("ȸ�������˻�");
		System.out.print("�̸� �Ǵ� ID �Է�: ");
		String str = scn.nextLine();

		return str;
	}

	public void memberSearchView(List<MemberVO> list) {
		System.out.println("��¿�");
		if (list.isEmpty()) {
			System.err.println("��ϵ� �ڷᰡ �����ϴ�.");
		} else {
			System.out.println("���̵�\t�̸�\t����\t�̸���\t\t�����");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getId() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getNation() + "\t");
				System.out.print(list.get(i).getEmail() + "\t");
				System.out.print(list.get(i).getRegdate().substring(0, 10) + "\n");
			}
		}
	}

	public int memberModify(Scanner scn) {
		String str;
		System.out.println("ȸ����������");
		while (true) {
			System.out.print("ID �Է�: ");
			str = scn.nextLine();
			boolean sw = false;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch < '0' || ch > '9') {
					sw = true;
					break;
				}
			}
			if (!sw) {
				break;
			}
		}

		return Integer.parseInt(str);
	}

	public MemberVO memberModifyView(Scanner scn, MemberVO vo) {
		System.out.println("ȸ������");
		while (true) {
			System.out.println("id(" + vo.getId() + ")");
			System.out.print("�̸� (" + vo.getName() + ") :");
			String name = scn.nextLine();
			if (name.equals("")) {
				name = vo.getName();
			}
			System.out.print("�ּ� (" + vo.getAddr() + ") :");
			String addr = scn.nextLine();
			if (addr.equals("")) {
				addr = vo.getAddr();
			}
			System.out.print("���� (" + vo.getNation() + "): ");
			String nation = scn.nextLine();
			if (nation.equals("")) {
				nation = vo.getNation();
			}
			System.out.print("�̸��� (" + vo.getEmail() + "): ");
			String email = scn.nextLine();
			if (email.equals("")) {
				email = vo.getEmail();
			}
			System.out.print("���� (" + vo.getAge() + "):");
			String age = scn.nextLine();
			if (age.equals("")) {
				age = "" + vo.getAge();
			}
			vo.setId(vo.getId());
			vo.setName(name);
			vo.setAddr(addr);
			vo.setNation(nation);
			vo.setEmail(email);
			vo.setAge(Integer.parseInt(age));
			return vo;
		}
	}

	public int memberDelete(Scanner scn) {
		System.out.println("ȸ�� ���� ����");
		System.out.print("�����Ϸ��� ���̵�: ");
		String id = scn.nextLine();
		return Integer.parseInt(id);
	}
}
