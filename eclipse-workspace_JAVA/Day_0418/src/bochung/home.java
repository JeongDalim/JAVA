package bochung;

import java.util.Random;

public class home {

	public static void test1(int[] var) {
		String[] str = new String[var.length];
		int[] var2 = new int[var.length];

		for (int i = 0; i < var.length; i++) {
			var2[i] = var[i];
		}
		for (int i = 0; i < var.length; i++) {

			str[i] = "";
			while (var[i] > 0) {
				if (var[i] % 2 == 1) {
					str[i] = 1 + str[i];
				} else {
					str[i] = 0 + str[i];
				}
				var[i] = var[i] / 2;
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(var2[i] + ":" + str[i]);
		}
	}

	public static void main(String[] args) {
		Random r = new Random();
		int[] score = new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(10) + 20;
		}

		test1(score);
	}
}
