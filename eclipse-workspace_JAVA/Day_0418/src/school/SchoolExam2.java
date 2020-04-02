package school;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SchoolExam2 {
	public static void main(String[] args) throws FileNotFoundException {
		StudentData sd = new StudentData();
		TeacherData td = new TeacherData();

		Scanner scn = new Scanner(System.in);
		System.out.print("학번입력:");
		int bun = scn.nextInt();
		int teacherNum = 0;
		for (int i = 0; i < sd.studentList.size(); i++) {
			if (bun == sd.studentList.get(i).getBun()) {
				teacherNum = sd.studentList.get(i).getTno();
			}
		}
		String teacherName = "";
		for (int i = 0; i < td.teacherList.size(); i++) {
			if (teacherNum == td.teacherList.get(i).getTno()) {
				teacherName = td.teacherList.get(i).getName();
			}
		}
		System.out.println("학번은:" + bun + "\t" + "선생님번호:" + teacherNum + "\t" + "선생님이름:" + teacherName);
		scn.close();
	}
}
