package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam_04 {
	public static void main(String[] args) {
		Map map = new HashMap(); // key�� value���� ���׸����� �� �� �ִ�.
		map.put("ȫ����", new Integer(90));
		map.put("ȫ����", new Integer(85));
		map.put("ȫ���", new Integer(95));
		map.put("ȫ���", new Integer(87));
		map.put("ȫ���", new Integer(83));
		System.out.println(map);
		Set<Object> set = map.entrySet(); // map�� set����,key�� value�� ���� set���� �־��ش�.
		System.out.println(set);

		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry me = (Map.Entry) iter.next();
			System.out.println("�̸�:" + me.getKey() + "\t" + "����:" + me.getValue());
		}
		// key ����
		Set<Object> set2 = map.keySet(); // key�� set���� ��ȯ keySet()�� ���ϰ��� Set�̶� Set���� �޾��־�� �Ѵ�.
		System.out.println(set2);

		// value ����
		Collection collection = map.values(); // values()�� ���ϰ��� Collection�̶� Collection���� �޾��־���Ѵ�.
		iter = collection.iterator();
		int tot = 0;
		while (iter.hasNext()) {
			tot += (int) iter.next();
		}
		System.out.println("����: " + tot);
		System.out.println("���: " + tot / collection.size());
		System.out.println("�ִ밪:" + Collections.max(collection));
		System.out.println("�ִ밪:" + Collections.min(collection));

	}
}
