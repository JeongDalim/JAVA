
public class Student {
	int num;
	String name;
	int score;
	String graph = "";

	public Student() {

	}
	public Student(int num, String name, int score) {
		this.num = num;
		this.name = name;
		this.score = score;
		printGraph();
	}

	public void printTitle() {
		System.out.println("\t�����϶�ǥ");
		System.out.println("��ȣ\t�̸�\t����\t�׷���");
	}

	public void printGraph() {
		String str = "";
		for (int i = 1; i <= score; i++) {
			if (i % 5 == 0) {
				str += "*";
			}
		}
		this.graph = str;
	}

	public void printScore() {
		System.out.println(num + "\t" + name + "\t" + score + "\t" + graph);
	}
}
