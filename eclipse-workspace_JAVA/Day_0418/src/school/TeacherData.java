package school;

import java.util.ArrayList;
import java.util.List;

public class TeacherData {
	List<Teacher> teacherList = null;

	public TeacherData() {
		teacherList = new ArrayList<Teacher>();
	}

	public void teacherinsert(Teacher teacher) {
		teacherList.add(teacher);
	}

	public void teacherPrint() {
		for (Teacher tea : teacherList) {
			System.out.println(tea);
		}
	}
}