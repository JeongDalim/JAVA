//생성자의 매개변수를 이용해 객체를 만듬과 동시에 값을 대입할 수 있다.
//한 클래스에 생성자를 여러가지 만들 수 있으며, 이를 생성자 오버로딩(overloading)이라 한다.
class C {
	String name;
	int n;
	int m;

	// 생성자=객체가 처음 생성될때 처음 호출되는 메소드
	// 생성자는 클래스 이름과 동일한 메소드
	C() {
	} // 디폴트 생성자

	C(String name) {
	}// 매개변수가 하나인 생성자

	C(String name, int n) {
	}// 매개변수가 둘인 생성자

	public C(String name, int n, int m) {
		this.name = name;
		this.n = n;
		this.m = m;
	}

	public void sum() {
		System.out.println(name);
		for (int i = n; i <= m; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		C c1 = new C("1부터 10까지", 1, 10);
		c1.sum();
		System.out.println("------------------------------------------------");
		C c2 = new C("5부터 20까지", 5, 20);
		c2.sum();
		System.out.println("------------------------------------------------");
		C c3 = new C("10부터 20까지", 10, 20);
		c3.sum();
		//C c4 = new C(); // 디폴트 생성자가 있어야 생성가능하다.
	}
}
