//생성자 연속호출
class G {
	public G() {
		System.out.println("G 생성자 호출");
	}
}

class GG extends G {
	public GG() {
		System.out.println("GG 생성자 호출");
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		// G g = new G();
		GG gg = new GG(); // G클래스의 생성자가 먼저 만들어지고 호출 후, GG생성자가 호출된다.
		gg.hashCode();
	}
}
