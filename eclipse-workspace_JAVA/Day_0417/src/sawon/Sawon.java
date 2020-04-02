package sawon;

public class Sawon {
	private int sabun;
	private String name;
	private int pay;

	public Sawon() {

	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public Sawon(int sabun, String name, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return sabun + "\t" + name + "\t" + pay;
	}
}
