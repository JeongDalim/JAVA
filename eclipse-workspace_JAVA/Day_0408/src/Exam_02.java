import java.util.ArrayList;
import java.util.List;

public class Exam_02 {
	public static void main(String[] args) { // <>안에 타입를을 넣어주면, 그 콜렉션은 그 타입만 들어가는 전용 콜렉션이 된다.
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); // add로 들어간 모든 값은 Object로 변환되어 들어간다.
		list.add(new Integer(20)); // 같다.
		list.add(30);
		list.add(40);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
