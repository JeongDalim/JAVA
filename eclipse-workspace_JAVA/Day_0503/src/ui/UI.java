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
		System.out.println("교직원등록");
		while (true) {
			System.out.print("이름: ");
			name = scn.nextLine();
			if (name.equals("")) {
				System.err.println("이름은 필수입력사항입니다");
			} else {
				break;
			}
		}
		System.out.print("전화번호: ");
		tel = scn.nextLine();
		if (tel.equals("")) {
			tel = "0";
		}
		while (true) {
			System.out.print("담당과목: ");
			part = scn.nextLine();
			if (part.equals("")) {
				System.err.println("담당과목은 필수입력사항입니다");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("생년월일: ");
			birthday = scn.nextLine();
			if (birthday.equals("")) {
				System.err.println("생년월일은 필수입력사항입니다");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("등록할까요?[Y]/[N]_ ");
			String answer = scn.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				if (dao.Insert(name, tel, part, birthday) == 1) {
					System.out.println("등록성공! 메인메뉴로 돌아갑니다.");
					break;
				} else {
					System.err.println("등록실패! 메인메뉴로 돌아갑니다.");
					break;
				}
			} else {
				System.out.println("메인메뉴로 돌아갑니다.");
				break;
			}
		}
	}

	public void method2() {
		list = dao.print();
		System.out.println("교번\t이름\t전화\t담당과목\t생년월일\t\t입사일");
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
		System.out.println("교직원검색");
		System.out.print("검색하려는 교직원의 교번: ");
		int tno = scn.nextInt();
		list = dao.search(tno);
		if (list.size() > 0) {
			System.out.println("교번\t이름\t전화\t\t담당과목\t생년월일\t\t입사일");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTno() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getTel() + "\t");
				System.out.print(list.get(i).getPart() + "\t");
				System.out.print(list.get(i).getBirthday().substring(0, 10) + "\t");
				System.out.print(list.get(i).getRegdate() + "\n");
			}
			System.out.println("검색성공! 메인메뉴로 돌아갑니다.");

		} else {
			System.err.println("검색실패! 존재하지 않는 교번입니다. 메인메뉴로 돌아갑니다.");
		}
	}

	public void method4() {
		System.out.println("교직원수정");
		System.out.print("수정하려는 교직원의 교번: ");
		int tno = scn.nextInt();
		list = dao.search(tno);
		if (list.size() > 0) {
			System.out.println("교번\t이름\t전화\t\t담당과목\t생년월일\t\t입사일");
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
				System.out.print("수정하려는 이름: ");
				name = scn.nextLine();
				if (name.equals("")) {
					break;
				} else {
					break;
				}
			}
			System.out.print("수정하려는 전화번호: ");
			tel = scn.nextLine();
			if (tel.equals("")) {
				tel = "0";
			}
			while (true) {
				System.out.print("수정하려는 담당과목: ");
				part = scn.nextLine();
				if (part.equals("")) {
					System.err.println("담당과목은 필수입력사항입니다");
				} else {
					break;
				}
			}
			while (true) {
				System.out.print("수정하려는 생년월일: ");
				birthday = scn.nextLine();
				if (birthday.equals("")) {
					System.err.println("생년월일은 필수입력사항입니다");
				} else {
					break;
				}
			}
			System.out.print("수정하시겠습니까?[Y]/[N]_");
			String answer = scn.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				dao.modify(tno, name, tel, part, birthday);
				System.out.println("수정성공! 메인메뉴로 돌아갑니다.");
			} else {
				System.out.println("메인메뉴로 돌아갑니다.");
			}
		} else {
			System.err.println("검색실패! 존재하지 않는 교번입니다. 메인메뉴로 돌아갑니다.");
		}
	}

	public void method5() {
		System.out.println("교직원삭제");
		System.out.print("삭제하려는 교직원의 교번: ");
		int tno = scn.nextInt();
		list = dao.search(tno);
		if (list.size() > 0) {
			System.out.println("교번\t이름\t전화\t\t담당과목\t생년월일\t\t입사일");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getTno() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getTel() + "\t");
				System.out.print(list.get(i).getPart() + "\t");
				System.out.print(list.get(i).getBirthday().substring(0, 10) + "\t");
				System.out.print(list.get(i).getRegdate() + "\n");
			}
			System.out.print("삭제하시겠습니까?[Y]/[N]_");
			String answer = scn.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				if (dao.delete(tno) == 1) {
					System.out.println("삭제성공! 메인메뉴로 돌아갑니다.");
				}
			}
		} else {
			System.err.println("검색실패! 존재하지 않는 교번입니다. 메인메뉴로 돌아갑니다.");
		}
	}
}
