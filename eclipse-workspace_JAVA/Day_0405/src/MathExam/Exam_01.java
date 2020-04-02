//Math.round(),Math.abs(), Math.max()
package MathExam;

public class Exam_01 {
	public static void main(String[] args) {
		double p = 37.784534;
		System.out.println(Math.round(p)); // 반올림해서 반환해주는 Math.round()

		int var = 10;
		int var2 = 20;

		System.out.println(Math.abs(var - var2)); // 절대값을 반환해주는 Math.abs()

		System.out.println(Math.max(var, var2));// 최대값을 반환해주는 Math.max()

	}
}
