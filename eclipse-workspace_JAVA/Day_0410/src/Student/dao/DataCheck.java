package Student.dao;

import java.io.File;
import java.util.Scanner;

public class DataCheck {
	public static void main(String[] args) throws Exception {
		// try {
		Scanner scn = new Scanner(new File("c://text//datacheck.txt"));// ���ܹ߻������� �ڵ� ���
		// } catch (Exception e) {
		// System.out.println("������ �������� ����.");// ���ܹ߻� ó�� catch ����
		// e.printStackTrace(); // ���� ���ܰ� �߻��ߴ��� �˷���

		// } finally {// ���ܿ� ������� ó���� ����
		String[] jungDap = scn.nextLine().split(",");
		while (scn.hasNext()) {
			int tot = 0;
			String[] StudentDap = scn.nextLine().split(",");
			System.out.print(StudentDap[0] + "\t"); // �̸����
			for (int i = 0; i < jungDap.length; i++) {
				if (jungDap[i].equals(StudentDap[i + 1])) {
					tot = tot + 10;
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println(tot);
		}
		scn.close();
	}

}
