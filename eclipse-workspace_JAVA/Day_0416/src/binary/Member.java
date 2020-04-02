package binary;

public class Member {
	private int sNO;
	private String name;
	private int age;

	public Member() {

	}

	public Member(String name) {
		this.name = name;
	}

	public Member(int sNO, String name, int age) {
		this.sNO = sNO;
		this.name = name;
		this.age = age;
	}

	public int getsNO() {
		return sNO;
	}

	public void setsNO(int sNO) {
		this.sNO = sNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
