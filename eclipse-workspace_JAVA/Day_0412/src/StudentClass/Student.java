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
		System.out.println("��\t��ȣ\tü��");
	}

	@Override
	public String toString() {

		return ban + "��\t" + bun + "��\t" + kg + "kg";
	}

	public String sameClass() {
		return "\t" + bun + "��\t" + kg + "kg";
	}
}
