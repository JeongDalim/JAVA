//StringTokenizer 클래스
package StringTokenExam;

import java.util.StringTokenizer;

public class Exam_01 {
	public static void main(String[] args) {
		String str = "aaa#123-ddd#567-999"; // 문자열과 문자열을 분리하는 기준을 토큰이라한다.
		StringTokenizer stz = new StringTokenizer(str, "#-"); // 구분해준다
		String str2= stz.nextToken(); //구분해준 문자열중 1번째 문자열을 반환해준다.
		System.out.println(str2);
		str2= stz.nextToken();
		System.out.println(str2);
		str2= stz.nextToken();
		System.out.println(str2);
		str2= stz.nextToken();
		System.out.println(str2);
		str2= stz.nextToken();
		System.out.println(str2);
		
	}
}
