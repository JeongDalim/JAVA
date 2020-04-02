package StudentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Student s = null; // 클래스 변수 선언
		Scanner scn = new Scanner(System.in); // 스캐너 선언 및 할당
		List<Student> list = new ArrayList<Student>(); // 리스트 선언 및 할당
		while (true) { // 반복한다
			System.out.print("반 번호 체중"); // 반 번호 체중
			int ban = scn.nextInt(); // 반에 입력
			if (ban == 0) { // 반이 0일경우 break;
				break;
			}
			int bun = scn.nextInt(); // 번에 입력
			int kg = scn.nextInt(); // kg에 입력
			s = new Student(ban, bun, kg); // s 매개변수에 반 번 kg입력
			list.add(s); // 리스트에 s 추가
		}
		s.printTitle(); // 타이틀 출력
		int maxkg = list.get(0).kg;
		int minkg = list.get(0).kg;
		for (int i = 0; i < list.size(); i++) {
			if (maxkg < list.get(i).kg) {
				maxkg = list.get(i).kg;
			}
			if (minkg > list.get(i).kg) {
				minkg = list.get(i).kg;
			}
		}

		int bantemp = 0;

		for (int i = 0; i < list.size(); i++) {
			if (bantemp != list.get(i).ban) {
				bantemp = list.get(i).ban;
				System.out.println(list.get(i));
			} else {
				System.out.println(list.get(i).sameClass());
			}
		}

		System.out.println("최소체중:" + minkg + "kg");
		System.out.println("최대체중:" + maxkg + "kg");
		scn.close();
	}
}
