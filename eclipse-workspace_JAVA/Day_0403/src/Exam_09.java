//����Ʈ �����ڰ� �ʿ��� ����
class H {
	int x;

	public H() { // ����Ʈ������
	}

	public H(int x) {
		this.x = x;
	}
}

class HH extends H { // ��ӹ��� HHŬ������ ȣ���Ϸ��� ����Ʈ �����ڰ� �־���ϴµ� ���� H�� �Ű������� �ִ� �����ڰ� ������ ������ ����.
						// �׷��� ����Ŭ�������� ����Ʈ�����ڸ� �ǹ������� ������־���Ѵ�.
	int y;

	public HH(int y) {
		super(10); // ���� Ŭ������ �����ڸ� ����Ų��. �̷����ϸ� ����Ʈ ������ ���̵�, ���� Ŭ������ �޼ҵ带 ȣ�Ⱑ���ϴ�.
		this.y = y;
	}

	public void print() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		HH hh = new HH(20);
		hh.print();
	}
}
