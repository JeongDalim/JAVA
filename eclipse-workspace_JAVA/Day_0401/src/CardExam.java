
public class CardExam {
	public static void main(String[] args) {
		Card c = new Card();
		c.name = "ȫ�浿";
		c.tel = "010-1111-2222";
		c.email = "hong@naver.com";
		c.age = 28;
		c.cardprint();
		System.out.println("�̸�: " + c.name);
		Card c1 = new Card();
		c1.name="���ڹ�";
		c1.cardprint();
	}
}
