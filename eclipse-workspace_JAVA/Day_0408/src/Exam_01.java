import java.util.ArrayList;

public class Exam_01 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>(); // ����Ʈũ��� 16��
		// ArrayList<Object> list2 = new ArrayList<Object>(10); // ������ �� ũŰ��
		list.add("hellow java!"); // �迭���� �ٸ��� list�� ���� ������ �ٸ� �ڷ����� �� �� �ִ�.
		list.add(3.141592);
		list.add('A');
		list.add(true);
		System.out.println(list.size()); // ����Ʈ�� ũ�⸦ ��ȯ
		System.out.println(list.isEmpty());// ����Ʈ�� ������� true,false�� ��ȯ
		System.out.println(list.get(0)); // 0��° ���� ��ȯ
		boolean bool = list.contains('A'); // ����Ʈ�ȿ� 'A'��� ���� �ִ��� true,false�� ��ȯ
		System.out.println("A�� �����ϴ°�? " + bool);
		System.out.println("A�� " + list.indexOf('A') + "��° ��ġ�ϰ� �ֽ��ϴ�.");
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "��° ��� " + list.get(i)); // for���� �̿��� ��ü���
		}
	}
}
