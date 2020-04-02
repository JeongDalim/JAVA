//비트연산자
public class Exam_09 {
	public static void main(String[] args) {
		byte a = 2;
		byte b = 2;
		System.out.println("a=" + a);
		System.out.println("a<<2 : " + (a << 2));
		// 이진수 2는 00000010인데 a<<2를 해주면 2bit씩 밀어낸다. 즉, 00001000이 되어 8이 출력된다.
		System.out.println("b=" + b);
		System.out.println("b<<2 : " + (b << 2));
	}
}
