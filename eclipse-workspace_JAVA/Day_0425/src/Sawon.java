
public class Sawon {
	int sabun; // 사번
	String name; // 이름
	int age; // 나이

	public Sawon() {
	}

	public Sawon(int sabun, String name, int age) {
		this.sabun = sabun;
		this.name = name;
		this.age = age;
	}

	public void title() {
		System.out.println("\t*사원정보리스트*");
		System.out.println("사번\t이름\t나이");
	}

	public void dataPrint() {
		System.out.println(sabun + "\t" + name + "\t" + age);
	}
}
