
public class Exam_08 {
	static int method(int[] simsa2) {
		int tot = simsa2[0];
		int max = simsa2[0];
		int min = simsa2[0];
		int result;
		for (int i = 1; i < simsa2.length; i++) {
			tot+=simsa2[i];
			if (max < simsa2[i]) {
				max = simsa2[i];
			}

			if (min > simsa2[i]) {
				min = simsa2[i];
			}
		}
	    /*for (int j = 0; j < simsa2.length; j++) {
		  tot = tot + simsa2[j];
		}*/
		result = tot - max - min;
		return result;
	}

	public static void main(String[] args) {
		int[] simsa = { 9, 8, 7, 5, 3, 4, 8 };
		System.out.println(method(simsa));
	}
}
