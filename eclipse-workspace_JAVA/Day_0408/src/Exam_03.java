import java.util.ArrayList;
import java.util.List;

public class Exam_03 {
	public static void main(String[] args) {
		List <Object>list = new ArrayList<Object>();
		list.add(1234);
		list.add(3.141592);
		list.add("ȫ�浿");
		list.add(90);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.set(2, "ȫ���"); // ������ ��ġ�� ���� �ٲ� ��ȯ
		list.remove(3); // ������ ��ġ�� ���� ����
		
		System.out.println("============================");
	}
}
