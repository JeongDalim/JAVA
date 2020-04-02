
//접근제한자와 setter,getter
class Test {
	private int x = 10; // private는 같은 클래스 내에서만 사용가능하다.(정보은닉==캡슐화)
	private int y = 20;

	public void sum() { // x,y는 외부에서는 사용할수 업지만 , x,y가 포함된 메소드는 public이라 외부에서도 사용가능하다.
		int z = x + y;// 같은 클래스 내의 메소드이기때문에 x,y를 사용가능하다.
		System.out.println("x+y=" + z);
	}

	public void setX(int x) { // setter-private x를 매개변수값으로 바꾼 후,
		this.x = x;
	}

	public int getX() {// getter-리턴해준다
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
