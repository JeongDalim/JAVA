//setter getter
class Person {
	private String sno;
	private String name;
	private String addr;
	private int age;

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Exam_02 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setSno("123456");
		p1.setName("ȫ�浿");
		p1.setAddr("����");
		p1.setAge(30);
		System.out.println("�ֹι�ȣ:" + p1.getSno());
		System.out.println("�̸�:" + p1.getName());
		System.out.println("�ּ�:" + p1.getAddr());
		System.out.println("����:" + p1.getAge());

	}

}
