//charAt()함수와  length()함수
package StringExam;

public class Exam_02 {
	public static void main(String[] args) {
		String str = "Korea-seoul-2019/04/04";
		char ch = str.charAt(0); // charAt() 함수는 charAt() 내 숫자만큼의 번째 문자를 반환한다.
		System.out.println(ch);
		char ch2 = "Korea-seoul-2019/04/04".charAt(0); // 그냥 넣어도 가능하다.
		System.out.println(ch2);

		int length = str.length(); // length()함수는 해당 문자열의 길이를 반환한다.
		System.out.println(length);

		//charAt()함수와  length()함수를 이용한 문자열 분리 
		for( int i =0; i<str.length(); i++) {
			char ch3=str.charAt(i);
			System.out.print(ch3+" ");
			
			
		}
	}
}
