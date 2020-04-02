//형변환
public class TypeChange {
	public static void main(String[] args) {
		int a;// 변수 선언
		a = 10;// 변수 정의
		double b = a;// 4바이트인 변수 a는 8바이트인 변수 b에 담을 수 있다.->묵시적 형변환
		int c = (int) b;// 8바이트인 변수 b는 4바이트인 변수 a에 담을 수 없기 때문에 (int)로 형변환을 해주지 않으면 오류가 난다.->명시적 형변환
		System.out.println(a);
		System.out.println(b);//실수로 출력된다.
		System.out.println(c);
	}
}
