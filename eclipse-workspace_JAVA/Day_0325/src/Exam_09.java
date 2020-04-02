
public class Exam_09 {
	public static void main(String[] args) {

		char ch = 65;
		System.out.println(ch);
		int A = ch;
		System.out.println(A);
		int B = (char) ch + 1;// 다른 자료형끼리의 연산 결과를 대입할 경우, 큰 자료형으로 변수를 선언해야 한다.
		System.out.println((char) B);// 결과값을 아스키코드로 보고 싶다면, 변수 B를 char로 형변환 해준다.

		System.out.println();

		ch = 65;
		System.out.println(ch);// 응용
		ch += 1;
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		ch++;

	}
}
