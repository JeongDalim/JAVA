package tree.student;

public class Student implements Comparable<Student> {
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
	public int compareTo(Student o) {
		if (bun < o.bun) {
			return -1;
		} else if (bun == o.bun) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {

		return bun + "\t" + name + "\t" + score;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return bun + name.hashCode() + score;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			obj = (Student) obj;
			return bun == ((Student) obj).bun;

		} else {
			return false;
		}
	}
}
