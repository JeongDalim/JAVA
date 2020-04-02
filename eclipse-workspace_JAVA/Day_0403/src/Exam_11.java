class MemberExam extends Member {
	int money;

	public MemberExam(int idx, String name, int age) {
		this.idx = idx;
		this.name = name;
		this.age = age;
	}

	public void Mprint() {
		System.out.print(idx + "\t" + name + "\t" + age+"\t");
	}

	@Override
	public int result(int money) {
		this.money = money;
		int result = 0;
		result = this.age * money;
		return result;
	}

	@Override
	public void update(int idx, int age) {
		this.idx = idx;
		this.age = age;
		if (this.idx == 1) {
			System.out.print(super.idx + "\t" + super.name + "\t" + super.age+"\t");
			System.out.println(this.result(this.money));
		} else {
			System.out.println(idx+"�� �������� �ʽ��ϴ�.");
		}
	}
}

public class Exam_11 {
	public static void main(String[] args) {
		MemberExam mem = new MemberExam(1, "ȫ�浿", 30);
		mem.Mprint();
		// 1 ȫ�浿 30
		int money = mem.result(10000);
		System.out.println(money);
		// 300000 -> ����*money ��� ��
		mem.update(1, 70);
		// 1 ȫ�浿 50

	}
}
