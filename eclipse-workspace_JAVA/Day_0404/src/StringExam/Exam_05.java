//subString()�Լ� , trim()�Լ�
package StringExam;

public class Exam_05 {
	public static void main(String[] args) {
		String str = "   900206-1249617";
		str = str.trim(); // ���ڿ��� ������ �����ϰ� ��ȯ���ִ� �Լ�
		String s1 = str.substring(7); // subString()�Լ� �� ���ڿ��� ��ȯ�Ѵ�. 7���� ������ �ֹι�ȣ ���ڸ���
		System.out.println(s1);

		String s2 = str.substring(0, 6); // 0���� 6������ �ֹι�ȣ ���ڸ���
		System.out.println(s2);

		String s3 = str.substring(7, 8);

		if (s3.equals("1") || s3.equals("3")) { // �ֹι�ȣ���� �������� ���������� ���
			System.out.println("����");
		} else {
			System.out.println("����");
		}

	}
}
