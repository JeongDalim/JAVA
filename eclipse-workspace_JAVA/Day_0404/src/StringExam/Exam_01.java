//API ���ø����̼� �������̽� 
package StringExam;

final class A { // class�� final�� ���̸� ��� ���� �� ����.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hellow, java!";
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		String str = "Hellow, java!";
		String str2 = new String("Hellow, java!");
		String str3 = "Hellow, java!";
		System.out.println(str + "\n" + str2 + "\n" + str3); // ����� ����.

		int a = 10;
		int b = 10;
		System.out.println(a + b);
		A a1 = new A();

		System.out.println(a1);

		System.out.println("str==str2= " + (str == str2)); // str2�� new�� �����Ǽ� ����Ű�� �ּҰ��� �ٸ���.
		System.out.println("str==str3= " + (str == str3)); // str�� str3�� ���� ���ڿ����̶� ����Ű�� �ּҰ��� ����.

		// equals�� �ּҰ��� �ƴ�, ���ڿ� ���� ���� ���� �����.
		System.out.println("str.equals(str2)=" + (str.equals(str2))); // str2�� new�� �����Ǽ� ����Ű�� �ּҰ��� �ٸ���.
		System.out.println("str.equals(str3)=" + (str.equals(str3))); // str2�� new�� �����Ǽ� ����Ű�� �ּҰ��� �ٸ���.
	}
	// String Ŭ������ ToString Ŭ�������� �������̵� �Ǿ��⶧���� �ּҰ� ��µ��� �ʰ� ���� ��µȴ�.
	// String Ŭ������ �������� �� ������ �����ϴ� String�� ���忭���� ���ٸ� ���� �������� �ʰ� �� ���� ����Ų��.
	// ������, new Ű����� �����Ǹ� ���ڿ����� ���Ƶ� ���� �����ȴ�.
}
