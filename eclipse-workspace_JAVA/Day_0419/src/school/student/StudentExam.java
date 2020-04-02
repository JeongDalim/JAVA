package school.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentExam {
	public static void printTitle() {
		System.out.print("학생관리\n[1] 정보출력\n[2] 학번검색\n[3] 이름검색 \n[4] 종료\n메뉴선택([1]~[4]): ");
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scnfile = new Scanner(new File("c://text//student.txt"));
		Scanner scn = new Scanner(System.in);
		Student student = null;
		StudentData studentData = new StudentData();
		printTitle();
		int input = scn.nextInt();
		if (input == 1) {
			while (scnfile.hasNext()) {
				String[] str = scnfile.nextLine().split(",");
				int bun = Integer.parseInt(str[0]);
				String name = str[1];
				String tel = str[2];
				int score = Integer.parseInt(str[3]);
				int tno = Integer.parseInt(str[4]);
				student = new Student(bun, name, tel, score, tno);
				studentData.addStudent(student);
			}
			System.out.println("학번\t이름\t전화\t점수\t\t담당교사");
			Student temp = null;
			for (int i = 0; i < studentData.returnList().size() - 1; i++) {
				for (int j = i + 1; j < studentData.returnList().size(); j++) {
					if (studentData.returnList().get(i).getBun() > studentData.returnList().get(j).getBun()) {
						temp = studentData.returnList().get(i);
						studentData.returnList().set(i, studentData.returnList().get(j));
						studentData.returnList().set(j, temp);
					}
				}
			}
			for (int i = 0; i < studentData.returnList().size(); i++) {
				System.out.print(studentData.returnList().get(i).getBun() + "\t");
				System.out.print(studentData.returnList().get(i).getName() + "\t");
				System.out.print(studentData.returnList().get(i).getScore() + "\t");
				System.out.print(studentData.returnList().get(i).getTel() + "\t");
				System.out.println(studentData.returnList().get(i).getTno() + "\t");
			}
		} else if (input == 2) {
			while (scnfile.hasNext()) {
				String[] str = scnfile.nextLine().split(",");
				int bun = Integer.parseInt(str[0]);
				String name = str[1];
				String tel = str[2];
				int score = Integer.parseInt(str[3]);
				int tno = Integer.parseInt(str[4]);
				student = new Student(bun, name, tel, score, tno);
				studentData.addStudent(student);
			}
			System.out.print("학번검색:");
			int studentbun = scn.nextInt();
			boolean sw = true;
			for (int i = 0; i < studentData.returnList().size(); i++) {
				if (studentbun == studentData.returnList().get(i).getBun()) {
					System.out.println(studentData.returnList().get(i));
					sw = false;
					break;
				}
			}
			if (sw) {
				System.out.println("존재하지 않습니다.");
			}
		} else if (input == 3) {
			while (scnfile.hasNext()) {
				String[] str = scnfile.nextLine().split(",");
				int bun = Integer.parseInt(str[0]);
				String name = str[1];
				String tel = str[2];
				int score = Integer.parseInt(str[3]);
				int tno = Integer.parseInt(str[4]);
				student = new Student(bun, name, tel, score, tno);
				studentData.addStudent(student);
			}
			System.out.print("이름검색:");
			String name = scn.next();
			boolean sw = true;
			for (int i = 0; i < studentData.returnList().size(); i++) {
				String str = studentData.returnList().get(i).getName();
				if (str.indexOf(name) >= 0) {
					System.out.print(studentData.returnList().get(i).getBun() + "\t");
					System.out.print(studentData.returnList().get(i).getName() + "\t");
					System.out.print(studentData.returnList().get(i).getScore() + "\t");
					System.out.print(studentData.returnList().get(i).getTel() + "\t");
					System.out.println(studentData.returnList().get(i).getTno() + "\t");
					sw = false;
				}
			}
			if (sw) {
				System.out.println("존재하지 않는 이름입니다.");
			}
		} else {
			System.out.println("종료합니다.");
			System.exit(0);
		}
		scnfile.close();
		scn.close();
	}
}