import java.util.Scanner;

public class Exam_05 {

	static void sumAvg(int arr2[]) {
		int tot = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
			tot += arr2[i];
		}
		double avg = (double) tot / arr2.length;
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println("총합= " + tot);
		System.out.println("평균= " + avg);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt1 = 0;
		int cnt2 = 0;
		while (true) {
			System.out.print("데이터를 입력하시오= ");
			cnt2 = scn.nextInt();
			if (cnt2 > 0) {
				arr[cnt1] = cnt2;
				cnt1++;
			}
			if (cnt1 == 10) {
				break;
			}
		}
		sumAvg(arr);
		scn.close();
	}
}
