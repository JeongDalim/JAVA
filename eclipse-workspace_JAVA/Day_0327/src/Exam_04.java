//매개변수와 리턴값 둘 다 있는 경우.
public class Exam_04 {
	static String test(String name, int age) {

		return name + "\t" + age;
	}

	public static void main(String[] args) {
		System.out.println(test("최영원", 25));
		String str = test("최영원", 25);
		System.out.println(str);

	}
}
