
public class MouseExam {
	public static void main(String[] args) {
		Mouse m = new Mouse(); // 선언과 할당(객체생성)
		Mouse m2; // 참조변수 선언
		m2 = new Mouse(); // 객체 생성(인스턴스)
		System.out.println(m);
		m.button = 2;
		System.out.println(m2);
		m2.button = 3;

		System.out.println("m.button=" + m.button);
		System.out.println("m2.button=" + m2.button);
		m.check(); // 결과는 같지만 다른 객체에서 가져온 메소드이다.
		m2.check();

	}
}
