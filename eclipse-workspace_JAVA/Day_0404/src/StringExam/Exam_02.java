//charAt()�Լ���  length()�Լ�
package StringExam;

public class Exam_02 {
	public static void main(String[] args) {
		String str = "Korea-seoul-2019/04/04";
		char ch = str.charAt(0); // charAt() �Լ��� charAt() �� ���ڸ�ŭ�� ��° ���ڸ� ��ȯ�Ѵ�.
		System.out.println(ch);
		char ch2 = "Korea-seoul-2019/04/04".charAt(0); // �׳� �־ �����ϴ�.
		System.out.println(ch2);

		int length = str.length(); // length()�Լ��� �ش� ���ڿ��� ���̸� ��ȯ�Ѵ�.
		System.out.println(length);

		//charAt()�Լ���  length()�Լ��� �̿��� ���ڿ� �и� 
		for( int i =0; i<str.length(); i++) {
			char ch3=str.charAt(i);
			System.out.print(ch3+" ");
			
			
		}
	}
}
