import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("��ȣ: ");
		int num = scn.nextInt();
		System.out.print("�̸�: ");
		String name = scn.next();
		System.out.print("����: ");
		int kor = scn.nextInt();
		System.out.print("����: ");
		int eng = scn.nextInt();
		System.out.print("����: ");
		int mat = scn.nextInt();
		int tot = kor + eng + mat;
		double avg = (int) (tot / 3. * 100 + 0.5) / 100;

		System.out.println("\t\t\t**�����϶�ǥ**");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
		scn.close();
	}
}
