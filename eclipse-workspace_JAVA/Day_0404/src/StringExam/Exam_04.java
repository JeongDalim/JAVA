//split()�Լ�
package StringExam;

public class Exam_04 {
	public static void main(String[] args) {
		String str = "H-e-l-l-o-w,-j-a-v-a!";
		String tel="010 2242 3810";
		String [] s =str.split("-"); //split()�Լ��� ()���ο� �ִ� ���ڸ� �������� �и��Ͽ� �迭�� ��� ��ȯ�Ѵ�.
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		String [] t =tel.split(" "); 
		for(int j=0; j<t.length; j++) {
			System.out.print(t[j]);
		}
		
	}
}
