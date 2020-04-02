import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("번호: ");
		int num = scn.nextInt();
		System.out.print("이름: ");
		String name = new String(scn.next());
		System.out.print("국어점수: ");
		int kor = scn.nextInt();
		System.out.print("영어점수: ");
		int eng = scn.nextInt();
		System.out.print("수학점수: ");
		int mat = scn.nextInt();
		int tot = kor + eng + mat;
		double avg = tot / 3.;
		System.out.println("\t\t\t++++성적표++++");
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
		scn.close();
	}
}
