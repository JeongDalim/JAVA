
public class Exam_01 {
	public static void main(String[] args) {
		int[] arr;// 배열변수 선언
		arr = new int[5];// 할당(기억공간 확보)
		System.out.println(arr); // arr배열의 첫번재 주소값이 출력될것이다
		System.out.println(arr[0]);// 할당하는 순간 디폴트값 0이 들어가서 0이 출력된다
		arr[0] = 10; // 대입
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr.length);// 배열의 길이를 알려준다
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} // for문을 이용하여 배열 안의 값을 전부 출력가능하다
	}
}
