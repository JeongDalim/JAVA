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
		System.out.println("======================사원정보 리스트======================");
		System.out.println("사원번호\t사원이름\t사원연락처\t사원급여\t입사일자");
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
		System.out.println("===사원정보 등록===");
		System.out.print("사원번호: ");
		int sno = scn.nextInt();
		System.out.print("사원이름: ");
		String name = scn.next();
		System.out.print("사원연락처: ");
		String tel = scn.next();
		System.out.print("사원급여: ");
		int pay = scn.nextInt();

		SawonVO sawonVO = new SawonVO();
		sawonVO.setSno(sno);
		sawonVO.setName(name);
		sawonVO.setTel(tel);
		sawonVO.setPay(pay);
		int row = sawonDAO.sawonInsert(sawonVO);

		if (row == 1) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
		scn.close();
	}

	public void method3() {
		System.out.print("수정하려는 사원번호 :");
		int sno = scn.nextInt();
		method5(sno);
		System.out.print("수정할 사원연락처: ");
		String tel = scn.next();
		if (tel.equals("no")) {
		} else {
			if (sawonDAO.sawonRevise(tel, sno) == 1) {
				sawonDAO.sawonRevise(tel, sno);
				System.out.println("수정성공");
			} else {
				System.out.println("수정실패");
			}
		}
		System.out.print("수정할 사원급여: ");
		int pay = scn.nextInt();
		if (pay == 0) {
		} else {
			if (sawonDAO.sawonRevise2(pay, sno) == 1) {
				sawonDAO.sawonRevise2(pay, sno);
				System.out.println("수정성공");
			} else {
				System.out.println("수정실패");
			}
		}
	}

	public void method4(int sno) {
		if (sawonDAO.sawonDelete(sno) == 1) {
			System.out.print("삭제할까요? [Y]/[N]: ");
			String anwers = scn.next();
			if (anwers.equalsIgnoreCase("Y")) {
				sawonDAO.sawonDelete(sno);
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		}
	}

	public void method5(int sno) {
		System.out.println("========================결과========================");
		System.out.println("사원번호\t사원이름\t사원연락처\t사원급여\t입사일자");
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
