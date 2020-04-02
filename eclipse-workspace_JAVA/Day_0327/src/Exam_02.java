//매개변수와 리턴값이 없는 경우.
public class Exam_02 {
	static void print() {
		System.out.println("print() 메소드가 호출되었습니다.");
	}

	public static void main(String[] args) {
		int cnt = 0;
		while (true) {
			print();
			cnt++;
			if (cnt == 5) {
				break;
			}
		}
		System.out.println("end");
	}
}
