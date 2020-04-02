//concat()함수, equals()함수 , equalsIgnoreCase()함수, indexOf()함수
package StringExam;

public class Exam_03 {
	public static void main(String[] args) {
		String str = "Hellow,";
		str = str.concat("java!");// concat()함수는 기존 문자열에 새로운 문자열을 더해준다. 새로운 문자열을 더 할수록 더한 결과값을
		System.out.println(str);// 새로운 객체로 만들기 때문에 많이쓰면 메모리를 많이 잡아먹는다.

		if (str.equals("Hellow,java!")) {// equals()은 ()내부의 값이 같다면 true, 다르면 false를 반환한다.
			System.out.println("==");
		} else {
			System.out.println("!=");
		}

		if (str.equalsIgnoreCase("HELLOW,JAVA!")) {// qualsIgnoreCase()은 대소문자를 무시하고 ()내부의 값이 같다면 true, 다르면 false를 반환한다.
			System.out.println("==");
		} else {
			System.out.println("!=");
		}

		String str2 = "korea-seoul"; // indexOf()는 ()내부의 문자가 몇번째 존재하는지를 반환한다. 존재하지 않으면 -1를 반환한다.
		int a = str2.indexOf('a');
		System.out.println(a);

	}
}
