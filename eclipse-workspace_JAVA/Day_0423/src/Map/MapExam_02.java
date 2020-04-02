package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExam_02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // key와 value값을 제네릭으로 줄 수 있다.
		map.put("java", 1234);
		map.put("python", 3456);
		map.put("c", 3333);
		map.put("c++", 5555);
		map.put("c#", 1234);
		Scanner scn = new Scanner(System.in);
		System.out.print("id , pw :");
		String userId = scn.next();
		int pw = scn.nextInt();
		int userPw = map.get(userId);
		if (pw == userPw) {
			System.out.println("로그인");
		} else {
			System.out.println("비밀번호 오류");
		}
		scn.close();
	}
}
