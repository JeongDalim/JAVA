
//���������ڿ� setter,getter
class Test {
	private int x = 10; // private�� ���� Ŭ���� �������� ��밡���ϴ�.(��������==ĸ��ȭ)
	private int y = 20;

	public void sum() { // x,y�� �ܺο����� ����Ҽ� ������ , x,y�� ���Ե� �޼ҵ�� public�̶� �ܺο����� ��밡���ϴ�.
		int z = x + y;// ���� Ŭ���� ���� �޼ҵ��̱⶧���� x,y�� ��밡���ϴ�.
		System.out.println("x+y=" + z);
	}

	public void setX(int x) { // setter-private x�� �Ű����������� �ٲ� ��,
		this.x = x;
	}

	public int getX() {// getter-�������ش�
		return x;
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		Test t = new Test();
		int a = t.getX();
		System.out.println("x=" + a);
		t.setX(50);
		a = t.getX();
		System.out.println("x=" + a);
	}
}
