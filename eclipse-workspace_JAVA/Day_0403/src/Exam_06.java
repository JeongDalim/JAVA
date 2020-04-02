
class EEB {
	int x = 10;
	int y = 20;

	public void print() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

class EEAB extends EEB {
	int z = 30;

	public void print() { // 재정의(오버라이딩==덮어쓰기) 오버라이딩은 메소드의 이름과 매개변수가 같아야한다.
		super.print();// 조상클래스의 메소드 호출
		System.out.println("x는" + x); // '='을 '는'으로 재정의하였다.
		System.out.println("y는" + y);
	}

	public void ePrint() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		EEB eeb = new EEB();
		eeb.print();
		System.out.println("=========");
		EEAB eeab = new EEAB();
		eeab.print(); // 부모의 메소드를 재정의 하여 본인의 메소드로 만들어서 사용
		System.out.println("=========");
		eeab.ePrint();
	}
}
