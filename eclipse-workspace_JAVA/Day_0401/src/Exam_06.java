class B {
	String name;
	int n = 1;
	int m = 10;
	int tot = 0;

	public void sum() {
		System.out.println(name + "");
		for (int i = n; i <= m; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}

public class Exam_06 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.name = "1부터 10까지";
		b1.sum();
		B b2 = new B();
		b2.name = "1부터 20까지";
		b2.m = 20;
		b2.sum();
		B b3 = new B();
		b3.name = "5부터 20까지";
		b3.n = 5;
		b3.m = 20;
		b3.sum();
	}
}
