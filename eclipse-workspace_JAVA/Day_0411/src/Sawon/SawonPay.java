package Sawon;

public class SawonPay {
	String id;
	int grade;
	int workingTime;
	int timePay;
	double weekPay;

	public SawonPay() {

	}

	public SawonPay(String id, int grade, int workingTime) {
		this.id = id;
		this.grade = grade;
		this.workingTime = workingTime;
		timePay();
		weekPay();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(int workingTime) {
		this.workingTime = workingTime;
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

	public double getWeekPay() {
		return weekPay;
	}

	public void setWeekPay(int weekPay) {
		this.weekPay = weekPay;
	}

	public int timePay() {
		if (this.grade == 1) {
			this.timePay = 10000;
		} else if (this.grade == 2) {
			this.timePay = 5000;
		} else if (this.grade == 3) {
			this.timePay = 2000;
		}
		return this.timePay;
	}

	public double weekPay() {
		if (this.workingTime <= 36) {
			this.weekPay = this.timePay * this.workingTime;
		} else if (this.workingTime > 36) {
			this.weekPay = (this.timePay * this.workingTime) + (this.timePay * ((this.workingTime - 36) * 0.5));
		}
		return this.weekPay;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + "\t" + this.grade + "\t" + this.timePay + "\t" + this.workingTime + "\t" + (int) this.weekPay;
	}
}
