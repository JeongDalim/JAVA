package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam_04 {
	public static void main(String[] args) {
		Map map = new HashMap(); // key와 value값을 제네릭으로 줄 수 있다.
		map.put("홍길일", new Integer(90));
		map.put("홍길이", new Integer(85));
		map.put("홍길삼", new Integer(95));
		map.put("홍길사", new Integer(87));
		map.put("홍길오", new Integer(83));
		System.out.println(map);
		Set<Object> set = map.entrySet(); // map을 set으로,key와 value를 묶어 set으로 넣어준다.
		System.out.println(set);

		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry me = (Map.Entry) iter.next();
			System.out.println("이름:" + me.getKey() + "\t" + "점수:" + me.getValue());
		}
		// key 추출
		Set<Object> set2 = map.keySet(); // key만 set으로 변환 keySet()의 리턴값은 Set이라 Set으로 받아주어야 한다.
		System.out.println(set2);

		// value 추출
		Collection collection = map.values(); // values()의 리턴값은 Collection이라 Collection으로 받아주어야한다.
		iter = collection.iterator();
		int tot = 0;
		while (iter.hasNext()) {
			tot += (int) iter.next();
		}
		System.out.println("총점: " + tot);
		System.out.println("평균: " + tot / collection.size());
		System.out.println("최대값:" + Collections.max(collection));
		System.out.println("최대값:" + Collections.min(collection));

	}
}
