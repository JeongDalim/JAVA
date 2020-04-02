//주사위를 10번 던져 1부터 6까지 수가 몇번 나왔는지
package MathExam;

public class Exam_03 {

	public static void main(String[] args) {

		int[] dice = new int[6];
		int var = 0;
		for (int i = 0; i < 10; i++) {
			var = (int) (Math.random() * 6) + 1;
			if (var == 1) {
				dice[0]++;
			} else if (var == 2) {
				dice[1]++;
			} else if (var == 3) {
				dice[2]++;
			} else if (var == 4) {
				dice[3]++;
			} else if (var == 5) {
				dice[4]++;
			} else if (var == 6) {
				dice[5]++;
			}
		}
		for (int j = 0; j < dice.length; j++) {
			System.out.println(dice[j]);
		}
		System.out.println("=============================");

		int[] arr = new int[6];

		for (int z = 0; z < 10; z++) {
			int var2 = (int) (Math.random() * 6) + 1;
			++arr[var2 - 1];
		}
		for (int k = 0; k < dice.length; k++) {
			System.out.println(arr[k]);
		}

	}
}