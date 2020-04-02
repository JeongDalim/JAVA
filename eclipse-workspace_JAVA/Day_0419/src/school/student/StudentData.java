package school.student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
	List<Student> slist = null;

	public StudentData() {
		slist = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		slist.add(student);
	}

	public List<Student> returnList() {
		return slist;
	}

}
