import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("��ȣ: ");
		int num = scn.nextInt();
		System.out.print("�̸�: ");
		String name = new String(scn.next());
		System.out.print("��������: ");
		int kor = scn.nextInt();
		System.out.print("��������: ");
		int eng = scn.nextInt();
		System.out.print("��������: ");
		int mat = scn.nextInt();
		int tot = kor + eng + mat;
		double avg = tot / 3.;
		System.out.println("\t\t\t++++����ǥ++++");
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
		scn.close();
	}
}
