package Student.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Student.model.StudentModel;
import Student.vo.Student;

public class StudentExam {

	public static void main(String[] args) throws Exception {
		Student student = null;
		int tot = 0;
		Scanner scn = new Scanner(new File("c://text//datacheck2.txt"));
		System.out.println("��\t��ȣ\t�̸�\t����\t����");
		List<Student> list = new ArrayList<Student>();
		String[] jungDap = scn.nextLine().split(",");
		while (scn.hasNext()) {
			student = new Student();
			String[] StudentDap = scn.nextLine().split(",");
			for (int i = 0; i < jungDap.length; i++) { // ���� ����
				if (jungDap[i].equals(StudentDap[i + 3])) {
					tot = tot + 5;
				}
			}
			student.setBan(Integer.parseInt(StudentDap[0])); //
			student.setBun(Integer.parseInt(StudentDap[1]));
			student.setName(StudentDap[2]);
			student.setScore(tot);
			list.add(student);
			tot = 0;
		}
		StudentModel.print(list);
		System.out.println("=========================================����");
		StudentModel.studentRank(list);
		StudentModel.print(list);
		System.out.println("=========================================��������");
		StudentModel.studentSort(list, "A");
		StudentModel.print(list);
		System.out.println("=========================================��������");
		StudentModel.studentSort(list, "D");
		StudentModel.print(list);
		System.out.println("=========================================");
		scn.close();
	}
}
