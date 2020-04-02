//배열 최댓값 최솟값 구하기1
public class Exam_06 {

	static int method(int[] data2) {
		int max = -999;// 임의로 가장 작은 수를 초기화 // int min=999;
		for (int i = 0; i < data2.length; i++) {
			if (max < data2[i]) { // 배열에 있는 수들을 비교하는 식 // min>data2[i];
				max = data2[i];// min=data2[i];
			}
		}
		return max;// min;
	}

	public static void main(String[] args) {
		int[] data = { 79, 56, 78, 79, 90, 74, 46, 95, 55, 70 };
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("최댓값은= " + method(data));
	}
}
