package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExam_03 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // key�� value���� ���׸����� �� �� �ִ�.
		map.put("java", 1234);
		map.put("python", 3456);
		map.put("c", 3333);
		map.put("c++", 5555);
		map.put("c#", 1234);
		Scanner scn = new Scanner(System.in);
		System.out.print("id , pw : ");
		String userId = scn.next();
		int pw = scn.nextInt();
		if (map.containsKey(userId)) {
			if (pw == map.get(userId)) {
				System.out.println("�α��εǾ����ϴ�.");
			} else {
				System.out.println("�α��� ����! ��й�ȣ �����Դϴ�.");
			}
		} else {
			System.out.println("\'" + userId + "\'" + "�� �������� �ʴ� ���̵��Դϴ�.");
		}
		scn.close();
	}
}