/*ȸ������ �ۼ�
1)�Է�����
�ڷ��Է�1= ȫ�浿,900206-1,010-2242-3810
�ڷ��Է�2= ���ڹ�,071015-2, 010-1111-2222
�ڷ��Է�3= ȫ�ڵ�,890723-1, 010-2222-3333
�ڷ��Է� n:end
2)�������
�̸�     ��ȭ                     ����     ����  
ȫ�浿  010-2242-3810  ��        29
���ڹ�  010-1111-2222  ��        12
ȫ�ڵ�  010-2222-3333  ��        30
3)ó������
-�Է��� 1���ξ� Ű����� �Է��Ѵ�.(�׺��� ������(,))
-'end'�Է��ڷ� ������ �Էµ� �ڷḦ ������Ŀ� �°� ��� ���
-�Է��ο��� �ִ� 10������ �Ѵ�.
-ȸ������ Ŭ���� Member ,����Ŭ������ memberExam���� �Ѵ�.
*/
package StringExam;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Member[] m = new Member[10];
		String name = "";
		String tel = null;
		String joomin = null;

		int cnt = 0;
		while (true) {
			System.out.print("�Է�: ");
			name = scn.nextLine();
			if (name.equalsIgnoreCase("end")) {
				break;
			}
			String str[] = name.split(",");
			name = str[0];
			joomin = str[1];
			tel = str[2];

			m[cnt] = new Member(name, tel, joomin);
			cnt++;
			if (cnt == 10) {
				break;
			}
		}
		for (int i = 0; i < cnt; i++) {
			m[i].print();
		}
		scn.close();
	}
}
