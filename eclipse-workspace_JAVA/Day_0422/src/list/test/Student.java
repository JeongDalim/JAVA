package list.test;

public class Student {
	private int bun;
	private String name;
	private int score;

	public Student() {

	}

	public Student(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return student.bun == bun && student.name.equals(name);
		}
		return false;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bun + "\t" + name + "\t" + score;
	}
}
