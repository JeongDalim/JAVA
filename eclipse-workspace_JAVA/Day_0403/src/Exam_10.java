//�������� ���� �޼ҵ带 �߻� Ŭ������� �Ѵ�. Ŭ���� �� �Ѱ��� �߻�޼ҵ尡 �ִٸ� ��  Ŭ������ �߻� Ŭ������ �ȴ�.
//�߻�Ŭ������ ��� �޾� �������̵��Ͽ� ����ؾ��Ѵ�
abstract class K {
	public K() {
	}

	public void add(int n, int m) {
		System.out.println("n+m=" + (n + m));
	}

	public abstract void mul(int n, int m);
}

class KK extends K {
	@Override
	public void mul(int n, int m) {
		System.out.println(n);
		System.out.println(m);
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		K k = new KK();
		k.mul(10, 20);
		k.add(10, 20);
	}
}
