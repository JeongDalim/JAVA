//StringTokenizer Ŭ����
package StringTokenExam;

import java.util.StringTokenizer;

public class Exam_02 {
	public static void main(String[] args) {
		String str = "aaa#123-ddd#567-999"; // ���ڿ��� ���ڿ��� �и��ϴ� ������ ��ū�̶��Ѵ�.
		StringTokenizer stz = new StringTokenizer(str, "#-"); // �������ش�
		int cnt = stz.countTokens(); // ���е� ��ū�� ������ ��ȯ���ش�.
		System.out.println(cnt);
		System.out.println("===============================");

		for (int i = 0; i < cnt; i++) {
			System.out.println(stz.nextToken());

		}
		System.out.println("===============================");
		stz = new StringTokenizer(str, "#-"); // ��ū�� �̹� ������ �������� �Ѿ�� ���ƿ��� �ʱ� ������ �ٽ� �������� ���� �������־�� �Ѵ�.
		while (stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
	}
}
