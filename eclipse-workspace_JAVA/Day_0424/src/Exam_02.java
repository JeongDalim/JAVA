// 4����øŬ����-������ø
class Outer2 {
	private int x = 10;
	private static int y = 20;

	public void print() {
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

	static class Inner2 { // ���ο����� ����ƽ�� ������ �� ������, ����Ŭ���� ��ü�� ����ƽ���� ������ ���� �ִ�.
		private int z = 30;
		private static int k = 40;

		public void print() {
			// System.out.println("x= " + x); �ܺ�Ŭ���������� �Ϲݺ����� ��� �Ұ��ϰ� ����ƽ�̾�߸� ��� �� �� �ִ�.
			System.out.println("y= " + y);
			System.out.println("z= " + z);
			System.out.println("k= " + k);
		}
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		// Outer2.Inner2 oi = ot.new Inner2();
		Outer2.Inner2 oi2 = new Outer2.Inner2();
		oi2.print();
		ot.hashCode();
	}
}
