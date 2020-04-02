
public class Exam_01 {

	static void sum(int a, int b) {
		int t = a + b;
		System.out.println(t);
	}

	static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
		//a와 b를 바꿔주는 메소드
	}

	public static void main(String[] args) {
		sum(10, 20);
		int a = 10;// 위의 fun1메소드의 a와는 다른 변수이다.
		int b = 20;// 위의 fun1메소드의 b와 다른 변수이다.
		sum(a, b);
		System.out.println("a=" + a + "b=" + b);
		swap(a, b);// swap메소드로 a와 b를 바꾸었지만,
		System.out.println("a=" + a + "b=" + b);// 출력하면 main안의 a,b변수가 출력되는 것을 알 수 있다.
	}

}
