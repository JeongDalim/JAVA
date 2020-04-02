
public class Student {

	private int bun;
	private String name;
	private int score;

	public Student() {

	}

	public Student(int bun) {
		this.bun = bun;
	}

	public Student(int bun, String name) {
		this.bun = bun;
		this.name = name;
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

	public Student(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		String str = "번호:" + bun + "\t" + "이름:" + name + "\t" + "성적:" + score;
		return str;
	}
}
