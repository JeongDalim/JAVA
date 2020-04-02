//디폴트 생성자가 필요한 이유
class H {
	int x;

	public H() { // 디폴트생성자
	}

	public H(int x) {
		this.x = x;
	}
}

class HH extends H { // 상속받은 HH클래스를 호출하려면 디폴트 생성자가 있어야하는데 조상 H에 매개변수가 있는 생성자가 있으면 오류가 난다.
						// 그래서 조상클래스에서 디폴트생성자를 의무적으로 만들어주어야한다.
	int y;

	public HH(int y) {
		super(10); // 상위 클래스의 생성자를 가르킨다. 이렇게하면 디폴트 생성자 없이도, 하위 클래스의 메소드를 호출가능하다.
		this.y = y;
	}

	public void print() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		HH hh = new HH(20);
		hh.print();
	}
}
