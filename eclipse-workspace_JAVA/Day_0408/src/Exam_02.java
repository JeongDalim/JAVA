import java.util.ArrayList;
import java.util.List;

public class Exam_02 {
	public static void main(String[] args) { // <>�ȿ� Ÿ�Ը��� �־��ָ�, �� �ݷ����� �� Ÿ�Ը� ���� ���� �ݷ����� �ȴ�.
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); // add�� �� ��� ���� Object�� ��ȯ�Ǿ� ����.
		list.add(new Integer(20)); // ����.
		list.add(30);
		list.add(40);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
