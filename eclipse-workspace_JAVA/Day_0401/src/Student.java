
public class Student {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;

	public Student() { // ����Ʈ ������
	}

	public Student(int num, String name, int kor, int eng, int mat) { // �Ű������� �ִ� ������
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum();
		sPrintData();
	}

	public void sum() {
		tot = kor + eng + mat;
		avg = (double) tot / 3;
	}

	public void sPrintTitle() {
		;
		System.out.println("\t\t**�����϶�ǥ**");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
	}

	public void sPrintData() {
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
	}
}
