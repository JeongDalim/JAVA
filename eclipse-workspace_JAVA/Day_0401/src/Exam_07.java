//�������� �Ű������� �̿��� ��ü�� ����� ���ÿ� ���� ������ �� �ִ�.
//�� Ŭ������ �����ڸ� �������� ���� �� ������, �̸� ������ �����ε�(overloading)�̶� �Ѵ�.
class C {
	String name;
	int n;
	int m;

	// ������=��ü�� ó�� �����ɶ� ó�� ȣ��Ǵ� �޼ҵ�
	// �����ڴ� Ŭ���� �̸��� ������ �޼ҵ�
	C() {
	} // ����Ʈ ������

	C(String name) {
	}// �Ű������� �ϳ��� ������

	C(String name, int n) {
	}// �Ű������� ���� ������

	public C(String name, int n, int m) {
		this.name = name;
		this.n = n;
		this.m = m;
	}

	public void sum() {
		System.out.println(name);
		for (int i = n; i <= m; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		C c1 = new C("1���� 10����", 1, 10);
		c1.sum();
		System.out.println("------------------------------------------------");
		C c2 = new C("5���� 20����", 5, 20);
		c2.sum();
		System.out.println("------------------------------------------------");
		C c3 = new C("10���� 20����", 10, 20);
		c3.sum();
		//C c4 = new C(); // ����Ʈ �����ڰ� �־�� ���������ϴ�.
	}
}
