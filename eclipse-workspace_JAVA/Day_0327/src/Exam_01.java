
public class Exam_01 {

	static void sum(int a, int b) {
		int t = a + b;
		System.out.println(t);
	}

	static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
		//a�� b�� �ٲ��ִ� �޼ҵ�
	}

	public static void main(String[] args) {
		sum(10, 20);
		int a = 10;// ���� fun1�޼ҵ��� a�ʹ� �ٸ� �����̴�.
		int b = 20;// ���� fun1�޼ҵ��� b�� �ٸ� �����̴�.
		sum(a, b);
		System.out.println("a=" + a + "b=" + b);
		swap(a, b);// swap�޼ҵ�� a�� b�� �ٲپ�����,
		System.out.println("a=" + a + "b=" + b);// ����ϸ� main���� a,b������ ��µǴ� ���� �� �� �ִ�.
	}

}
