package list.test;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Student> slist = new Vector<Student>();
		Student student = null;
		while (slist.size() < 5) {
			System.out.print("입력: ");
			String[] str = scn.nextLine().split(",");
			if (str[0].equals("0")) {
				break;
			}
			student = new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]));
			if (slist.contains(student)) {
				System.out.println("중복되었습니다.");
			} else {
				slist.add(student);
			}
		}
		for (Student student2 : slist) {
			System.out.println(student2);
		}
		scn.close();
	}
}
