package P01_Dong;

class Sawon {
	String id;
	String passwd;
	String name;

	Sawon() {

	}

	public boolean login(String id, String passwd) {
		if (this.id.equalsIgnoreCase(id) && this.passwd.equalsIgnoreCase("1234")) {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String id) {
		System.out.println(id + "°¡ ·Î±×¾Æ¿ô");
	}
}

public class Exam_02 {

}
