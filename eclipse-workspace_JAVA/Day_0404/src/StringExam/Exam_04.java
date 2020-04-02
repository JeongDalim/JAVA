//split()함수
package StringExam;

public class Exam_04 {
	public static void main(String[] args) {
		String str = "H-e-l-l-o-w,-j-a-v-a!";
		String tel="010 2242 3810";
		String [] s =str.split("-"); //split()함수는 ()내부에 있는 문자를 기준으로 분리하여 배열에 담아 반환한다.
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		String [] t =tel.split(" "); 
		for(int j=0; j<t.length; j++) {
			System.out.print(t[j]);
		}
		
	}
}
