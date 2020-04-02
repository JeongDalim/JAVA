package Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentExam {
	static void studentRanking(Student[] str) {
		for (int i = 0; i < str.length; i++) {
			int rank = 1;
			for (int j = 0; j < str.length; j++) {
				if (str[i].getTot() > str[j].getTot()) {
					rank++;
				}
			}
			str[i].setRank(rank);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		int cnt = 0;
		Scanner scn = new Scanner(new File("c://text//student.txt"));
		while (scn.hasNext()) {
			cnt++;
		}
		Student[] stuarr = new Student[cnt];
		scn = new Scanner(new File("c://text//student.txt"));
		for (int x = 0; x < cnt; x++) {
			String[] str = scn.nextLine().split(",");
			int bun = Integer.parseInt(str[0]); // 번호
			String name = str[1]; // 이름
			int[] jumsu = new int[5]; // 점수 5개
			for (int i = 0; i < jumsu.length; i++) {
				jumsu[i] = Integer.parseInt(str[i + 2]);
			}
			stuarr[x] = new Student(bun, name, jumsu);
		}
		studentRanking(stuarr);
		for (int i = 0; i < cnt; i++) {
			stuarr[i].print();
		}
		scn.close();
	}
}
