package Map;

import java.util.*;

public class MapExam_01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // key�� value���� ���׸����� �� �� �ִ�.
		//Map<String, Integer> map2 = new Hashtable<String, Integer>(); // ����ȭ�޼ҵ带 �������ش�.
		map.put("AAA", 100); // �տ��ִ°� key,�ڿ��ִ°� value.
		map.put("BBB", 200);
		map.put("CCC", new Integer(300));
		map.put("DDD", 400);
		map.put("AAA", 500); // key�� �ߺ��� �����Ѵ�.

		System.out.println(map.size());
		System.out.println(map);
		int var = (int) map.get("AAA");
		System.out.println(var);
		System.out.println(map.containsKey("AAA"));
		System.out.println(map.containsValue(100));

	}
}
