class DD {
	int x; // 멤버변수,전역변수
	int y;
	{// 초기화 코드블럭을 이용한 초기화
		x = 0;
		y = 0;
	}

	public DD(int x, int y) {// x,y는 매개변수 ,지역변수
		this.x = x;// 생성자를 이용한 초기화
		this.y = y;
	}

	public void test(int a) {// a는 매개변수,지역변수
		int s = 0;
		System.out.println(s);
	}
}

public class Exam_04 {
	public static void main(String[] args) {

	}
}
