/*���� ���ڿ��� ���ο� ���ڿ��� �߰��ϸ� ���� ���ڿ� ��ü�� �����ϴµ�, �޸𸮳��� �ʷ� �� �� �ִ�. StringBuffer()�� �������ڿ�ó���� �������ִ� �Լ��̴�.
  �ν��Ͻ��ϸ� �⺻���� 16���� ���ڿ��� ���� �� �ִ� ������ �����. 
 StringBuilder()�Լ���  StringBuffer()�� ������, StringBuffer()�ʹ� �ٸ��� ��Ƽ�����带 �������� �ʴ´�.
*/
package StringBufferExam;

public class Exam_01 {
	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer();
		System.out.println("����ũ��=" + bf.capacity()); // capacity() ������ ũ�⸦ ��ȯ���ִ� �޼ҵ�
		System.out.println("���ڿ� ���=" + bf.length());

		System.out.println("=======================================");
		StringBuffer bf2 = new StringBuffer("Hellow,");
		System.out.println("����ũ��=" + bf2.capacity()); // capacity() ������ ũ�⸦ ��ȯ���ִ� �޼ҵ�
		System.out.println("���ڿ� ���=" + bf2.length());
		System.out.println(bf2);
		System.out.println("=======================================");
		bf2.append("java!"); //���ڿ� �߰�
		System.out.println("����ũ��=" + bf2.capacity()); // capacity() ������ ũ�⸦ ��ȯ���ִ� �޼ҵ�
		System.out.println("���ڿ� ���=" + bf2.length());
		System.out.println(bf2);

	}
}
