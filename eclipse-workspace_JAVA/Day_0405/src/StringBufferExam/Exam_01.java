/*기존 문자열에 새로운 문자열을 추가하면 새로 문자열 객체를 생성하는데, 메모리낭비를 초래 할 수 있다. StringBuffer()는 동적문자열처리를 지원해주는 함수이다.
  인스턴스하면 기본으로 16자의 문자열을 받을 수 있는 공간이 생긴다. 
 StringBuilder()함수는  StringBuffer()와 같지만, StringBuffer()와는 다르게 멀티쓰레드를 지원하지 않는다.
*/
package StringBufferExam;

public class Exam_01 {
	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer();
		System.out.println("버퍼크기=" + bf.capacity()); // capacity() 버퍼의 크기를 반환해주는 메소드
		System.out.println("문자열 길어=" + bf.length());

		System.out.println("=======================================");
		StringBuffer bf2 = new StringBuffer("Hellow,");
		System.out.println("버퍼크기=" + bf2.capacity()); // capacity() 버퍼의 크기를 반환해주는 메소드
		System.out.println("문자열 길어=" + bf2.length());
		System.out.println(bf2);
		System.out.println("=======================================");
		bf2.append("java!"); //문자열 추가
		System.out.println("버퍼크기=" + bf2.capacity()); // capacity() 버퍼의 크기를 반환해주는 메소드
		System.out.println("문자열 길어=" + bf2.length());
		System.out.println(bf2);

	}
}
