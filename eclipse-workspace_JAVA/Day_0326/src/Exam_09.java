//��Ʈ������
public class Exam_09 {
	public static void main(String[] args) {
		byte a = 2;
		byte b = 2;
		System.out.println("a=" + a);
		System.out.println("a<<2 : " + (a << 2));
		// ������ 2�� 00000010�ε� a<<2�� ���ָ� 2bit�� �о��. ��, 00001000�� �Ǿ� 8�� ��µȴ�.
		System.out.println("b=" + b);
		System.out.println("b<<2 : " + (b << 2));
	}
}
