class A {
	int x = 10;
	int y = 20;
}

public class Exam_05 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1.x);
		System.out.println(a2.x);
		a1.x=100;
		System.out.println(a1.x);
	}
}
