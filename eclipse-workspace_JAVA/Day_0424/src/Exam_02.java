// 4대중첩클래스-정적중첩
class Outer2 {
	private int x = 10;
	private static int y = 20;

	public void print() {
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

	static class Inner2 { // 내부에서는 스태틱을 선언할 수 없지만, 내부클래스 자체를 스태틱으로 선언할 수는 있다.
		private int z = 30;
		private static int k = 40;

		public void print() {
			// System.out.println("x= " + x); 외부클래스에서는 일반변수는 사용 불가하고 스태틱이어야만 사용 할 수 있다.
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
