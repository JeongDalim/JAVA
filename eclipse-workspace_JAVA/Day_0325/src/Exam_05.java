
//Scanner 클래스
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("번호: ");
		int var = scn.nextInt(); // <-정수입력(자료형)
		System.out.print("점수: ");
		int var2 = scn.nextInt(); // <-정수입력(자료형)
		System.out.print("이름: ");
		String str = scn.next(); // <-문자열입력
		System.out.println(var + "\t" + var2 + "\t" + str);
		String str2 = scn.nextLine(); // <-한줄 전체 입력
		System.out.println(str2);
		scn.close();
	}
}
