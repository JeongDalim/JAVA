
// 멀티쓰레드를 제외한 대부분의 기능은 ArrayList와 같다. 
import java.util.Vector;

public class Exam_04 {
	public static void main(String[] args) {
		Vector<Object> vc = new Vector<Object>();
		vc.add(1234);
		vc.add("hellow java!");
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(vc.get(i));
		}
	}
}
