package Map;

import java.util.*;

public class MapExam_01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // key와 value값을 제네릭으로 줄 수 있다.
		//Map<String, Integer> map2 = new Hashtable<String, Integer>(); // 동기화메소드를 지원해준다.
		map.put("AAA", 100); // 앞에있는건 key,뒤에있는건 value.
		map.put("BBB", 200);
		map.put("CCC", new Integer(300));
		map.put("DDD", 400);
		map.put("AAA", 500); // key는 중복을 불허한다.

		System.out.println(map.size());
		System.out.println(map);
		int var = (int) map.get("AAA");
		System.out.println(var);
		System.out.println(map.containsKey("AAA"));
		System.out.println(map.containsValue(100));

	}
}
