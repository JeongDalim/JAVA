
public class Sort {
	static void selectSort(int[] arr) { // 선택정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}
	}

	static void bubbleSort(int[] arr) { // 버불정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[i] > arr[j + 1]) {
					int temp = arr[j];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 30, 50, 20, 90, 50, 73, 44, 50, 25 };
		bubbleSort(arr);

	}
}
