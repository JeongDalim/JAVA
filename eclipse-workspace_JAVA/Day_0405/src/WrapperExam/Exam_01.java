//Wrapper Ŭ����(�ڽ�)
package WrapperExam;

public class Exam_01 {
	public static void main(String[] args) {
		int var = 10; // �⺻�ڷ��� ���
		Integer var2 = new Integer(10); // ��üȭ
		Integer var3 = var; // ����ڽ�
		Integer var4 = 20;
		int var5 = var2; // �����ڽ�

		String str = "10" + 5;
		System.out.println(str); // ����� ���ڿ� "105"�̴�.
		int tot = var + Integer.parseInt(str);
		System.out.println(tot);// ����� ���� 115�̴�

		int var6 = 10;
		Integer str2 = Integer.valueOf(str); // ���ڿ��� ����ȭ���Ѽ� ��ȯ���ִ� �Լ�
		System.out.println(str2);
		str2 += 1; // str2�� ����ȭ�Ǿ��⶧���� 1�� ���ϸ�
		System.out.println(str2); // 106�� �ȴ�.
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}
}
