//상속 모든 클래스는 Object 클래스로부터 상속받아져 있다.자바는 다중상속을 지원하지 않지만,Object로 상속받는 것으로는 다중상속으로 치지 않는다.
class EE {
	int x = 10;
	int y = 20;

	public void print() {
		System.out.print("x=" + x);
		System.out.print("y=" + y);
	}
}

class EEE {

}

class EEA extends EE {
	int z = 30;

	public void ePrint() {
		System.out.print("x=" + x);
		System.out.print("y=" + y);
		System.out.print("z=" + z);
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		EE ee = new EE();
		ee.print();
		System.out.println();
		EEA eea = new EEA();
		eea.print(); // EE의 메소드도 상속받았기 때문에 사용할 수 있다. 오버라이딩 하지않고 사용했기에 부모의 메소드를 사용한 것이다.
		System.out.println();
		eea.ePrint(); // 본인거
	}
}
