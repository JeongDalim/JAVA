
public class Student {
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;

	public Student() { // 디폴트 생성자
	}

	public Student(int num, String name, int kor, int eng, int mat) { // 매개변수가 있는 생성자
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
		System.out.println("\t\t**성적일람표**");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
	}

	public void sPrintData() {
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
	}
}
