//concat()�Լ�, equals()�Լ� , equalsIgnoreCase()�Լ�, indexOf()�Լ�
package StringExam;

public class Exam_03 {
	public static void main(String[] args) {
		String str = "Hellow,";
		str = str.concat("java!");// concat()�Լ��� ���� ���ڿ��� ���ο� ���ڿ��� �����ش�. ���ο� ���ڿ��� �� �Ҽ��� ���� �������
		System.out.println(str);// ���ο� ��ü�� ����� ������ ���̾��� �޸𸮸� ���� ��ƸԴ´�.

		if (str.equals("Hellow,java!")) {// equals()�� ()������ ���� ���ٸ� true, �ٸ��� false�� ��ȯ�Ѵ�.
			System.out.println("==");
		} else {
			System.out.println("!=");
		}

		if (str.equalsIgnoreCase("HELLOW,JAVA!")) {// qualsIgnoreCase()�� ��ҹ��ڸ� �����ϰ� ()������ ���� ���ٸ� true, �ٸ��� false�� ��ȯ�Ѵ�.
			System.out.println("==");
		} else {
			System.out.println("!=");
		}

		String str2 = "korea-seoul"; // indexOf()�� ()������ ���ڰ� ���° �����ϴ����� ��ȯ�Ѵ�. �������� ������ -1�� ��ȯ�Ѵ�.
		int a = str2.indexOf('a');
		System.out.println(a);

	}
}
