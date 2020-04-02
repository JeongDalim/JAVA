import java.util.ArrayList;
import java.util.List;

public class StudentData {
	List<Student> list = null;

	public StudentData() {
		list = new ArrayList<Student>();
		list.add(new Student(1, "AAA", 95));
		list.add(new Student(5, "BBB", 55));
		list.add(new Student(11, "CCC", 75));
		list.add(new Student(61, "DDD", 91));
		list.add(new Student(15, "EEE", 79));
		list.add(new Student(13, "FFF", 88));
		list.add(new Student(31, "GGG", 65));
		list.add(new Student(51, "HHH", 75));
		list.add(new Student(31, "III", 80));
	}

	public Student namesearch(String name) {
		Student student = null;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				student = list.get(i);
			}
		}
		return student;
	}

	public int scoreList(int var) {
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (var <= list.get(i).getScore()) {
				cnt++;
			}
		}
		return cnt;
	}
}
