
public class Exam_05 {

	static void multiFor() {
		for (int i = 1; i <= 25; i++) {
			System.out.print("*  ");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		multiFor();
		System.out.println();
		for (int i = 1; i <= 5; i++) { // 위에 메소드와 결과는 같으나 과정은 다르다. 이중for문은 이차원구조를 만들기위해 있다.
			for (int j = 1; j <= 5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
