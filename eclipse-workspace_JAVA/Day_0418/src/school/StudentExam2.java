package school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentExam2 {
	public StudentData inputStudentData() throws FileNotFoundException {
		Scanner scnfile = new Scanner(new File("c://text//student.txt"));
		Student student = null;
		StudentData sd = new StudentData();
		while (scnfile.hasNext()) {
			String[] str = scnfile.nextLine().split(",");
			int bun = Integer.parseInt(str[0]);
			String name = str[1];
			String tel = str[2];
			int score = Integer.parseInt(str[3]);
			int tno = Integer.parseInt(str[4]);
			student = new Student(bun, name, tel, score, tno);
			sd.studentInsert(student);
		}
		sd.studentPrint();
		scnfile.close();
		return sd;
	}
}