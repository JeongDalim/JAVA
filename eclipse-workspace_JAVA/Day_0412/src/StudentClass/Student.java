package StudentClass;

public class Student {
	int ban;
	int bun;
	int kg;

	public Student() {

	}

	public Student(int ban, int bun, int kg) {
		this.ban = ban;
		this.bun = bun;
		this.kg = kg;
	}

	public void printTitle() {
		System.out.println("반\t번호\t체중");
	}

	@Override
	public String toString() {

		return ban + "반\t" + bun + "번\t" + kg + "kg";
	}

	public String sameClass() {
		return "\t" + bun + "번\t" + kg + "kg";
	}
}
