package RandomExam;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[6];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;
		}
		for (int j = 0; j < arr.length - 1; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] == arr[k]) {
					for (int x = 0; x < arr.length; x++) {
						arr[x] = r.nextInt(45) + 1;
					}
				}
				if (arr[j] > arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		for (int s = 0; s < arr.length; s++) {
			System.out.print(arr[s] + " ");
		}
	}
}
