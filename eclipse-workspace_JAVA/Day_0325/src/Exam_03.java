//1���ھ� �Է¹޾� ����ϱ�
import java.io.IOException;

public class Exam_03 {
	public static void main(String[] args) throws IOException {
		char a1 = (char) System.in.read();// ������ �Է¹޾� char������ ����ȯ�Ͽ� a1������ �����Ѵ�.
		char a2 = (char) System.in.read();
		char a3 = (char) System.in.read();
		char a4 = (char) System.in.read();
		char a5 = (char) System.in.read();
		System.out.println("A=" + ("" + a1 + a2 + a3 + a4 + a5));
		System.out.println("A=" + (+a1 + a2 + a3 + a4 + a5));
		System.out.println('J' + 'A' + 'V' + 'A');// �Ϲ��ڳ��� ���ϸ� ������ ��µ�.
		System.out.println("" + 'J' + 'A' + 'V' + 'A');// ""+�� ���ָ� ���ڿ��� ��µȴ�.
	}
}
