
public class StudentExam {
	public static void main(String[] args) {
		/*
		 * Scanner scn = new Scanner(System.in); System.out.print("학생 정보 입력: ");
		 * System.out.println();
		 */
		Student s1 = new Student();
		s1.num = 1101;
		s1.name = "홍길동";
		s1.kor = 88;
		s1.eng = 90;
		s1.mat = 95;
		s1.sum();
		s1.sPrintTitle();
		s1.sPrintData();
		Student s2 = new Student(1102, "홍길순", 95, 80, 83); // 생성자에 매개변수를 입력 쉽게 출력가능하게
		s2.sum();
	}
}
