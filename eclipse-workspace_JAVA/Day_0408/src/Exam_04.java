
// ��Ƽ�����带 ������ ��κ��� ����� ArrayList�� ����. 
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
