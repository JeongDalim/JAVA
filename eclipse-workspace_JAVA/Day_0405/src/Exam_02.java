
import java.util.StringJoiner;

public class Exam_02 {
	public static void main(String[] args) {

		String[] str = { "010", "2242", "3810", "java", "programing" };

		String str2 = String.join("#", str);// �迭�� ������ �����ڷ� �����ؼ� ���ڿ��� ��ȯ���ִ� join() �Լ�
		System.out.println(str2); // class�̸����� ���� ������ �� �ִ� �Լ��� static �Լ��̴�.
		System.out.println("================================");
		StringJoiner sj = new StringJoiner(",");
		for (String str3 : str) { // str�� str3�� str�迭�� ���̸�ŭ �ִ´�.
			sj.add(str3);
		}
		System.out.println(sj);
		System.out.println("================================");
		for (int i = 0; i < str.length; i++) { // �Ϲ� for������ ������ ����� ����.
			sj.add(str[i]);
		}
		System.out.println(sj);
	}

}
