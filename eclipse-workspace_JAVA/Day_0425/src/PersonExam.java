import java.util.Scanner;

/* 1.�Է����� �ִ� 10��, ��ȣ�� 0�̸� ���
 * ��ȣ:(1~10)
 * �̸�: free
 * �Ի���:(2019/01/01)
 * �⺻��:(50000~500000)
 *2.�������
 * ��ȣ   �̸�   �Ի���                 �⺻��      ��������
 * 8   AAA 2017/03/03 300000 3
 * 
 *3. ��� ����(�����ȣ������ ���)
 *   ��ȣ   �̸�   �Ի���                 �⺻��      ��������
 *   1   
 *   2
 */

public class PersonExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Person[] pArr = new Person[10];
		Person p = null;
		int cnt = 0;
		int bun = 0;
		String name = "";
		String redate = "";
		int money = 0;
		int temp = 0;
		while (true) {
			System.out.print("����Է�: ");
			bun = scn.nextInt();
			if (bun == 0) {
				break;
			}
			System.out.print("�̸��Է�: ");
			name = scn.next();
			System.out.print("�Ի����Է�: ");
			redate = scn.next();
			System.out.print("�⺻���Է�: ");
			money = scn.nextInt();
			p = new Person(bun, name, redate, money);
			pArr[cnt] = p;
			cnt++;
		}
		for (int x = 0; x < cnt; x++) { // ���
			for (int y = x + 1; y < cnt; y++) {
				if (pArr[x].bun > pArr[y].bun) {
					temp = pArr[x].bun;
					pArr[x].bun = pArr[y].bun;
					pArr[y].bun = temp;
				}
			}
		}
		for (int k = 0; k < cnt; k++) { // �������
			pArr[k].rank = 1;
			for (int z = 0; z < cnt; z++) {
				if (pArr[k].money < pArr[z].money) {
					pArr[k].rank++;
				}
			}
		}
		pArr[0].printTitle();
		for (int i = 0; i < cnt; i++) {
			pArr[i].print();
		}
		scn.close();
	}
}
