package Student.model;

import java.util.List;

import Student.vo.Student;

public class StudentModel {
	public static void print(List<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void studentRank(List<Student> list) {
		for (int j = 0; j < list.size(); j++) {
			int rank = 1;
			for (int k = 0; k < list.size(); k++) {
				if (list.get(j).getScore() < list.get(k).getScore()) {
					rank++;
				}
			}
			list.get(j).setRank(rank);
		}
	}

	public static void studentSort(List<Student> list, String str) {
		Student stu = null;
		if (str.matches("A")) {
			stu = new Student();
			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).getBun() > (list.get(j).getBun())) {
						stu = list.get(i);
						list.set(i, list.get(j));
						list.set(j, stu);
					}
				}
			}
		} else if (str.matches("D")) {
			stu = new Student();
			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).getBun() < (list.get(j).getBun())) {
						stu = list.get(i);
						list.set(i, list.get(j));
						list.set(j, stu);
					}
				}
			}
		}
	}

	public static void studentClass(List<Student> list) {

	}
}
