
public class Exam_09 {
	public static void main(String[] args) {

		char ch = 65;
		System.out.println(ch);
		int A = ch;
		System.out.println(A);
		int B = (char) ch + 1;// �ٸ� �ڷ��������� ���� ����� ������ ���, ū �ڷ������� ������ �����ؾ� �Ѵ�.
		System.out.println((char) B);// ������� �ƽ�Ű�ڵ�� ���� �ʹٸ�, ���� B�� char�� ����ȯ ���ش�.

		System.out.println();

		ch = 65;
		System.out.println(ch);// ����
		ch += 1;
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		ch++;

	}
}
