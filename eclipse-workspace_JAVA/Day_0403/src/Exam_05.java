//��� ��� Ŭ������ Object Ŭ�����κ��� ��ӹ޾��� �ִ�.�ڹٴ� ���߻���� �������� ������,Object�� ��ӹ޴� �����δ� ���߻������ ġ�� �ʴ´�.
class EE {
	int x = 10;
	int y = 20;

	public void print() {
		System.out.print("x=" + x);
		System.out.print("y=" + y);
	}
}

class EEE {

}

class EEA extends EE {
	int z = 30;

	public void ePrint() {
		System.out.print("x=" + x);
		System.out.print("y=" + y);
		System.out.print("z=" + z);
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		EE ee = new EE();
		ee.print();
		System.out.println();
		EEA eea = new EEA();
		eea.print(); // EE�� �޼ҵ嵵 ��ӹ޾ұ� ������ ����� �� �ִ�. �������̵� �����ʰ� ����߱⿡ �θ��� �޼ҵ带 ����� ���̴�.
		System.out.println();
		eea.ePrint(); // ���ΰ�
	}
}
