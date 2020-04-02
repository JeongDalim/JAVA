package school.student;

public class Student {
	private int bun;
	private String name;
	private String tel;
	private int score;
	private int tno;

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public Student() {

	}

	public Student(int bun, String name, String tel, int score, int tno) {
		this.bun = bun;
		this.name = name;
		this.tel = tel;
		this.score = score;
		this.tno = tno;
	}

	@Override
	public String toString() {
		return bun + "\t" + name + "\t" + tel + "\t" + score + "\t" + tno;
	}
}
