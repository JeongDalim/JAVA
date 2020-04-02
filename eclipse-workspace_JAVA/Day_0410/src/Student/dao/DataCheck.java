package Student.dao;

import java.io.File;
import java.util.Scanner;

public class DataCheck {
	public static void main(String[] args) throws Exception {
		// try {
		Scanner scn = new Scanner(new File("c://text//datacheck.txt"));// 예외발생가능한 코드 기술
		// } catch (Exception e) {
		// System.out.println("파일이 존재하지 않음.");// 예외발생 처리 catch 구간
		// e.printStackTrace(); // 무슨 예외가 발생했는지 알려줌

		// } finally {// 예외에 상관없이 처리할 내용
		String[] jungDap = scn.nextLine().split(",");
		while (scn.hasNext()) {
			int tot = 0;
			String[] StudentDap = scn.nextLine().split(",");
			System.out.print(StudentDap[0] + "\t"); // 이름출력
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
