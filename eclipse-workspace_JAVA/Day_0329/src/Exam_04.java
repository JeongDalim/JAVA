//�޼ҵ� �Ű������� �迭�� �޴� ���(������ ���� ȣ��)
public class Exam_04 {
	static void method(int[] var2) {// �޴� �Ű������� �迭�� ���־�Ѵ�.
		int tot = 0;
		for (int i = 0; i < var2.length; i++) {
			tot += var2[i];
		}
		double avg = (double) tot / var2.length;
		System.out.println("tot= " + tot);
		System.out.println("avg= " + avg);
		var2[0] = 100;// ���⼭ var2[0] ���� �ٲٸ� var[0]�� ���� �ٲ��. var�� var2�� ���� ���� ����Ű�� �ֱ� �����̴�.
	}

	public static void main(String[] args) {
		int var[] = { 79, 66, 77, 90, 76, 56, 87, 78, 73, 56 };
		System.out.println("�޼ҵ� ȣ�� ��");
		for (int i = 0; i < var.length; i++) {
			System.out.print(var[i] + "\t");
		}
		System.out.println();
		method(var);
		System.out.println("�޼ҵ� ȣ�� ��");
		for (int i = 0; i < var.length; i++) {
			System.out.print(var[i] + "\t");
		}
	}

}
