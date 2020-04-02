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
		System.out.println("고객번호\t이름\t연락처\t\t주소\t직장명\t생년월일\t\t성별\t등록일자");
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
		System.out.println("신규 고객 정보 등록");
		System.out.print("고객번호: ");
		int num = scn.nextInt();
		System.out.print("고객명: ");
		String name = scn.next();
		System.out.print("연락처: ");
		String tel = scn.next();
		System.out.print("주소: ");
		String addr = scn.next();
		System.out.print("직장명: ");
		String office = scn.next();
		System.out.print("생년월일: ");
		String birthday = scn.next();
		System.out.print("성별: ");
		String sex = scn.next();
		vo.setNum(num);
		vo.setName(name);
		vo.setTel(tel);
		vo.setAddr(addr);
		vo.setOffice(office);
		vo.setBirthday(birthday);
		vo.setSex(sex);
		if (dao.insert(vo) == 1) {
			System.out.print("등록하시겠습니까? [Y]/[N]");
			String answer = scn.next();
			if (answer.equalsIgnoreCase("Y")) {
				System.out.println("등록 완료");
			} else {
				System.out.println("취소 완료");
			}
		} else {
			System.out.println("등록 실패");
		}
	}

	public void method3() {
		System.out.println("\t**고객 정보 검색**");
		System.out.print("원하는 고객의 이름을 입력하세요? ");
		String name = scn.next();
		if (dao.search(name) != null) {
			System.out.println("고객번호\t이름\t연락처\t\t주소\t직장명\t생년월일\t\t성별\t등록일자");
			System.out.print(dao.search(name).getNum() + "\t");
			System.out.print(dao.search(name).getName() + "\t");
			System.out.print(dao.search(name).getTel() + "\t");
			System.out.print(dao.search(name).getAddr() + "\t");
			System.out.print(dao.search(name).getOffice() + "\t");
			System.out.print(dao.search(name).getBirthday().substring(0, 10) + "\t");
			System.out.print(dao.search(name).getSex() + "\t");
			System.out.println(dao.search(name).getIndate());
			System.out.println("검색성공");
		} else {
			System.err.println("존재하지 않는 이름입니다.");
		}
	}

	public void method4() {
		System.out.println("\t**고객 정보 수정**");
		System.out.print("수정을 원하는 고객의 번호를 입력하세요? ");
		int num = scn.nextInt();
		String tel;
		String office;
		System.out.println("고객명: " + dao.search2(num).getName() + "\t *수정은 '연락처' , '직장명' 만 수정가능");
		while (true) {
			System.out.print("연락처명: ");
			tel = scn.nextLine();
			if (tel.equals("")) {
				System.out.println("연락처명은 필수 입니다.");
			} else {
				if (dao.modify(num, tel) == 1) {
					System.out.println("수정완료");
				} else {
					System.err.println("수정실패");
				}
				break;
			}
		}
		while (true) {
			System.out.print("직장명: ");
			office = scn.nextLine();
			if (office.equals("")) {
				System.out.println("직장명은 필수 입니다.");
			} else {
				if (dao.modify2(num, office) == 1) {
					System.out.println("수정완료");
				} else {
					System.err.println("수정실패");
				}
				break;
			}
		}

	}

	public void method5() {
		System.out.println("\t**고객 정보 삭제**");
		System.out.print("삭제을 원하는 고객의 번호를 입력하세요? ");
		int num = scn.nextInt();
		System.out.print("삭제하시겠습니까?[Y]/[N]");
		String answer = scn.next();
		if (answer.equalsIgnoreCase("Y")) {
			dao.delete(num);
			System.out.println("삭제성공");
		}
	}
}
