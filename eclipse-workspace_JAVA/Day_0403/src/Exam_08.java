//������ ����ȣ��
class G {
	public G() {
		System.out.println("G ������ ȣ��");
	}
}

class GG extends G {
	public GG() {
		System.out.println("GG ������ ȣ��");
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		// G g = new G();
		GG gg = new GG(); // GŬ������ �����ڰ� ���� ��������� ȣ�� ��, GG�����ڰ� ȣ��ȴ�.
		gg.hashCode();
	}
}
