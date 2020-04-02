//이름을 키보드로 입력받아 list에 출력 후 종료
//이름이 end면 종료
//단, 동일한 이름은 등록되지  않도록 구현한다

package list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest_01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		while (true) {
			boolean sw = true;
			System.out.print("이름 입력:");
			String name = scn.next();
			if (name.equalsIgnoreCase("end")) {
				break;
			}
			if (list.contains((name))) {
				sw = false;
			}
			if (sw) {
				list.add(name);
			}
		}
		for (String strarr : list) {
			System.out.println(strarr);
		}
		scn.close();
	}
}
