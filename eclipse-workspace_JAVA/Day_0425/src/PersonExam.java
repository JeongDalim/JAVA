import java.util.Scanner;

/* 1.입력형식 최대 10명, 번호가 0이면 출력
 * 번호:(1~10)
 * 이름: free
 * 입사일:(2019/01/01)
 * 기본급:(50000~500000)
 *2.출력형식
 * 번호   이름   입사일                 기본급      연봉순위
 * 8   AAA 2017/03/03 300000 3
 * 
 *3. 출력 형식(사원번호순으로 출력)
 *   번호   이름   입사일                 기본급      연봉순위
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
			System.out.print("사번입력: ");
			bun = scn.nextInt();
			if (bun == 0) {
				break;
			}
			System.out.print("이름입력: ");
			name = scn.next();
			System.out.print("입사일입력: ");
			redate = scn.next();
			System.out.print("기본급입력: ");
			money = scn.nextInt();
			p = new Person(bun, name, redate, money);
			pArr[cnt] = p;
			cnt++;
		}
		for (int x = 0; x < cnt; x++) { // 사번
			for (int y = x + 1; y < cnt; y++) {
				if (pArr[x].bun > pArr[y].bun) {
					temp = pArr[x].bun;
					pArr[x].bun = pArr[y].bun;
					pArr[y].bun = temp;
				}
			}
		}
		for (int k = 0; k < cnt; k++) { // 석차계산
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
