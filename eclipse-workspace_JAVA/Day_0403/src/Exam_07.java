class F {
	int x = 10;
	int y = 20;

	public void test() {
		System.out.println("THIS CLASS IS F");
	}
}

class FA extends F {
	int z = 30;

	public void test() {
		System.out.println("THIS CLASS IS FA");
	}

	public void print() {
		System.out.println("FA CLASS");
	}
}

class FB extends F {
	int k = 40;

	public void print() {
		System.out.println("FB CLASS");
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		F f = new F();
		f.test(); // ���� ������ �޼ҵ� ȣ��
		System.out.println("=====================");
		FA fa = new FA();
		fa.test(); // �������̵��� �ڽ� ������ �޼ҵ� ȣ��
		fa.print(); // �ڽ� ���� �޼ҵ�
		System.out.println("=====================");
		FB fb = new FB();
		fb.test(); // �������̵� �ȵǾ��� ������ ���� Ŭ���� ȣ��
		fb.print();// �ڽ� ���� �޼ҵ�
		System.out.println("=====================");
		F ff = new FA();// ����Ŭ������ �̿��ؼ� �ڽ�Ŭ������ ���� �� �� �ִ�.
		// FA ffa = new F(); �ݴ��� ���� �ȵȴ�.
		// FA FFA = NEW FB(); ��Ӱ��谡 �ƴ� ��쵵 �ȵȴ�.
		ff.test(); // FA��� �ڽ� Ŭ������ �������̵��� �޼ҵ�
		// ff.print(); �ڽ� Ŭ���� FA�� print�޼ҵ尡 ������, ���� Ŭ���� F�� print�޼ҵ尡 ���⶧���� ȣ�� �Ұ�

		F fff;
		FA ffa = new FA();
		fff = ffa;
		// FA FFFA = FFF; �Ʊ�� ��������� �ݴ��� ���� �ȵ�����,
		FA fffa = (FA) fff; // �̷��� ĳ�������ָ� �ݴ��� ��쵵 �����ϴ�
		fffa.hashCode();
	}
}
