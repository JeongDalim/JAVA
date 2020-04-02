package tree.member;

public class Member implements Comparable<Member> { // �긦 �������̵����ָ� equals()�� �������̵������� �ʾƵ� equals�� �ڵ����� �������̵� ���ش�,
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
