
//키보드 입력방법
import java.io.IOException;

public class Exam_04 {
	public static void main(String[] args) throws IOException {

		int a = System.in.read(); // System.in.read();는 일문자만 받을 수 있다.
		System.out.println((char) a);// 받은 정수 a를 cha형으로 형변환하여 출력한다.ㅁ
	}
}
