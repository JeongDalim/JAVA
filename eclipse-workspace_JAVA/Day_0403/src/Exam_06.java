
class EEB {
	int x = 10;
	int y = 20;

	public void print() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

class EEAB extends EEB {
	int z = 30;

	public void print() { // ������(�������̵�==�����) �������̵��� �޼ҵ��� �̸��� �Ű������� ���ƾ��Ѵ�.
		super.print();// ����Ŭ������ �޼ҵ� ȣ��
		System.out.println("x��" + x); // '='�� '��'���� �������Ͽ���.
		System.out.println("y��" + y);
	}

	public void ePrint() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		EEB eeb = new EEB();
		eeb.print();
		System.out.println("=========");
		EEAB eeab = new EEAB();
		eeab.print(); // �θ��� �޼ҵ带 ������ �Ͽ� ������ �޼ҵ�� ���� ���
		System.out.println("=========");
		eeab.ePrint();
	}
}
