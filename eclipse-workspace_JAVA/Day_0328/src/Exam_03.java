import java.io.File;
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) throws Exception {
		int cnt = 0; // ������ ī��Ʈ�ϱ�
		int tot = 0;// �հ�
		int avgcnt = 0;// ����̻�ī��Ʈ
		int data = 0;// ������ 1
		String data2;// ������2
		double avg;// ���
		Scanner scn = new Scanner(new File("c://text//indata.txt.txt"));
		while (scn.hasNext()) { // �����ϸ� �� �������������� ����
			cnt++; // ī��Ʈ���ֱ�
			data = scn.nextInt(); // ��Ʈ ���� ������1�� �޸��忡 �ִ� �� �ֱ�
			tot = tot + data; // �հ� ���ϱ�
		}
		avg = (double) tot / cnt;
		if(data > avg) {
			avgcnt++;
		}
		Scanner scn1 = new Scanner(new File("c://text//indata.txt.txt")); // �ٽ� �б�����
		data2 = scn1.nextLine();// ��Ʈ�� ���� data2�� �޸��忡 �ִ� �� �ֱ�
		System.out.println("��ü data= " + data2);
		System.out.println("��ü data ��= " + cnt);
		System.out.println("��ü data ����= " + tot);
		System.out.println("��ü data ���= " + avg);
		System.out.println("����̻� data= " + avgcnt);
		scn.close();
		scn1.close();
	}
}
