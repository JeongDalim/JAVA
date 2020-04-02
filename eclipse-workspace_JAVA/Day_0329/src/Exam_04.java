//메소드 매개변수를 배열로 받는 방법(참조의 의한 호출)
public class Exam_04 {
	static void method(int[] var2) {// 받는 매개변수도 배열로 해주어여한다.
		int tot = 0;
		for (int i = 0; i < var2.length; i++) {
			tot += var2[i];
		}
		double avg = (double) tot / var2.length;
		System.out.println("tot= " + tot);
		System.out.println("avg= " + avg);
		var2[0] = 100;// 여기서 var2[0] 값을 바꾸면 var[0]의 값도 바뀐다. var과 var2는 같은 값을 가르키고 있기 때문이다.
	}

	public static void main(String[] args) {
		int var[] = { 79, 66, 77, 90, 76, 56, 87, 78, 73, 56 };
		System.out.println("메소드 호출 전");
		for (int i = 0; i < var.length; i++) {
			System.out.print(var[i] + "\t");
		}
		System.out.println();
		method(var);
		System.out.println("메소드 호출 후");
		for (int i = 0; i < var.length; i++) {
			System.out.print(var[i] + "\t");
		}
	}

}
