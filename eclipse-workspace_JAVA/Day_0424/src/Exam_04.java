// 4����øŬ����-�͸���ø

class Outer4 { // Ŭ���� ���� �޼ҵ带 �������̵� �ϰ� ���� ��
	public void print() {
		System.out.println("aaaaa");
	}

	public void print2() {
		System.out.println("bbbbb");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.print();
		o.print2();
		System.out.println("========================");
		Outer4 o2 = new Outer4() { // �͸�ü������ ������ ����.
			@Override
			public void print() {
				System.out.println("ȫ�浿");
			}

			@Override
			public void print2() {
				System.out.println("Jsl ���簳�߿�");
			}

			/*
			 * public void print3() {
			 * System.out.println("�������̵��� �������� ���ο� �޼ҵ带 �߰��� �� ����. ���ʿ� �ҷ����� �� ����."); }
			 */
		};
		o2.print();
		o2.print2();

	}
}
