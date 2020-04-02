//비트연산자
public class Exam_12 {
	public static void main(String[] args) {
		System.out.println(5 & 7);// 5와 7을 이진수로 변형 101&111 101과 111중 둘다 1인 경우를 계산하면 101이 나와서 5가 출력된다.
		System.out.println(5 | 7);// 5와 7을 이진수로 변형 101&111 101과 111중 둘중 하나라도 1인 경우를 계산하면 111이 나와서 7가 출력된다.
		System.out.println(5 ^ 7);// 5와 7을 이진수로 변형 101&111 101과 111중 둘중 하나라도 0인 경우를 계산하면 010이 나와서 2가 출력된다.
	}
}
