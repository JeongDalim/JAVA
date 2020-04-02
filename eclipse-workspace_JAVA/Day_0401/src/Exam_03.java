
public class Exam_03 {
	static void method(int[][] arr2, String[] name2) {
		System.out.println("\t\t성적일람표");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i][0] + "\t"); // 번호
			System.out.print(name2[i] + "\t");
			for (int j = 1; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void method2(int[][] arr3, String[] name3) {

		for (int i = 0; i < arr3.length - 1; i++) {
			for (int j = i + 1; j < arr3[i].length - 1; j++) {
				if (arr3[i][0] > arr3[j][0]) {
					// 교환 번,영어,국어,수학,총점
					int[] temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
					/*
					 * 또는 for (int k = 0; k < arr3[1].length; k++) { temp = arr3[i][k]; arr3[i][k] =
					 * arr3[j][k]; arr3[j][k] = temp; }
					 */
					// 이름교환
					String name4 = name3[i];
					name3[i] = name3[j];
					name3[j] = name4;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 95, 88, 79, 0 }, { 5, 93, 85, 89, 0 }, { 3, 85, 78, 70, 0 }, { 2, 89, 92, 85, 0 } };
		String[] name = { "홍길동", "김자바", "파이썬", "시샵" };

		// 총점
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length - 1; j++)
				arr[i][arr[i].length - 1] += arr[i][j];
		}
		method(arr, name);
		method2(arr, name);
		method(arr, name);
	}
}
