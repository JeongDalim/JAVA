package Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		int[] dangChum = { 7, 10, 19, 22, 28, 34 }; // 1���ȣ
		int cnt2 = 0; // ��� Ȯ�ο�
		String str = ""; // ��� �ֱ��
		LottoClass lc = null;
		List<LottoClass> lottoList = new ArrayList<LottoClass>();
		Random lotto = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("���� �� �Է�: ");
		int gamecnt = scn.nextInt(); // ����� �Ұ���
		scn.close();
		int temp = 0; // sort��
		int cnt = 0; // 1���Ӵ� 1����
		int[] result = null; // �迭����
		while (cnt < gamecnt) { // �ڱⰡ �� ���� Ƚ���� ���� ���� �� ���� �ݺ�
			result = new int[6]; // �迭 �ʱ�ȭ
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
				str = "1��";
			} else if (cnt2 == 5) {
				str = "2��";
			} else if (cnt2 == 4) {
				str = "3��";
			} else if (cnt2 == 3) {
				str = "4��"; 
			} else if (cnt2 == 2) {
				str = "5��";
			} else {
				str = "��";
			}

			lc = new LottoClass(result, str); // ��ü�� ���� �ϰ� �迭�� �Ķ���ͷ� �ֱ�
			lottoList.add(lc); // ����Ʈ�� �� ��ü�� �ֱ�
			cnt++; // 1�� �ζ� �������� ++
			cnt2 = 0;
		}
		for (

				int q = 0; q < lottoList.size(); q++) { // ��¿�
			lottoList.get(q).print();
		}
	}
}
