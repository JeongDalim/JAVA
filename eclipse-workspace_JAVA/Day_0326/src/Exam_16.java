
public class Exam_16 {
	public static void main(String[] args) {
		byte a = 5;
		byte b = 7;
		System.out.println("a=" + Integer.toBinaryString(a));// 00000101
		System.out.println("b=" + Integer.toBinaryString(b));// 00000111
		System.out.println("b=" + Integer.toBinaryString(a & b));// 1이 겹치는 부분만 출력하면 00000101->5
		System.out.println("b=" + Integer.toBinaryString(a | b));// 둘중 하나라도 1인 부분만 출력하면 00000101->7
		System.out.println("b=" + Integer.toBinaryString(a ^ b));// 1이 겹치는 부분만 을 반전하여 출력하면 00000010->2
		System.out.println("a&b=" + (a & b));
		System.out.println("a&b=" + (a | b));
		System.out.println("a&b=" + (a ^ b));
	}
}
