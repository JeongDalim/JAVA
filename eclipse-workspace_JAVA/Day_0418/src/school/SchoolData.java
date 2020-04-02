package school;

import java.util.ArrayList;
import java.util.List;

public class SchoolData {
	List<Student> studentList;
	List<Teacher> teacherList;

	public SchoolData() {
		studentList = new ArrayList<Student>();
		teacherList = new ArrayList<Teacher>();
	}

	public void studentInsert(Student student) {
		studentList.add(student);
	}

	public void teacherinsert(Teacher teacher) {
		teacherList.add(teacher);
	}
}
