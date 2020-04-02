// 4대중첩클래스-중첩
class Outer {
	private int x = 10;
	private int y = 20;

	public void print() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	class Inner { // 클래스 내부에서는 스태틱을 만들 수 없다.
		private int z = 30;

		public void print() {
			System.out.println("x: " + x); // 외부 클래스의 멤버변수가 private이여도 내부클래스에서 사용가능하다.
			System.out.println("y: " + y);
			System.out.println("z: " + z);
		}
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Outer ot = new Outer();// 외부클래스 먼저 생성하고
		Outer.Inner oi = ot.new Inner();// 내부클래스 생성
		System.out.println("==================================================");
		Outer.Inner oi2 = new Outer().new Inner();// 내부클래스만 생성

		oi.print();
		oi2.print();

	}
}
