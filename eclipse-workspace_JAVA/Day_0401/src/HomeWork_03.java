//배열의 최댓값, 최솟값 구하는 방법
public class HomeWork_03 {
	public static void main(String[] args) {
		int[] arr = { 80, 70, 90, 60, 50, 76, 88, 67, 85, 79 };
		System.out.print("Source= ");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int var = arr[i];
					arr[i] = arr[j];
					arr[j] = var;
				}
			}
		}
		System.out.println();
		System.out.print("Sort= ");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}

