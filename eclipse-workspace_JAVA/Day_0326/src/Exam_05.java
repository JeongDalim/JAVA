
//키보드 입력방법2
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);// Scanner라는 틀에 scn이라는 스캐너를 만들어 main이라는 컴퓨터에 꽂 아준것
		System.out.print("정수입력: ");
		int num = scn.nextInt();// 정수를 입력받아 num에 대입
		System.out.println("10진수=" + num);
		System.out.println("2진수=" + Integer.toBinaryString(num));// 특이하게 문자열을 리턴한다 그러므로 변수 대입 시 String으로 선언해야한다.
		System.out.println("8진수=" + Integer.toOctalString(num));// 마찬가지
		System.out.println("16진수=" + Integer.toHexString(num));// 마찬가지

		String str = scn.next();// 문자열 입력받아 str에 대입 공백을 기준으로 함. String str2 =
		System.out.println(str);
		scn.nextLine();// 한줄 전체를 입력받아 str2에 대입 줄바꿈을 기준으로 함.
		scn.close();
	}
}
