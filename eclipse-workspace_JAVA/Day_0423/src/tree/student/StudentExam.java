package tree.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student student = null;
		TreeSet<Student> set = new TreeSet<Student>();
		List<Student> list = new ArrayList<Student>();
		while (true) {
			System.out.print("번호,이름,점수 입력: ");
			String[] str = scn.nextLine().split(",");
			int bun = Integer.parseInt(str[0]);
			if (bun == 0) {
				break;
			}
			student = new Student(bun, str[1], Integer.parseInt(str[2]));
			set.add(student);
			if (list.contains(student)) {
			} else {
				list.add(student);
			}
		}
		System.out.println("번호\t이름\t점수");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=============================");
		System.out.println("번호\t이름\t점수");
		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		scn.close();
	}
}
