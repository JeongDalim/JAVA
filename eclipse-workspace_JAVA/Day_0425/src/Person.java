
public class Person {
	int bun;
	String name;
	String redate;
	int money;
	int rank;

	public Person() {
	}

	public Person(int bun, String name, String redate, int money) {
		this.bun = bun;
		this.name = name;
		this.redate = redate;
		this.money = money;
	}

	public void printTitle() {
		System.out.println("��ȣ\t�̸�\t�Ի�����\t�⺻��\t��������");
	}

	public void print() {
		System.out.println(bun + "\t" + name + "\t" + redate + "\t" + money + "\t" + rank);
	}
}
