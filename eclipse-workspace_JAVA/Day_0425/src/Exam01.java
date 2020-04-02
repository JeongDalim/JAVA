//�����ڷ� ������ ȣ���ϱ�,�����ε� ,��������
class AA {
	int x;
	int y;

	public AA() {
		this(10); // �ڱ��ڽ� ȣ�� �� AA(10)�� ȣ���Ѵ�
	}

	public AA(int x) { // ����Ʈ �������� ���� ȣ��Ǿ� x�� 10���� �� AA(10,20)�� ȣ���Ѵ�.
		this(x, 20);
	}

	public AA(int x, int y) { // 2��° �����ڿ� ���� ȣ�� �Ǿ� x�� 10���� y�� 20�����Ѵ�.
		this.x = x;
		this.y = y;
	}

	public void add() { // �̸��� ������ �Ű������� ���� Ÿ���� �ٸ� �޼ҵ� �����ε� (������)
		System.out.println("x+y=" + x + y);
	}

	public void add(int x) {
		System.out.println("x=" + (x));
	}

	public void add(int x, int y) {
		System.out.println("x+y=" + (x + y));
	}

	public void add(int x, int y, int z) {
		System.out.println("x+y+z=" + (x + y + z));
	}

	public void add(int... x) { // int������ �Ű������� ����� �𸦶� x�� �ڵ����� �迭�̵ȴ�. (��������)
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("x+y+z+...=" + sum);
	}
}

public class Exam01 {
	public static void main(String[] args) {
		AA a = new AA(100, 200);
		System.out.println("x=" + a.x);
		System.out.println("y=" + a.y);

		a.add();
		a.add(10, 20);
		a.add(10, 20, 30);
		a.add(10, 20, 30, 40);
	}
}
