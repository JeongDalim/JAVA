/*회원관리 작성
1)입력형식
자료입력1= 홍길동,900206-1,010-2242-3810
자료입력2= 김자바,071015-2, 010-1111-2222
자료입력3= 홍자동,890723-1, 010-2222-3333
자료입력 n:end
2)출력형식
이름     전화                     성별     나이  
홍길동  010-2242-3810  남        29
김자바  010-1111-2222  여        12
홍자동  010-2222-3333  남        30
3)처리조건
-입력은 1라인씩 키보드로 입력한다.(항복의 구분은(,))
-'end'입력자료 끝으로 입력된 자료를 출력형식에 맞게 모두 출력
-입력인원은 최대 10명으로 한다.
-회원정보 클래스 Member ,메인클래스는 memberExam으로 한다.
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
			System.out.print("입력: ");
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
