package school;

import java.util.*;

public class StudentData {
	List<Student> studentList = null;

	public StudentData() {
		studentList = new ArrayList<Student>();
	}

	public void studentInsert(Student student) {
		studentList.add(student);
	}

	public void studentPrint() {
		for (Student stu : studentList) {
			System.out.println(stu);
		}
	}
}