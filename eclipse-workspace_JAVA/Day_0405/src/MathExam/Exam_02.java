//Math.random()
package MathExam;

public class Exam_02 {
	public static void main(String[] args) {
		Math.random(); // (0,1)������ ������ �߻��Ͽ� ��ȯ���ִ� random()

		for (int i = 0; i < 10; i++) {
			int var = (int) (Math.random() * 45) + 1; // 0���� 100���� ������ �߻������ִ� ��
			System.out.println(var);
		}
	}
}
