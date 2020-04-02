//static 여러개의 객체가 그 값을 공유한다 static으로 선언된 메소드나 변수는  객체생성 없이, 클래스에서 바로 호출가능하다. (항상 상주)
class BB {
	static int x = 10; // 정적 멤버(클래스 멤버)
	static int y = 20;

	public static void test() { // 메소드가 정적(static)이려면, 그 안의 변수도 정적(static)이어야 한다.
		System.out.println("x=" + x);// 얘도 사실 static으로 만들어졌다.
		System.out.println("y=" + y);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		BB bb = new BB();
		BB ba = new BB();
		BB.x = 1000;
		BB.y = 200;
		// bb.test();
		// ba.test();
		BB.test();
		ba.hashCode();
		bb.hashCode();
	}
}
