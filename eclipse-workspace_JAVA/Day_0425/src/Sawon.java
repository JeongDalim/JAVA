
public class Sawon {
	int sabun; // ���
	String name; // �̸�
	int age; // ����

	public Sawon() {
	}

	public Sawon(int sabun, String name, int age) {
		this.sabun = sabun;
		this.name = name;
		this.age = age;
	}

	public void title() {
		System.out.println("\t*�����������Ʈ*");
		System.out.println("���\t�̸�\t����");
	}

	public void dataPrint() {
		System.out.println(sabun + "\t" + name + "\t" + age);
	}
}
