
public class Exam_16 {
	public static void main(String[] args) {
		byte a = 5;
		byte b = 7;
		System.out.println("a=" + Integer.toBinaryString(a));// 00000101
		System.out.println("b=" + Integer.toBinaryString(b));// 00000111
		System.out.println("b=" + Integer.toBinaryString(a & b));// 1�� ��ġ�� �κи� ����ϸ� 00000101->5
		System.out.println("b=" + Integer.toBinaryString(a | b));// ���� �ϳ��� 1�� �κи� ����ϸ� 00000101->7
		System.out.println("b=" + Integer.toBinaryString(a ^ b));// 1�� ��ġ�� �κи� �� �����Ͽ� ����ϸ� 00000010->2
		System.out.println("a&b=" + (a & b));
		System.out.println("a&b=" + (a | b));
		System.out.println("a&b=" + (a ^ b));
	}
}
