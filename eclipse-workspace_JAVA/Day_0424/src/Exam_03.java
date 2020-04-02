// 4대중첩클래스-지역중첩
class Outer3 {
	private int x = 10;
	private int y = 10;

	public Outer3() {

	}

	public void print() { // 메소드 안에 클래스가 있는 것을 지역중첩이라 한다.
		class Inner3 {
			private int z = 30;
			private int k = 40;

			public void print() {
				System.out.println("x= " + x);
				System.out.println("y= " + y);
				System.out.println("z= " + z);
				System.out.println("k= " + k);
			}
		}
		Inner3 in = new Inner3();
		in.print();
	}

}

public class Exam_03 {
	public static void main(String[] args) {
		Outer3 ot = new Outer3();
		ot.print();
	}

}
