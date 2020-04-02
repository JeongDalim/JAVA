package tree.member;

public class Member implements Comparable<Member> { // 얘를 오버라이딩해주면 equals()를 오버라이딩해주지 않아도 equals를 자동으로 오버라이딩 해준다,
	private int num;
	private String name;
	private int score;

	public Member() {

	}

	public Member(int num, String name, int score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return num + "\t" + name + "\t" + score;
	}  

	@Override
	public int compareTo(Member o) {
		if (this.num < o.num) {
			return -1;
		} else if (num == o.num) {
			return 0;
		} else {
			return 1;
		}
	}
}
