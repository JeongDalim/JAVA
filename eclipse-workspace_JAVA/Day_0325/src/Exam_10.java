//str.split();,str.substring();,str.length();
public class Exam_10 {
	public static void main(String[] args) {
		String str = "111,222,333,444,555,666";
		String[] str2 = str.split(",");// split �޼ҵ� �� ���ڿ��� �������� �и��Ѵ�.
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		System.out.println(str2[2]);
		System.out.println(str2[3]);
		System.out.println(str2[4]);
		System.out.println(str2[5]);
		System.out.println();
		System.out.println(str.substring(0, 3));// str���ڿ��� 0��°���� 3��° ������ �����͸� �� �� �ִ�.
		System.out.println(str.substring(4, 7));
		System.out.println(str.substring(8, 11));
		System.out.println(str.substring(12, 15));
		System.out.println(str.substring(16, 19));
		System.out.println(str.substring(20, 23));
		System.out.println();
		System.out.println(str.length());// str�� ���ڿ��� ������ �� �� �ִ�.

	}
}
