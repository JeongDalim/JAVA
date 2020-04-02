package joinexam.ui;

import java.util.List;
import java.util.Scanner;
import joinexam.dao.DAO;
import joinexam.vo.VO;

public class UI {
	DAO dao = new DAO();
	Scanner scn = new Scanner(System.in);
	private List<VO> list;

	public void method1() {// 회원 목록 보기
		List<VO> list = dao.print();
		System.out.println("[1.회원 목록 보기]");
		System.out.println("=================전체회원목록=================");
		System.out.println("아이디\t이름\t이메일\t\t등록일자");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getUserid() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			if (list.get(i).getEmail() == null) {// 이메일이 NULL일 경우의 줄맞춤
				System.out.print(list.get(i).getEmail() + "\t\t");
			} else if (list.get(i).getEmail().length() < 10) {// 이메일이 10글자 이하일 경우의 줄맞춤
				System.out.print(list.get(i).getEmail() + "\t\t");
			} else {
				System.out.print(list.get(i).getEmail() + "\t");// 둘다 아닐 경우의 줄맞춤
			}
			System.out.print(list.get(i).getRegdate().substring(0, 10) + "\n");// 등록일자 년/월/일만 출력
		}
	}

	public void method2() {// 회원 정보 등록
		VO vo = new VO();
		System.out.println("[2.회원 정보 등록]");
		String userid = null;
		while (true) {
			boolean sw = true;
			if (userid != null) {
				break;
			}
			System.out.print("ID: ");
			userid = scn.nextLine();
			if (userid.length() > 10) {// 아이디 길이 예외처리
				System.err.println("아이디는 10자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
				sw = false;
				userid = null;
			}
			if (sw) {
				if (dao.insertOverlap(userid) == true) {// 중복방지
					System.err.println(userid + "는 이미 사용중인 아이디입니다.(재입력)");
					userid = null;
				} else {
					System.out.println(userid + "는 등록가능합니다.");
					break;
				}
			}
		}
		String name;
		while (true) {
			boolean sw = true;
			System.out.print("이름: ");
			name = scn.nextLine();
			for (int i = 0; i < name.length(); i++) { // 이름이 숫자일 경우 예외처리
				for (int j = 0; j < 10; j++) {
					if (name.substring(i).contains(j + "")) {
						System.err.println("이름은 숫자일 수 없습니다. 다시 입력해 주십시오");
						sw = false;
						i = name.length();
						break;
					}
				}
			}
			if (sw) {
				if (name.equals("")) {// 필수 입력 사항
					System.err.println("이름은 필수입력사항입니다. 다시 입력해 주십시오.");
				} else if (name.length() > 12) {// 이름 길이 예외처리
					System.err.println("이름은 12자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
				} else {
					break;
				}
			}
		}
		String passwd;
		while (true) {
			System.out.print("비밀번호: ");
			passwd = scn.nextLine();
			if (passwd.equals("")) {// 필수 입력 사항
				System.err.println("비밀번호는 필수입력사항입니다. 다시 입력해 주십시오.");
			} else if (passwd.length() > 12) {// 비밀번호 길이 예외처리
				System.err.println("비밀번호는 12자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
			} else {
				break;
			}
		}
		String email;
		while (true) {
			System.out.print("이메일: ");
			email = scn.nextLine();
			if (email.equals("")) {// ENTER입력 시 공백 입력
				email = " ";
				break;
			} else if (email.length() > 20) {// 이메일 길이 예외처리
				System.err.println("이메일은 20자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
			} else if (!email.contains("@")) {// 이메일 형식 예외처리
				System.err.println("이메일 형식이 맞지 않습니다. 다시 입력해 주십시오. ex)XXX@XXX");
			} else {
				break;
			}
		}
		String age;
		while (true) {
			boolean sw = true;
			System.out.print("나이: ");
			age = scn.nextLine();
			for (int i = 0; i < age.length(); i++) {
				if (age.charAt(i) > '9' || age.charAt(i) < '0') {// 숫자 대신 문자 입력시 예외처리
					System.err.println("나이는 문자일 수 없습니다. 다시 입력해 주십시오.");
					sw = false;
					break;
				}
			}

			if (sw) {
				if (age.equals("")) {
					age = "0";
					break;
				} else if (age.length() > 3) {// 나이 자릿수 예외처리
					System.err.println("나이는 3자리 이하로만 입력가능합니다. 다시 입력해 주십시오.");
				} else if (Integer.parseInt(age) < 0) {// 나이에 음수 입력시 예외처리
					System.err.println("나이는 음수일 수 없습니다. 다시 입력해 주십시오.");
				} else {
					break;
				}
			}
		}
		while (true) {
			System.out.print("등록하시겠습니까?[Y]/[N] ");
			String answer = scn.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				vo.setUserid(userid);
				vo.setName(name);
				vo.setPasswd(passwd);
				vo.setEmail(email);
				vo.setAge(Integer.parseInt(age));
				if (dao.insert(vo) != 0) {
					System.out.println(userid + "님의 정보를 등록하였습니다. 메인메뉴로 돌아갑니다.");
				} else {// 쿼리문 오류로 인한 삭제 실패 시의 예외처리
					System.err.println("등록실패! 메인메뉴로 돌아갑니다.");
				}
				break;
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println("등록을 취소합니다. 메인메뉴로 돌아갑니다.");
				break;
			} else {// [Y] 또는 [N]이외의 옵션을 입력했을 경우 예외처리
				System.err.println("[Y] 또는 [N]로만 입력가능합니다. 다시입력하여 주십시오");
			}
		}
	}

	public void method3() {// 로그인
		int cnt = 1;
		System.out.println("[3.로그인] ");
		String userid = null;
		while (cnt <= 3) {
			while (true) {
				System.out.print("ID: ");
				userid = scn.nextLine();
				if (userid.equals("")) {// 필수 입력 사항
					System.err.println("아이디는 필수입력사항입니다. 다시 입력해 주십시오.");
				} else if (userid.length() > 10) {// 아이디 길이 예외처리
					System.err.println("아이디는 10자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
				} else {
					break;
				}
			}
			String passwd = null;
			while (true) {
				System.out.print("PASS: ");
				passwd = scn.nextLine();
				if (passwd.equals("")) {// 필수 입력 사항
					System.err.println("비밀번호는 필수입력사항입니다. 다시 입력해 주십시오.");
				} else if (passwd.length() > 12) {// 비밀번호 길이 예외처리
					System.err.println("비밀번호는 12자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
				} else {
					break;
				}
			}
			int result = dao.login(userid, passwd);
			if (result == 1) {
				System.out.println("로그인 완료");
				break;
			} else if (result == -1) {
				System.err.println("비밀번호 오류입니다.");
			} else {
				System.err.println("아이디 또는 비밀번호 오류입니다.");
			}
			cnt++;
		}
		if (cnt == 4) {// 로그인 3회 오류시 메인메뉴로 이동
			System.err.println("로그인 3회 오류! 메인메뉴로 돌아갑니다.");
		}
	}

	public void method4() {// 회원 정보 검색
		System.out.println("[4.회원 정보 검색]");
		list = null;
		boolean sw2 = true;
		while (sw2) {
			System.out.println("검색할 I D[1] 또는 이름[2] 선택 후 검색  ex)1,홍길동:  ");
			String answer = scn.nextLine();
			boolean sw = true;
			String[] option = new String[answer.length()];
			option = answer.split(",");
			try {
				if (Integer.parseInt(option[0]) >= 3 || Integer.parseInt(option[0]) < 0) {
					System.err.println("옵션 1은 [1]또는 [2]로만 선택 가능합니다. 다시 입력해 주십시오.");
					sw = false;
				}
			} catch (NumberFormatException e) {
				System.err.println("지정된 형식이 아닙니다. 다시 입력해 주십시오.");
				sw = false;
			}
			if (sw) {
				for (int i = 0; i < option[0].length(); i++) {
					if (option[0].charAt(i) > '9' || option[0].charAt(i) < '0') { // 옵션 1에 문자 입력시 예외처리
						System.err.println("옵션 1은 문자일 수 없습니다. 다시 입력해 주십시오.");
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
				if (list.isEmpty()) {// 존재하지 않는 ID일 경우 예외처리
					System.err.print("존재하지 않는 ID 또는 이름입니다. 다시 검색할까요?[Y]/[N]: ");
					String answer2 = scn.nextLine();
					if (answer2.equalsIgnoreCase("Y")) {
					} else {
						System.out.println("메인메뉴로 이동합니다.");
						break;
					}
				} else {
					System.out.println("====================" + option[1] + "님의 정보====================");
					System.out.println("아이디\t이름\t이메일\t\t나이\t등록일자");
					for (int i = 0; i < list.size(); i++) {
						System.out.print(list.get(i).getUserid() + "\t");
						System.out.print(list.get(i).getName() + "\t");
						if (list.get(i).getEmail() == null) {// 이메일이 NULL일 경우의 줄맞춤
							System.out.print(list.get(i).getEmail() + "\t\t");
						} else if (list.get(i).getEmail().length() < 10) {// 이메일이 10글자 이하일 경우의 줄맞춤
							System.out.print(list.get(i).getEmail() + "\t\t");
						} else {
							System.out.print(list.get(i).getEmail() + "\t");// 둘다 아닐 경우의 줄맞춤
						}
						System.out.print(list.get(i).getAge() + "\t");
						System.out.print(list.get(i).getRegdate().substring(0, 10) + "\n");
					}
					while (true) {
						System.out.print("계속 검색하시겠습니까?[Y]/[N]: ");
						String answer2 = scn.nextLine();
						if (answer2.equalsIgnoreCase("Y")) {
							break;
						} else if (answer2.equalsIgnoreCase("N")) {
							System.out.println("메인메뉴로 돌아갑니다.");
							sw2 = false;
							break;
						} else {// [Y] 또는 [N]이외의 옵션을 입력했을 경우 예외처리
							System.err.println("[Y] 또는 [N]로만 입력가능합니다. 다시입력하여 주십시오");
						}
					}
				}
			}
		}
	}

	public void method5() {// 회원 정보 수정
		System.out.println("[5.회원 정보 수정]");
		System.out.print("수정할 ID: ");
		String userid = scn.nextLine();
		VO vo = new VO();
		List<VO> list = dao.search1(userid);
		String star = "";
		if (list.isEmpty()) {// 존재하지 않는 ID일 경우 예외처리
			System.err.println("존재하지 않는 ID입니다. 메인메뉴로 돌아갑니다.");
		} else {
			System.out.println("===============수정할" + userid + "님의 정보===============");
			System.out.println("아이디\t이름\t비밀번호\t이메일\t\t나이");
			System.out.print(list.get(0).getUserid() + "\t");
			System.out.print(list.get(0).getName() + "\t");
			for (int j = 0; j < list.get(0).getPasswd().length(); j++) {// 비밀번호의 글자수만큼 "*" 삽입
				star = star + "*";
			}
			System.out.print(star);
			System.out.print("\t" + list.get(0).getEmail() + "\t\t");
			System.out.print(list.get(0).getAge() + "\n");
			///////////////////////////////////////////////////////////////////////////////
			String name;
			while (true) {
				System.out.print("이름(" + list.get(0).getName() + "): ");
				name = scn.nextLine();
				if (name.equals("")) {
					name = list.get(0).getName();
				} else if (name.length() > 12) {
					System.err.println("이름은 12자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
				} else {
					break;
				}
			}
			System.out.print("비밀번호(" + star + "): ");// "*"출력
			String passwd;
			while (true) {
				passwd = scn.nextLine();
				if (passwd.equals("")) {// ENTER 입력 시 기존의 데이터 입력
					passwd = list.get(0).getPasswd();
				} else if (name.length() > 12) {
					System.err.println("비밀번호는 12자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
				} else {
					break;
				}
			}
			String email;
			while (true) {
				System.out.print("이메일(" + list.get(0).getEmail() + "): ");
				email = scn.nextLine();
				if (email.equals("")) {// ENTER 입력 시 기존의 데이터 입력
					email = list.get(0).getEmail();
				} else if (!email.contains("@")) {// 이메일 형식 예외처리
					System.err.println("이메일 형식이 맞지 않습니다. 다시 입력해 주십시오. ex)XXX@XXX");
				} else if (email.length() > 20) { // 이메일 길이 예외처리
					System.err.println("이메일은 20자 이하로만 입력가능합니다. 다시 입력해 주십시오.");
				} else {
					break;
				}
			}
			String age;
			while (true) {
				boolean sw = true;
				System.out.print("나이(" + list.get(0).getAge() + "): ");
				age = scn.nextLine();
				for (int i = 0; i < age.length(); i++) {
					if (age.charAt(i) > '9' || age.charAt(i) < '0') {// 숫자 대신 문자 입력시 예외처리
						System.err.println("나이는 문자일 수 없습니다. 다시 입력해 주십시오.");
						sw = false;
						break;
					}
				}
				if (sw) {
					if (age.equals("")) {// ENTER 입력 시 기존의 데이터 입력
						age = list.get(0).getAge() + "";
						break;
					} else if (age.length() > 3) {// 나이 자리수 예외처리
						System.err.println("나이는 3자리 이하로만 입력가능합니다. 다시 입력해 주십시오.");
					} else if (Integer.parseInt(age) < 0) {// 나이에 음수 입력시 예외처리
						System.err.println("나이는 음수일 수 없습니다. 다시 입력해 주십시오.");
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
				System.out.print(userid + "님의 정보를 수정할까요?[Y]/[N]: ");
				String answer = scn.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					if (dao.modify(vo) != 0) {
						System.out.println(userid + "님의 정보가 수정되었습니다. 메인메뉴로 이동합니다.");
						break;
					} else {// 쿼리문 오류로 인한 삭제 실패 시의 예외처리
						System.err.println("수정 실패! 메인메뉴로 이동합니다.");
						break;
					}
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("수정를 취소합니다. 메인메뉴로 이동합니다.");
					break;
				} else { // [Y] 또는 [N]이외의 옵션을 입력했을 경우 예외처리
					System.err.println("[Y] 또는 [N]로만 입력가능합니다. 다시입력하여 주십시오");
				}
			}
		}
	}

	public void method6() {// 회원 정보 삭제
		System.out.println("[6.회원 정보 삭제]");
		System.out.print("삭제할 ID: ");
		String userid = scn.nextLine();
		List<VO> list = dao.search1(userid);
		if (list.isEmpty()) {// 존재하지 않는 ID일 경우 예외처리
			System.err.println("존재하지 않는 ID입니다. 메인메뉴로 이동합니다.");
		} else {
			System.out.println("========삭제할" + userid + "님의 정보==========");
			System.out.println("아이디\t이름\t이메일");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getUserid() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				if (list.get(i).getEmail() == null) {// 이메일이 NULL일 경우의 줄맞춤
					System.out.print(list.get(i).getEmail() + "\t\t");
				} else if (list.get(i).getEmail().length() < 10) {// 이메일이 10글자 이하일 경우의 줄맞춤
					System.out.print(list.get(i).getEmail() + "\t\t");
				} else {
					System.out.print(list.get(i).getEmail() + "\n");// 둘다 아닐 경우의 줄맞춤
				}
			}
			while (true) {
				System.out.print(userid + "님의 정보를 삭제할까요?[Y]/[N]: ");
				String answer = scn.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					if (dao.delete(userid) != 0) {
						System.out.println(userid + "님의 정보가 삭제되었습니다. 메인메뉴로 이동합니다.");
						break;
					} else {// 쿼리문 오류로 인한 삭제 실패 시의 예외처리
						System.err.println("삭제실패! 메인메뉴로 돌아갑니다.");
					}
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("삭제를 취소합니다. 메인메뉴로 이동합니다.");
					break;
				} else {// [Y] 또는 [N]이외의 옵션을 입력했을 경우 예외처리
					System.err.println("[Y] 또는 [N]로만 입력가능합니다. 다시입력하여 주십시오");
				}
			}
		}
	}
}