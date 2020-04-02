
import java.util.StringJoiner;

public class Exam_02 {
	public static void main(String[] args) {

		String[] str = { "010", "2242", "3810", "java", "programing" };

		String str2 = String.join("#", str);// 배열의 내용을 구분자로 구분해서 문자열로 반환해주는 join() 함수
		System.out.println(str2); // class이름으로 직접 접근할 수 있는 함수는 static 함수이다.
		System.out.println("================================");
		StringJoiner sj = new StringJoiner(",");
		for (String str3 : str) { // str을 str3에 str배열의 길이만큼 넣는다.
			sj.add(str3);
		}
		System.out.println(sj);
		System.out.println("================================");
		for (int i = 0; i < str.length; i++) { // 일반 for문으로 했을때 결과는 같다.
			sj.add(str[i]);
		}
		System.out.println(sj);
	}

}
