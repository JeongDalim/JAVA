import java.util.Scanner;

public class Exam_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.print("�Է�: ");
			int a = scn.nextInt();
			if (a == 0) {
				System.out.println("i=" + i);
				System.exit(1); //break���� ����= break�� ���ǹ��� �����ϰ� ���ǹ� �ؿ� �ڵ带 ����. exit�� ��ü���α׷��� ����.
			} else {
				i++;
			}
			scn.close();
		}
	}

}
