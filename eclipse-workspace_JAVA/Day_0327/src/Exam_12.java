//i부터 n까지의 합. 단, 작은 수에서 큰 수의 합.
public class Exam_12 {
	static void ForSum(int i, int j) {
		int sum = 0;
		if (i > j) {
			int t;
			t = i;
			i = j;
			j = t;
		}
		for (int x = i; x <= j; x++) {
			sum += x;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ForSum(10, 1);
	}
}
