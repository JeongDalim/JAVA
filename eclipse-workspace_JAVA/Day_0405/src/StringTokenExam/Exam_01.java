//StringTokenizer Ŭ����
package StringTokenExam;

import java.util.StringTokenizer;

public class Exam_01 {
	public static void main(String[] args) {
		String str = "aaa#123-ddd#567-999"; // ���ڿ��� ���ڿ��� �и��ϴ� ������ ��ū�̶��Ѵ�.
		StringTokenizer stz = new StringTokenizer(str, "#-"); // �������ش�
		String str2= stz.nextToken(); //�������� ���ڿ��� 1��° ���ڿ��� ��ȯ���ش�.
		System.out.println(str2);
		str2= stz.nextToken();
		System.out.println(str2);
		str2= stz.nextToken();
		System.out.println(str2);
		str2= stz.nextToken();
		System.out.println(str2);
		str2= stz.nextToken();
		System.out.println(str2);
		
	}
}
