package school.teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherData {
	List<Teacher> tlist = null;


	public TeacherData() {
		tlist = new ArrayList<Teacher>();
	}
	
	public void addTeacher(Teacher teacher) {
		tlist.add(teacher);
	}

	public List<Teacher> retunrTeacher() {
		return tlist;
	}
}
