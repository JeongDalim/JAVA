package StringExam;

public class Member {

	String name;
	String tel;
	String joomin;
	String gender;
	int age;

	public Member() {
	}

	public Member(String name, String tel, String joomin) {
		this.name = name;
		this.tel = tel;
		this.joomin = joomin;
	}

	public void print() {
		genderinfo();
		ageinfo();
		System.out.println(name + "\t" + tel + "\t" + gender + "\t" + age);
	}

	public String genderinfo() {
		String str = joomin.substring(7);
		if (str.equals("1") || str.equals("3")) {
			this.gender = "남성";
		} else {
			this.gender = "여성";
		}
		return this.gender;
	}

	public int ageinfo() {
		if (Integer.parseInt(this.joomin.substring(0, 2)) > 10) {
			this.age = 2019 - (1900 + Integer.parseInt(this.joomin.substring(0, 2)));
		} else {
			this.age = 2019 - (2000 + Integer.parseInt(this.joomin.substring(0, 2)));
		}
		return this.age;
	}
}
