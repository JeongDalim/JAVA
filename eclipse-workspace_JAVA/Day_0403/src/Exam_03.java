//static �������� ��ü�� �� ���� �����Ѵ� static���� ����� �޼ҵ峪 ������  ��ü���� ����, Ŭ�������� �ٷ� ȣ�Ⱑ���ϴ�. (�׻� ����)
class BB {
	static int x = 10; // ���� ���(Ŭ���� ���)
	static int y = 20;

	public static void test() { // �޼ҵ尡 ����(static)�̷���, �� ���� ������ ����(static)�̾�� �Ѵ�.
		System.out.println("x=" + x);// �굵 ��� static���� ���������.
		System.out.println("y=" + y);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		BB bb = new BB();
		BB ba = new BB();
		BB.x = 1000;
		BB.y = 200;
		// bb.test();
		// ba.test();
		BB.test();
		ba.hashCode();
		bb.hashCode();
	}
}
