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
		p1.setName("홍길동");
		p1.setAddr("대전");
		p1.setAge(30);
		System.out.println("주민번호:" + p1.getSno());
		System.out.println("이름:" + p1.getName());
		System.out.println("주소:" + p1.getAddr());
		System.out.println("나이:" + p1.getAge());

	}

}
