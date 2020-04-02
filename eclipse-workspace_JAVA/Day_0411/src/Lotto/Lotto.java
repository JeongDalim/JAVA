package Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		int[] dangChum = { 7, 10, 19, 22, 28, 34 }; // 1등번호
		int cnt2 = 0; // 등수 확인용
		String str = ""; // 등수 넣기용
		LottoClass lc = null;
		List<LottoClass> lottoList = new ArrayList<LottoClass>();
		Random lotto = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("게임 수 입력: ");
		int gamecnt = scn.nextInt(); // 몇게임 할건지
		scn.close();
		int temp = 0; // sort용
		int cnt = 0; // 1게임당 1증가
		int[] result = null; // 배열선언
		while (cnt < gamecnt) { // 자기가 할 게임 횟수와 같지 않을 때 까지 반복
			result = new int[6]; // 배열 초기화
			for (int j = 0; j < result.length - 1; j++) {
				for (int k = j + 1; k < result.length; k++) {
					if (result[j] == result[k]) {
						for (int x = 0; x < result.length; x++) {
							result[x] = lotto.nextInt(45) + 1;
						}
					}
					if (result[j] > result[k]) {
						temp = result[j];
						result[j] = result[k];
						result[k] = temp;
					}
				}
			}

			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result.length; k++) {
					if (dangChum[j] == result[k]) {
						++cnt2;
					}
				}

			}

			if (cnt2 == 6) {
				str = "1등";
			} else if (cnt2 == 5) {
				str = "2등";
			} else if (cnt2 == 4) {
				str = "3등";
			} else if (cnt2 == 3) {
				str = "4등"; 
			} else if (cnt2 == 2) {
				str = "5등";
			} else {
				str = "꽝";
			}

			lc = new LottoClass(result, str); // 객체를 선언 하고 배열을 파라미터로 넣기
			lottoList.add(lc); // 리스트에 그 객체를 넣기
			cnt++; // 1번 로또 돌렷으니 ++
			cnt2 = 0;
		}
		for (

				int q = 0; q < lottoList.size(); q++) { // 출력용
			lottoList.get(q).print();
		}
	}
}
