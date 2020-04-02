package Student;

public class Student {
	private int bun;
	private String name;
	private int[] jumsu = new int[5];
	private int tot;
	private double ave;
	 int rank;

	public Student() {
	}

	public Student(int bun, String name, int[] jumsu) {
		this.bun = bun;
		this.name = name;
		this.jumsu = jumsu;
		totavemethod();
	}

	public void print() { // 자료출력메소드
		System.out.print(bun + "\t" + name+"\t");
		System.out.print(tot + "\t" + ave + "\t" + rank + "\n");
	}

	public void totavemethod() { // 총점평균계산
		for (int i = 0; i < jumsu.length; i++) {
			this.tot += jumsu[i]; //점수합계
		}
		ave = (double) tot / jumsu.length; //평균계산
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	

}
