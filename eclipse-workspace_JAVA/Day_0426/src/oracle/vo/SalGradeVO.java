package oracle.vo;

public class SalGradeVO {
	private int grade; // 급여등급
	private int losal; // 급여 하한 값
	private int hisal; // 급여 상한 값

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getLosal() {
		return losal;
	}

	public void setLosal(int losal) {
		this.losal = losal;
	}

	public int getHisal() {
		return hisal;
	}

	public void setHisal(int hisal) {
		this.hisal = hisal;
	}
}
