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
		System.out.println("\t\t\t\t******사원 전체 목록******");
		System.out.println("사원번호\t이름\t업무명\t\t상사번호\t입사일자\t\t급여\t커미션\t부서명");
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
			System.out.println("메인 메뉴로 이동합니다(Enter)? -->");
			String answer = scn.nextLine();
			if (answer.equals("")) {
				break;
			} else {
				System.err.println("다시입력해주세요");
			}
		}
	}

	public void method2() {
		System.out.println("\t***신규 고객 정보 등록***");
		String ename;
		while (true) {
			System.out.print("사원이름: ");
			ename = scn.nextLine();
			if (ename.equals("")) {
				System.err.println("사원이름은 필수입력 사항입니다 다시 입력해 주십시오.");
			} else {
				break;
			}
		}
		String job;
		while (true) {
			System.out.print("업  무  명: ");
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
			System.out.print("상사번호: ");
			manager = scn.nextLine();
			if (manager.equals("")) {
				manager = "0";
				break;
			} else {
				break;
			}
		}
		System.out.print("입사일자(19/05/02): ");
		String hiredate = scn.nextLine();
		if (hiredate.equals("")) {
			hiredate = "sysdate";
		}
		String salary;
		while (true) {
			System.out.print("급      여: ");
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
			System.out.print("커  미  션: ");
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
			System.out.print("부서번호: ");
			dno = scn.nextLine();
			if (dno.equals("10") || dno.equals("20") || dno.equals("30") || dno.equals("40")) {
				break;
			} else {
				System.err.println("올바른 부서번호가 아닙니다. 다시입력해주세요.");
			}
		}
		while (true) {
			System.out.print("등록하시겠습니까?[Y]/[N]?-->");
			String answer = scn.next();
			if (answer.equalsIgnoreCase("Y")) {
				dao.insert(ename, job, Integer.parseInt(manager), hiredate, Integer.parseInt(salary),
						Integer.parseInt(commission), Integer.parseInt(dno));
				System.out.println("등록성공");
				break;
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println("메인메뉴로 돌아갑니다.");
				break;
			} else {
				System.err.println("[Y] 또는 [N]로만 입력해주십시오.");
			}
		}
	}

	public void method3() {
		while (true) {
			boolean sw = true;
			System.out.print("검색하려는 사원이름: ");
			String ename = scn.nextLine();
			if (dao.search(ename).size() > 0) {
				list = dao.search(ename);
				System.out.println("사원번호\t이름\t업무명\t\t상사번호\t입사일자\t\t급여\t커미션\t부서명");
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
						System.out.print("검색을 계속할까요?[Y]/[N]?-->");
						String answer = scn.nextLine();
						if (answer.equalsIgnoreCase("Y")) {
							sw = false;
							break;
						} else if (answer.equalsIgnoreCase("N")) {
							System.out.println("메인메뉴로 돌아갑니다.");
							break;
						} else {
							System.err.println("[Y] 또는 [N]로만 입력해주십시오.");
						}
					}
				}
				if (sw) {
					break;
				}
			} else {
				System.err.println("존재하지 않는 사원번호입니다.");
			}
		}
	}

	public void method4() {
		System.out.print("수정하려는 사원번호: ");
		int eno = scn.nextInt();
		if (dao.search(eno).size() > 0) {
			list = dao.search(eno);
			System.out.println("사원번호\t이름\t업무명\t\t상사번호\t입사일자\t\t급여\t커미션\t부서명");
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
				System.out.print("변경할 사원이름: ");
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
				System.out.print("변경할  업무명: ");
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
				System.out.print("변경할 상사번호: ");
				manager = scn.nextLine();
				if (manager.equals("")) {
					manager = list.get(0).getManager() + "";
					break;
				} else {
					break;
				}
			}
			System.out.print("변경할  입사일자: ");
			String hiredate = scn.nextLine();
			if (hiredate.equals("")) {
				String[] strarr = new String[3];
				strarr = list.get(0).getHiredate().split("-");
				hiredate = strarr[0] + "/" + strarr[1] + "/" + strarr[2];
			}
			String salary;
			while (true) {
				System.out.print("변경할 급여: ");
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
				System.out.print("변경할 커미션: ");
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
				System.out.print("부서번호: ");
				dno = scn.nextLine();
				if (dno.equals("10") || dno.equals("20") || dno.equals("30") || dno.equals("40")) {
					break;
				} else {
					System.err.println("올바른 부서번호가 아닙니다. 다시입력해주세요.");
				}
			}
			dao.modify(eno, ename, job, Integer.parseInt(manager), hiredate, Integer.parseInt(salary),
					Integer.parseInt(commission), Integer.parseInt(dno));
		} else {
			System.err.println("존재하지 않는 사원번호입니다.");
		}
	}

	public void method5() {
		System.out.print("삭제하려는 사원번호: ");
		int eno = scn.nextInt();
		if (dao.search(eno).size() > 0) {
			list = dao.search(eno);
			System.out.println("사원번호\t이름\t업무명\t\t상사번호\t입사일자\t\t급여\t커미션\t부서명");
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
				System.out.println("삭제하시겠습니까?[Y]/[N]?-->");
				String answer = scn.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					dao.delete(eno);
					System.out.println("삭제성공");
					break;
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("메인메뉴로 돌아갑니다.");
					break;
				} else {
					System.err.println("[Y] 또는 [N]로만 입력해주십시오.");
				}
			}
		} else {
			System.err.println("존재하지 않는 사원번호입니다.");
		}
	}
}
