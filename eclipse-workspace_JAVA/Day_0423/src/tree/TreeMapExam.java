package tree;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {
	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<Integer, String>();
		score.put(new Integer(78), "홍길일");
		score.put(new Integer(85), "홍길이");
		score.put(new Integer(90), "홍길삼");
		score.put(new Integer(78), "홍길사");
		score.put(new Integer(88), "홍길오");
		score.put(new Integer(70), "홍길육");

		Map.Entry<Integer, String> entry = null;
		entry = score.firstEntry();
		System.out.println("가장 낮은 점수:" + entry.getKey() + "\t이름:" + entry.getValue() + "입니다.");
		entry = score.lastEntry();
		System.out.println("가장 높은 점수:" + entry.getKey() + "\t이름:" + entry.getValue() + "입니다.");
		entry = score.lowerEntry(80);
		System.out.println("80보다  낮은 점수:" + entry.getKey() + "\t이름:" + entry.getValue() + "입니다.");
		entry = score.higherEntry(80);
		System.out.println("80보더 큰 점수:" + entry.getKey() + "\t이름:" + entry.getValue() + "입니다.");
		entry = score.floorEntry(80);
		System.out.println("80점이거나 바로 아래 점수:" + entry.getKey() + "\t이름:" + entry.getValue() + "입니다.");
		entry = score.ceilingEntry(80);
		System.out.println("80점이거나 바로 윗 점수:" + entry.getKey() + "\t이름:" + entry.getValue() + "입니다.");

		System.out.println("=============================================================");
		while (!score.isEmpty()) {
			entry = score.pollFirstEntry();
			System.out.println("점수:" + entry.getKey() + "\t이름:" + entry.getValue());
			System.out.println("남은 객체 수: " + score.size());
		}
	}
}
