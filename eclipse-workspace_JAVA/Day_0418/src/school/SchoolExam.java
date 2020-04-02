package school;

import java.io.FileNotFoundException;

public class SchoolExam {
	public static void main(String[] args) throws FileNotFoundException {
		StudentExam2 se2 = new StudentExam2();
		se2.inputStudentData();
		StudentData sd = new StudentData();
		sd.studentPrint();
		System.out.println("==========================================");
		TeacherExam2 te2 = new TeacherExam2();
		te2.inputTeacherData();
		TeacherData td = new TeacherData();
		td.teacherPrint();
	}
}
