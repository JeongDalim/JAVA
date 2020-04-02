package school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TeacherExam2 {
	public TeacherData inputTeacherData() throws FileNotFoundException {
		TeacherData td = new TeacherData();
		Scanner scnfile = new Scanner(new File("c://text//teacher.txt"));
		Teacher teacher = null;
		while (scnfile.hasNext()) {
			String[] str = scnfile.nextLine().split(",");
			int tno = Integer.parseInt(str[0]);
			String name = str[1];
			String tel = str[2];
			String part = str[3];
			int age = Integer.parseInt(str[4]);
			teacher = new Teacher(tno, name, tel, part, age);
			td.teacherinsert(teacher);
		}
		td.teacherPrint();
		scnfile.close();
		return td;
	}
}