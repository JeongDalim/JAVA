
//클래스 배열을 이용해 객체를 생성하여 클래스 배열에 넣어 나중에 출력하는 프로그램
import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon[] sArr = new Sawon[10]; // 클래스 배열 초기화
		int cnt = 0;
		int sabun = 0;
		String name = null;
		Sawon s1 = null; // 객체 선언
		while (true) {
			System.out.print("사번 입력: ");
			sabun = scn.nextInt();
			if (sabun == 0) {
				break;
			}
			System.out.print("이름 입력: ");
			name = scn.next();
			System.out.print("나이 입력: ");
			int age = scn.nextInt();
			s1 = new Sawon(sabun, name, age); // 할당
			sArr[cnt] = s1; // 클래스배열에 매개변수가 들어간 객체들을 반복 1회당 하나씩 넣기
			cnt++;
		}
		sArr[0].title();
		for (int i = 0; i < cnt; i++) {
			sArr[i].dataPrint();
		}
		scn.close();
	}
}
