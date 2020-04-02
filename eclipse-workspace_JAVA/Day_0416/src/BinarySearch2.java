import java.util.Scanner;

//이진검색법
//필수조건 : 오름차순 또는 내림차순이어야 한다
public class BinarySearch2 {
	public static void main(String[] args) {
		int intData[] = { 10, 20, 30, 35, 45, 50, 60, 65, 77, 79, 85, 90, 95 };
		Scanner scn = new Scanner(System.in);
		System.out.print("찾을 값: ");
		int var = scn.nextInt();
		int low = 0; // 첫번쨰 데이터값 위치
		int high = intData.length - 1; // 마지막 데이터값 위치
		int mid = 0; // 중앙값 계산용
		boolean sw = true;
		while (low <= high) {
			mid = (low + high) / 2;
			if (var == intData[mid]) {
				System.out.println(var + "는 " + (mid + 1) + "번째 존재합니다.");
				sw = false;
				break;
			}
			if (var > intData[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		if (sw) {
			System.out.println(var + "는 존재하지 않습니다.");
		}
		scn.close();
	}
}
