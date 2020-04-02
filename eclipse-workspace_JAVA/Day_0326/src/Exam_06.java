import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("학생정보입력(공백분리): ");
		int num = scn.nextInt();
		String name = new String(scn.next());
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int tot = kor + eng + mat;
		double avg = tot / 3.;
		System.out.println("\t\t\t\t성적표");
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
		scn.close();
	}
}
