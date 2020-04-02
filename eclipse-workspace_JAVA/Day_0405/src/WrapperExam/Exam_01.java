//Wrapper 클래스(박스)
package WrapperExam;

public class Exam_01 {
	public static void main(String[] args) {
		int var = 10; // 기본자료형 사용
		Integer var2 = new Integer(10); // 객체화
		Integer var3 = var; // 오토박싱
		Integer var4 = 20;
		int var5 = var2; // 오토언박싱

		String str = "10" + 5;
		System.out.println(str); // 결과는 문자열 "105"이다.
		int tot = var + Integer.parseInt(str);
		System.out.println(tot);// 결과는 정수 115이다

		int var6 = 10;
		Integer str2 = Integer.valueOf(str); // 문자열을 정수화시켜서 반환해주는 함수
		System.out.println(str2);
		str2 += 1; // str2는 정수화되었기때문에 1을 더하면
		System.out.println(str2); // 106이 된다.
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}
}
