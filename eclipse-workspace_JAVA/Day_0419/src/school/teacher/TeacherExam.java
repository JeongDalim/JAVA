package school.teacher;

import java.io.File;
import java.util.Scanner;

public class TeacherExam {

	public static void main(String[] args) throws Exception {
		Scanner scnfile = new Scanner(new File("c://text//teacher.txt"));
		Scanner scn = new Scanner(System.in);
		Teacher teacher = null;
		TeacherData td = new TeacherData();
		TeacherMethod tm = new TeacherMethod();
		String[] str = null;
		while (scnfile.hasNext()) {
			str = scnfile.nextLine().split(",");
			int tno = Integer.parseInt(str[0]);
			String name = str[1];
			String tel = str[2];
			String part = str[3];
			int age = Integer.parseInt(str[4]);
			String regDate = str[5];
			teacher = new Teacher(tno, name, tel, part, age, regDate);
			td.addTeacher(teacher);
		}
		String strarr[] = null;
		for (int i = 0; i < td.retunrTeacher().size() - 1; i++) {
			for (int j = i + 1; j < td.retunrTeacher().size(); j++) {
				strarr = td.retunrTeacher().get(i).getRegDate().split("/");
				int temp1 = Integer.parseInt(strarr[0] + strarr[1] + strarr[2]);
				strarr = td.retunrTeacher().get(j).getRegDate().split("/");
				int temp2 = Integer.parseInt(strarr[0] + strarr[1] + strarr[2]);
				if (temp1 > temp2) {
					Teacher t = td.retunrTeacher().get(i);
					td.retunrTeacher().set(i, td.retunrTeacher().get(j));
					td.retunrTeacher().set(j, t);
				}
			}
		}

		while (true) {
			tm.printTitle();
			int input = scn.nextInt();
			if (input == 1) {
				tm.input1(td.retunrTeacher());
			} else if (input == 2) {
				System.out.print("교번검색: ");
				int tno = scn.nextInt();
				tm.input2(td.retunrTeacher(), tno);
			} else if (input == 3) {
				System.out.print("이름검색: ");
				String name = scn.next();
				tm.input3(td.retunrTeacher(), name);
			} else if (input == 4) {
				System.out.print("담당과목검색: ");
				String part = scn.next();
				tm.input4(td.retunrTeacher(), part);
			} else if (input == 5) {
				break;
			}
		}
		scnfile.close();
		scn.close();
	}
}
