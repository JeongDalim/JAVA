//StringTokenizer 클래스
package StringTokenExam;

import java.util.StringTokenizer;

public class Exam_02 {
	public static void main(String[] args) {
		String str = "aaa#123-ddd#567-999"; // 문자열과 문자열을 분리하는 기준을 토큰이라한다.
		StringTokenizer stz = new StringTokenizer(str, "#-"); // 구분해준다
		int cnt = stz.countTokens(); // 구분된 토큰의 갯수를 반환해준다.
		System.out.println(cnt);
		System.out.println("===============================");

		for (int i = 0; i < cnt; i++) {
			System.out.println(stz.nextToken());

		}
		System.out.println("===============================");
		stz = new StringTokenizer(str, "#-"); // 토큰은 이미 읽으면 다음으로 넘어가서 돌아오지 않기 떄문에 다시 읽으려면 새로 선언해주어야 한다.
		while (stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
	}
}
