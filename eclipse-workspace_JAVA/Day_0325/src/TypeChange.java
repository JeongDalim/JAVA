//����ȯ
public class TypeChange {
	public static void main(String[] args) {
		int a;// ���� ����
		a = 10;// ���� ����
		double b = a;// 4����Ʈ�� ���� a�� 8����Ʈ�� ���� b�� ���� �� �ִ�.->������ ����ȯ
		int c = (int) b;// 8����Ʈ�� ���� b�� 4����Ʈ�� ���� a�� ���� �� ���� ������ (int)�� ����ȯ�� ������ ������ ������ ����.->����� ����ȯ
		System.out.println(a);
		System.out.println(b);//�Ǽ��� ��µȴ�.
		System.out.println(c);
	}
}
