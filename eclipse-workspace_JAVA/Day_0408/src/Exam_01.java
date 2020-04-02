import java.util.ArrayList;

public class Exam_01 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>(); // 디폴트크기로 16개
		// ArrayList<Object> list2 = new ArrayList<Object>(10); // 지정된 수 크키로
		list.add("hellow java!"); // 배열과는 다르게 list는 같은 공간에 다른 자료형도 들어갈 수 있다.
		list.add(3.141592);
		list.add('A');
		list.add(true);
		System.out.println(list.size()); // 리스트의 크기를 반환
		System.out.println(list.isEmpty());// 리스트가 비었는지 true,false를 반환
		System.out.println(list.get(0)); // 0번째 값을 반환
		boolean bool = list.contains('A'); // 리스트안에 'A'라는 값이 있는지 true,false를 반환
		System.out.println("A는 존재하는가? " + bool);
		System.out.println("A는 " + list.indexOf('A') + "번째 위치하고 있습니다.");
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 출력 " + list.get(i)); // for문을 이용한 전체출력
		}
	}
}
