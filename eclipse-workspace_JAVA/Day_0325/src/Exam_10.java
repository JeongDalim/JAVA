//str.split();,str.substring();,str.length();
public class Exam_10 {
	public static void main(String[] args) {
		String str = "111,222,333,444,555,666";
		String[] str2 = str.split(",");// split 메소드 안 문자열을 기준으로 분리한다.
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		System.out.println(str2[2]);
		System.out.println(str2[3]);
		System.out.println(str2[4]);
		System.out.println(str2[5]);
		System.out.println();
		System.out.println(str.substring(0, 3));// str문자열의 0번째부터 3번째 까지의 데이터를 알 수 있다.
		System.out.println(str.substring(4, 7));
		System.out.println(str.substring(8, 11));
		System.out.println(str.substring(12, 15));
		System.out.println(str.substring(16, 19));
		System.out.println(str.substring(20, 23));
		System.out.println();
		System.out.println(str.length());// str의 문자열의 갯수를 알 수 있다.

	}
}
