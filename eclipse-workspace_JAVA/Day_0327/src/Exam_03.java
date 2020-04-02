//매개변수가 없지만, 리턴값이 있을 경우.
public class Exam_03 {
	static int sum() {// 리턴값은 기본 자료형, 클래스 ,배열 등이 올 수 있다.
		int a = 10, b = 20;
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(sum());// 또는 새로운 변수를 선언하여 sum();을 대입해준 후 그 변수를 선언하면 된다.
	}
}
