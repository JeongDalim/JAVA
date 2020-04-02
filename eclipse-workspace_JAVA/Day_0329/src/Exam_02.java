
public class Exam_02 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };// 배열을 선언 할당 초기화까지 동시에 한다.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i]; // 배열안의 총합
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t"); // 배열안의 값 출력
		}
		System.out.println(sum); // 총합 출력
//=========================또는================================
		int[] arr2 = { 10, 20, 30, 40, 50, 60, 0 };
		for (int j = 0; j < arr2.length - 1; j++) {
			arr[arr.length - 1] += arr[j];
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j] + "\t"); // 배열안의 값 출력
		}
	}
}
