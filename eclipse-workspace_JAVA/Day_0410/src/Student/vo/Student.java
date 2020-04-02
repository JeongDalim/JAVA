package Student.vo;

public class Student {
	private int ban;
	private int bun;
	private String name;
	private int score;
	private int rank;

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Student() {

	}

	@Override
	public String toString() {
		String str = this.ban + "\t" + this.bun + "\t" + this.name + "\t" + this.score + "\t" + this.rank;
		return str;
	}
}
