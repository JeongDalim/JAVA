import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student[] sArr = new Student[10];
		Student s1 = null;
		int cnt = 0;
		int score = 0;
		while (true) {
			System.out.print("��ȣ �Է�:");
			int num = scn.nextInt();
			if (num == 0) {
				break;
			}
			System.out.print("�̸� �Է�:");
			String name = scn.next();
			System.out.print("���� �Է�:");
			score = scn.nextInt();
			s1 = new Student(num, name, score);
			sArr[cnt] = s1;
			cnt++;
		}
		sArr[0].printTitle();
		for (int i = 0; i < cnt; i++) {
			sArr[i].printScore();
		}
		scn.close();
	}
}
