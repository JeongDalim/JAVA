
public class Exam_03 {
	public static void main(String[] args) {
		char[] ch = new char[10];
		ch[0] = 'A';
		ch[1] = 'B';
		ch[2] = 'C';
		ch[3] = 'D';
		char[] ch2 = { 'A', 'B', 'C', 'D', 'E', 'F', '1', '5' };
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		System.out.println(ch2);// char배열은 유일하게 출력할경우 주소가 출력되지않고 값이 출력된다
	}
}
