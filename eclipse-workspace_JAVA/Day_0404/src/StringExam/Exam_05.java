//subString()함수 , trim()함수
package StringExam;

public class Exam_05 {
	public static void main(String[] args) {
		String str = "   900206-1249617";
		str = str.trim(); // 문자열의 공백을 제거하고 반환해주는 함수
		String s1 = str.substring(7); // subString()함수 는 문자열을 반환한다. 7부터 끝까지 주민번호 앞자리만
		System.out.println(s1);

		String s2 = str.substring(0, 6); // 0부터 6전까지 주민번호 뒷자리만
		System.out.println(s2);

		String s3 = str.substring(7, 8);

		if (s3.equals("1") || s3.equals("3")) { // 주민번호에서 남성인지 여성인지를 출력
			System.out.println("남성");
		} else {
			System.out.println("여성");
		}

	}
}
