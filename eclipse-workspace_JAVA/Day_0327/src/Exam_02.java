//�Ű������� ���ϰ��� ���� ���.
public class Exam_02 {
	static void print() {
		System.out.println("print() �޼ҵ尡 ȣ��Ǿ����ϴ�.");
	}

	public static void main(String[] args) {
		int cnt = 0;
		while (true) {
			print();
			cnt++;
			if (cnt == 5) {
				break;
			}
		}
		System.out.println("end");
	}
}
