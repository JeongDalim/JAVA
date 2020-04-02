//구현되지 않은 메소드를 추상 클래스라고 한다. 클래스 내 한개라도 추상메소드가 있다면 그  클래스는 추상 클래스가 된다.
//추상클래스는 상속 받아 오버라이딩하여 사용해야한다
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
