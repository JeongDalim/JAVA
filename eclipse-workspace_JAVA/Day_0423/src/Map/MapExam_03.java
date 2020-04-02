package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExam_03 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // key와 value값을 제네릭으로 줄 수 있다.
		map.put("java", 1234);
		map.put("python", 3456);
		map.put("c", 3333);
		map.put("c++", 5555);
		map.put("c#", 1234);
		Scanner scn = new Scanner(System.in);
		System.out.print("id , pw : ");
		String userId = scn.next();
		int pw = scn.nextInt();
		if (map.containsKey(userId)) {
			if (pw == map.get(userId)) {
				System.out.println("로그인되었습니다.");
			} else {
				System.out.println("로그인 실패! 비밀번호 오류입니다.");
			}
		} else {
			System.out.println("\'" + userId + "\'" + "는 존재하지 않는 아이디입니다.");
		}
		scn.close();
	}
}
