//����������
public class Exam_13 {
	public static void main(String[] args) {
		// a++�� ++a�� ����
		int a = 5;
		int b = 0;
		b = a++; // a�� ���� b�� �����ϰ� a���� +1���ش�.
		System.out.println("b= " + b);
		System.out.println("a= " + a);
		System.out.println("================================");
		int a2 = 5;
		int b2 = 0;
		b2 = ++a2; // a2���� +1�� ���� ��, b2�� �����Ѵ�.
		System.out.println("b2= " + b2);
		System.out.println("a2= " + a2);
		System.out.println("================================");
		int a3 = 5;
		System.out.println("a3=" + a3);// a3= 5
		a3++;// a3=6
		System.out.println("a3=" + a3);// a3= 6
		++a3;// a3= 7
		System.out.println("a3=" + a3++);// a3=7 ����ϰ� a3�� +1
		System.out.println("a3=" + a3);// a3=8
		System.out.println("a3=" + ++a3);// a3�� +1���ְ� ���
	}
}
