// 4����øŬ����-��ø
class Outer {
	private int x = 10;
	private int y = 20;

	public void print() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	class Inner { // Ŭ���� ���ο����� ����ƽ�� ���� �� ����.
		private int z = 30;

		public void print() {
			System.out.println("x: " + x); // �ܺ� Ŭ������ ��������� private�̿��� ����Ŭ�������� ��밡���ϴ�.
			System.out.println("y: " + y);
			System.out.println("z: " + z);
		}
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Outer ot = new Outer();// �ܺ�Ŭ���� ���� �����ϰ�
		Outer.Inner oi = ot.new Inner();// ����Ŭ���� ����
		System.out.println("==================================================");
		Outer.Inner oi2 = new Outer().new Inner();// ����Ŭ������ ����

		oi.print();
		oi2.print();

	}
}
