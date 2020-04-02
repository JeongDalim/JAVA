package P01_Dong;

public class Exam_01 {
	public static void main(String[] args) {
		int[] arr = new int[7];
		for (int i = 0; i < 100; i++) {
			int x = (int) (Math.random() * 6 + 1);
			arr[x - 1]++;
			arr[arr.length - 1]++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
