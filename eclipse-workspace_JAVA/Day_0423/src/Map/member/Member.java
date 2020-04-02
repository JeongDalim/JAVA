package Map.member;

public class Member {
	private int num;
	private String name;

	public Member() {

	}

	public Member(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.num == num && member.name.equals(name);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return num + name.hashCode();
	}

	@Override
	public String toString() {
		return num + "\t" + name;
	}
}
