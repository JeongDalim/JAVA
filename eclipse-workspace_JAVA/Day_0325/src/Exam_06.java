import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("번호: ");
		int num = scn.nextInt();
		System.out.print("이름: ");
		String name = scn.next();
		System.out.print("국어: ");
		int kor = scn.nextInt();
		System.out.print("영어: ");
		int eng = scn.nextInt();
		System.out.print("수학: ");
		int mat = scn.nextInt();
		int tot = kor + eng + mat;
		double avg = (int) (tot / 3. * 100 + 0.5) / 100;

		System.out.println("\t\t\t**성적일람표**");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
		scn.close();
	}
}
