package tree;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {
	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<Integer, String>();
		score.put(new Integer(78), "ȫ����");
		score.put(new Integer(85), "ȫ����");
		score.put(new Integer(90), "ȫ���");
		score.put(new Integer(78), "ȫ���");
		score.put(new Integer(88), "ȫ���");
		score.put(new Integer(70), "ȫ����");

		Map.Entry<Integer, String> entry = null;
		entry = score.firstEntry();
		System.out.println("���� ���� ����:" + entry.getKey() + "\t�̸�:" + entry.getValue() + "�Դϴ�.");
		entry = score.lastEntry();
		System.out.println("���� ���� ����:" + entry.getKey() + "\t�̸�:" + entry.getValue() + "�Դϴ�.");
		entry = score.lowerEntry(80);
		System.out.println("80����  ���� ����:" + entry.getKey() + "\t�̸�:" + entry.getValue() + "�Դϴ�.");
		entry = score.higherEntry(80);
		System.out.println("80���� ū ����:" + entry.getKey() + "\t�̸�:" + entry.getValue() + "�Դϴ�.");
		entry = score.floorEntry(80);
		System.out.println("80���̰ų� �ٷ� �Ʒ� ����:" + entry.getKey() + "\t�̸�:" + entry.getValue() + "�Դϴ�.");
		entry = score.ceilingEntry(80);
		System.out.println("80���̰ų� �ٷ� �� ����:" + entry.getKey() + "\t�̸�:" + entry.getValue() + "�Դϴ�.");

		System.out.println("=============================================================");
		while (!score.isEmpty()) {
			entry = score.pollFirstEntry();
			System.out.println("����:" + entry.getKey() + "\t�̸�:" + entry.getValue());
			System.out.println("���� ��ü ��: " + score.size());
		}
	}
}
