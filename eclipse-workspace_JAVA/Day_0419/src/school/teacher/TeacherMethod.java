package school.teacher;

import java.util.List;

public class TeacherMethod {
	public void printTitle() {
		System.out.print("교사관리\n[1] 정보출력\n[2] 교번검색\n[3] 이름검색 \n[4] 담당과목검색\n[5] 종료\n메뉴선택([1]~[5]): ");
	}

	public void input1(List<Teacher> list) {
		System.out.println("==========================================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================================================");
	}

	public void input2(List<Teacher> list, int tno) {
		boolean sw = true;
		System.out.println("==========================================================");
		for (int i = 0; i < list.size(); i++) {
			if (tno == list.get(i).getTno()) {
				System.out.println(list.get(i));
				sw = false;
			}
		}
		System.out.println("==========================================================");
		if (sw) {
			System.out.println("존재하지 않는 교번입니다.");
		}
	}

	public void input3(List<Teacher> list, String name) {
		boolean sw = true;
		System.out.println("==========================================================");
		for (int i = 0; i < list.size(); i++) {
			String tempname = list.get(i).getName();
			if (tempname.indexOf(name) >= 0) {
				System.out.println(list.get(i));
				sw = false;
			}
		}
		System.out.println("==========================================================");
		if (sw) {
			System.out.println("존재하지 않는 아룸입니다.");
		}
	}

	public void input4(List<Teacher> list, String part) {
		boolean sw = true;
		System.out.println("==========================================================");
		for (int i = 0; i < list.size(); i++) {
			String parttemp = list.get(i).getPart();
			if (parttemp.indexOf(part) >= 0) {
				System.out.println(list.get(i));
				sw = false;
			}
		}
		System.out.println("==========================================================");
		if (sw) {
			System.out.println("존재하지 않는 과목입니다.");
		}
	}
}
