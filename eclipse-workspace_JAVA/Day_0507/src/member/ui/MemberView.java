package member.ui;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;

public class MemberView {
	Scanner scn = new Scanner(System.in);

	public void memberList(List<MemberVO> list) {
		if (list.isEmpty()) {
			System.err.println("등록된 자료가 없습니다.");
		} else {
			System.out.println("===========================회원전체리스트===========================");
			System.out.println("회원수: " + list.size() + "명");
			System.out.println("아이디\t이름\t국적\t이메일\t\t\t등록일");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getId() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getNation() + "\t");
				System.out.print(list.get(i).getEmail() + "\t");
				System.out.print(list.get(i).getRegdate().substring(0, 10) + "\n");
				if ((i + 1) % 5 == 0) {
					System.out.print("계속하시겠습니까?[Y]/[N]_");
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
		System.out.println("회원등록");
		MemberVO vo = null;
		while (true) {
			vo = new MemberVO();
			String name;
			while (true) {
				System.out.print("이름: ");
				name = scn.nextLine();
				if (name.equals("")) {
					System.err.println("이름은 필수입력사항입니다.");
				} else {
					break;
				}
			}
			System.out.print("주소: ");
			String addr = scn.nextLine();
			if (addr.equals("")) {
				addr = "";
			}
			System.out.print("국적: ");
			String nation = scn.nextLine();
			if (nation.equals("")) {
				nation = "";
			}
			System.out.print("이메일: ");
			String email = scn.nextLine();
			if (email.equals("")) {
				email = "";
			}
			System.out.print("나이: ");
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
		System.out.println("회원정보검색");
		System.out.print("이름 또는 ID 입력: ");
		String str = scn.nextLine();

		return str;
	}

	public void memberSearchView(List<MemberVO> list) {
		System.out.println("출력용");
		if (list.isEmpty()) {
			System.err.println("등록된 자료가 없습니다.");
		} else {
			System.out.println("아이디\t이름\t국적\t이메일\t\t등록일");
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
		System.out.println("회원정보수정");
		while (true) {
			System.out.print("ID 입력: ");
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
		System.out.println("회원수정");
		while (true) {
			System.out.println("id(" + vo.getId() + ")");
			System.out.print("이름 (" + vo.getName() + ") :");
			String name = scn.nextLine();
			if (name.equals("")) {
				name = vo.getName();
			}
			System.out.print("주소 (" + vo.getAddr() + ") :");
			String addr = scn.nextLine();
			if (addr.equals("")) {
				addr = vo.getAddr();
			}
			System.out.print("국적 (" + vo.getNation() + "): ");
			String nation = scn.nextLine();
			if (nation.equals("")) {
				nation = vo.getNation();
			}
			System.out.print("이메일 (" + vo.getEmail() + "): ");
			String email = scn.nextLine();
			if (email.equals("")) {
				email = vo.getEmail();
			}
			System.out.print("나이 (" + vo.getAge() + "):");
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
		System.out.println("회원 정보 삭제");
		System.out.print("삭제하려는 아이디: ");
		String id = scn.nextLine();
		return Integer.parseInt(id);
	}
}
