// JAVA BEAN ���� == POJO(PLAN OLD JAVA OBJECT)����
package oracle.vo;

public class EmployeeVO {
	private int eno; // �����ȣ
	private String ename;// �����
	private String job;// ������
	private int hiredate;// �Ի���
	private int salary;// �޿�
	private int commission;// Ŀ�̼�
	private int dno; // �μ���ȣ

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHiredate() {
		return hiredate;
	}

	public void setHiredate(int hiredate) {
		this.hiredate = hiredate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}
}
