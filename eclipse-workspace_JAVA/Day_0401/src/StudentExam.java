
public class StudentExam {
	public static void main(String[] args) {
		/*
		 * Scanner scn = new Scanner(System.in); System.out.print("�л� ���� �Է�: ");
		 * System.out.println();
		 */
		Student s1 = new Student();
		s1.num = 1101;
		s1.name = "ȫ�浿";
		s1.kor = 88;
		s1.eng = 90;
		s1.mat = 95;
		s1.sum();
		s1.sPrintTitle();
		s1.sPrintData();
		Student s2 = new Student(1102, "ȫ���", 95, 80, 83); // �����ڿ� �Ű������� �Է� ���� ��°����ϰ�
		s2.sum();
	}
}
