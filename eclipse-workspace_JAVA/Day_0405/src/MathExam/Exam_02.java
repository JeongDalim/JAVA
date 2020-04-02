//Math.random()
package MathExam;

public class Exam_02 {
	public static void main(String[] args) {
		Math.random(); // (0,1)사이의 난수를 발생하여 반환해주는 random()

		for (int i = 0; i < 10; i++) {
			int var = (int) (Math.random() * 45) + 1; // 0부터 100까지 난수를 발생시켜주는 식
			System.out.println(var);
		}
	}
}
