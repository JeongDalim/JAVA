//1문자씩 입력받아 출력하기
import java.io.IOException;

public class Exam_03 {
	public static void main(String[] args) throws IOException {
		char a1 = (char) System.in.read();// 정수를 입력받아 char형으로 형변환하여 a1변수에 대입한다.
		char a2 = (char) System.in.read();
		char a3 = (char) System.in.read();
		char a4 = (char) System.in.read();
		char a5 = (char) System.in.read();
		System.out.println("A=" + ("" + a1 + a2 + a3 + a4 + a5));
		System.out.println("A=" + (+a1 + a2 + a3 + a4 + a5));
		System.out.println('J' + 'A' + 'V' + 'A');// 일문자끼리 더하면 정수가 출력됨.
		System.out.println("" + 'J' + 'A' + 'V' + 'A');// ""+를 해주면 문자열로 출력된다.
	}
}
