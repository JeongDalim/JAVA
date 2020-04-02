//str.substring() 확장for문
public class Exam_01 {
	public static void main(String[] args) {
		String str = "010-2242-3810";
		String s1 = str.substring(4, 8);
		System.out.println(s1);
		String[] s2 = str.split("-");

		System.out.println("========");

		for (String ss : s2) { // 확장for문
			System.out.println(ss);
		}

		System.out.println("========");
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		System.out.println();
	}
}
