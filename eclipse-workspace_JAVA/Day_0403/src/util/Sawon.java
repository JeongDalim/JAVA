//인터페이스는 일종의 '명세서'이다 인터페이스는 추상클래스보다 더 추상적이다.
//인터페이스에는 상수와 추상메소드이외에는 들어갈 수 없다.
package util;

public interface Sawon {
	int MAX=100; // public final이 생략되어 있다.

	public void abc();// abstract가 생략되어 있다.

	int add(int a, int b);

	void sum(int... arr);
}
interface mem extends Sawon{
}