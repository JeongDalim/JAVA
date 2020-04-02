
public class Sawon {
	private String bun;
	private String name;
	private int pay;

	public Sawon(String bun, String name) {
		this.bun = bun;
		this.name = name;
	}

	public String getBun() {
		return bun;
	}

	public void setBun(String bun) {
		this.bun = bun;
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

	public Sawon(String bun, String name, int pay) {
		this.bun = bun;
		this.name = name;
		this.pay = pay;
	}
}
