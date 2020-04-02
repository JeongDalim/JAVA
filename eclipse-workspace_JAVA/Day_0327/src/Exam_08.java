
public class Exam_08 {

	static void testMethod(int check) {
		int a = 90;
		int b = 70;
		if (check == 1) {
			System.out.println("a+b= " + (a + b));
		} else if (check == 2) {
			System.out.println("a-b= " + (a - b));
		} else if (check == 3) {
			System.out.println("a*b= " + (a * b));
		} else if (check == 4) {
			System.out.println("a/b= " + (a / b));
		} else {
			System.out.println("입력오류");
		}
	}

	static void testMethod2(int check) {
		int a = 90;
		int b = 70;
		switch (check) {
		case 1:
			System.out.println("a+b= " + (a + b));
			break;
		case 2:
			System.out.println("a-b= " + (a - b));
			break;
		case 3:
			System.out.println("a*b= " + (a * b));
			break;
		case 4:
			System.out.println("a/b= " + (a / b));
			break;
		default:
			System.out.println("error!");
		}
	}

	public static void main(String[] args) {
		testMethod(1);
		testMethod(2);
		testMethod(3);
		testMethod(4);
		System.out.println("=========================");
		testMethod2(1);
		testMethod2(2);
		testMethod2(3);
		testMethod2(4);

	}
}
