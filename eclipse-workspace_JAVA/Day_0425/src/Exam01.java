//생성자로 생성자 호출하기,오버로딩 ,가변인자
class AA {
	int x;
	int y;

	public AA() {
		this(10); // 자기자신 호출 즉 AA(10)을 호출한다
	}

	public AA(int x) { // 디폴트 생성자의 의해 호출되어 x에 10대입 후 AA(10,20)을 호출한다.
		this(x, 20);
	}

	public AA(int x, int y) { // 2번째 생성자에 의해 호출 되어 x에 10대입 y에 20대입한다.
		this.x = x;
		this.y = y;
	}

	public void add() { // 이름은 같지만 매개변수의 수와 타입이 다른 메소드 오버로딩 (다형성)
		System.out.println("x+y=" + x + y);
	}

	public void add(int x) {
		System.out.println("x=" + (x));
	}

	public void add(int x, int y) {
		System.out.println("x+y=" + (x + y));
	}

	public void add(int x, int y, int z) {
		System.out.println("x+y+z=" + (x + y + z));
	}

	public void add(int... x) { // int형으로 매개변수가 몇개인지 모를때 x는 자동으로 배열이된다. (가변인자)
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("x+y+z+...=" + sum);
	}
}

public class Exam01 {
	public static void main(String[] args) {
		AA a = new AA(100, 200);
		System.out.println("x=" + a.x);
		System.out.println("y=" + a.y);

		a.add();
		a.add(10, 20);
		a.add(10, 20, 30);
		a.add(10, 20, 30, 40);
	}
}
