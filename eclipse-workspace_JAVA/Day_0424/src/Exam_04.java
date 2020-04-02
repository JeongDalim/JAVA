// 4대중첩클래스-익명중첩

class Outer4 { // 클래스 안의 메소드를 오버라이딩 하고 싶을 때
	public void print() {
		System.out.println("aaaaa");
	}

	public void print2() {
		System.out.println("bbbbb");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.print();
		o.print2();
		System.out.println("========================");
		Outer4 o2 = new Outer4() { // 익명개체구현과 원리가 같다.
			@Override
			public void print() {
				System.out.println("홍길동");
			}

			@Override
			public void print2() {
				System.out.println("Jsl 인재개발원");
			}

			/*
			 * public void print3() {
			 * System.out.println("오버라이딩만 가능하지 새로운 메소드를 추가할 수 없다. 애초에 불러들일 수 없다."); }
			 */
		};
		o2.print();
		o2.print2();

	}
}
