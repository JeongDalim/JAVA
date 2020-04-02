import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int arr[] = { 20, 50, 30, 67, 55, 78, 97, 85, 70 };
		System.out.println("정렬전===================================");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("정렬후===================================");
		Arrays.parallelSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("정렬전===================================");
		String str[] = { "홍길동", "김자바", "파이썬", "java", "python", "seoul" };
		for (String str2 : str) {
			System.out.print(str2 + " ");
		}
		System.out.println();
		System.out.println("정렬후===================================");
		Arrays.parallelSort(str);
		for (String str2 : str) {
			System.out.print(str2 + " ");
		}
	}
}
