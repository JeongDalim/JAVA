
public class MouseExam {
	public static void main(String[] args) {
		Mouse m = new Mouse(); // ����� �Ҵ�(��ü����)
		Mouse m2; // �������� ����
		m2 = new Mouse(); // ��ü ����(�ν��Ͻ�)
		System.out.println(m);
		m.button = 2;
		System.out.println(m2);
		m2.button = 3;

		System.out.println("m.button=" + m.button);
		System.out.println("m2.button=" + m2.button);
		m.check(); // ����� ������ �ٸ� ��ü���� ������ �޼ҵ��̴�.
		m2.check();

	}
}
