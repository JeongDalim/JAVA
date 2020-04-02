package oracle.vo;

public class DepartmentVO {
	private int dno;// 부서ㅁ번호
	private String dname; // 부서명
	private String loc; // 지역명

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
