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
		f.test(); // 조상 본인의 메소드 호출
		System.out.println("=====================");
		FA fa = new FA();
		fa.test(); // 오버라이딩된 자식 본인의 메소드 호출
		fa.print(); // 자식 본인 메소드
		System.out.println("=====================");
		FB fb = new FB();
		fb.test(); // 오버라이딩 안되었기 때문에 조상 클래스 호출
		fb.print();// 자식 본인 메소드
		System.out.println("=====================");
		F ff = new FA();// 조상클래스를 이용해서 자식클래스에 접근 할 수 있다.
		// FA ffa = new F(); 반대의 경우는 안된다.
		// FA FFA = NEW FB(); 상속관계가 아닌 경우도 안된다.
		ff.test(); // FA라는 자식 클래스의 오버라이딩된 메소드
		// ff.print(); 자식 클래스 FA는 print메소드가 있지만, 조상 클래스 F가 print메소드가 없기때문에 호출 불가

		F fff;
		FA ffa = new FA();
		fff = ffa;
		// FA FFFA = FFF; 아까와 마찬가기로 반대의 경우는 안되지만,
		FA fffa = (FA) fff; // 이렇게 캐스팅해주면 반대의 경우도 가능하다
		fffa.hashCode();
	}
}
