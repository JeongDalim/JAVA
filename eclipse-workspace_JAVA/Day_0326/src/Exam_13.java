//증감연산자
public class Exam_13 {
	public static void main(String[] args) {
		// a++과 ++a의 차이
		int a = 5;
		int b = 0;
		b = a++; // a를 먼저 b에 대입하고 a값에 +1해준다.
		System.out.println("b= " + b);
		System.out.println("a= " + a);
		System.out.println("================================");
		int a2 = 5;
		int b2 = 0;
		b2 = ++a2; // a2값에 +1을 해준 뒤, b2에 대입한다.
		System.out.println("b2= " + b2);
		System.out.println("a2= " + a2);
		System.out.println("================================");
		int a3 = 5;
		System.out.println("a3=" + a3);// a3= 5
		a3++;// a3=6
		System.out.println("a3=" + a3);// a3= 6
		++a3;// a3= 7
		System.out.println("a3=" + a3++);// a3=7 출력하고 a3에 +1
		System.out.println("a3=" + a3);// a3=8
		System.out.println("a3=" + ++a3);// a3에 +1해주고 출력
	}
}
