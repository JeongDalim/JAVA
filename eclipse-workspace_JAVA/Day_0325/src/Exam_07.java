
//scn.nextInt();, scn.next();
import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("번호/이름/국어/영어/수학 입력: "); // 항목과 항목사이를 공백(space키)으로 분리한다.
		int num = scn.nextInt();
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int tot = kor + eng + mat;
		double avg = (int) (tot / 3. * 100 + 0.5) / 100;
		System.out.println("\t\t\t**성적일람표**");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
		scn.close();
	}
}
