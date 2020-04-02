import java.util.ArrayList;
import java.util.List;

public class Exam_03 {
	public static void main(String[] args) {
		List <Object>list = new ArrayList<Object>();
		list.add(1234);
		list.add(3.141592);
		list.add("홍길동");
		list.add(90);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.set(2, "홍길순"); // 지정된 위치에 값을 바꿔 변환
		list.remove(3); // 지정된 위치에 값을 삭제
		
		System.out.println("============================");
	}
}
