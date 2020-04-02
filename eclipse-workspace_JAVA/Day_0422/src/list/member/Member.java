package list.member;

public class Member {
	private int index;
	private String name;
	private int age;

	public Member() {

	}

	public Member(int index, String name, int age) {
		this.index = index;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return index + "\t" + name + "\t" + age;
	}
}
