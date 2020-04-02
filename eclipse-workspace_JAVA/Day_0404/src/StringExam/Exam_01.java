//API 어플리케이션 인터페이스 
package StringExam;

final class A { // class에 final을 붙이면 상속 ㄴ할 수 없다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hellow, java!";
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		String str = "Hellow, java!";
		String str2 = new String("Hellow, java!");
		String str3 = "Hellow, java!";
		System.out.println(str + "\n" + str2 + "\n" + str3); // 결과는 같다.

		int a = 10;
		int b = 10;
		System.out.println(a + b);
		A a1 = new A();

		System.out.println(a1);

		System.out.println("str==str2= " + (str == str2)); // str2는 new로 생성되서 가르키는 주소값이 다르다.
		System.out.println("str==str3= " + (str == str3)); // str과 str3은 같은 문자열값이라 가르키는 주소값이 같다.

		// equals는 주소값이 아닌, 문자열 값이 같은 지를 물어본다.
		System.out.println("str.equals(str2)=" + (str.equals(str2))); // str2는 new로 생성되서 가르키는 주소값이 다르다.
		System.out.println("str.equals(str3)=" + (str.equals(str3))); // str2는 new로 생성되서 가르키는 주소값이 다르다.
	}
	// String 클래스는 ToString 클래스에서 오버라이딩 되었기때문에 주소가 출력되지 않고 값이 출력된다.
	// String 클래스는 생성됬을 때 기존에 존재하는 String과 문장열값이 같다면 새로 생성하지 않고 그 값을 가르킨다.
	// 하지만, new 키워드로 생성되면 문자열값이 같아도 새로 생성된다.
}
