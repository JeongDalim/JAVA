
public class CardExam {
	public static void main(String[] args) {
		Card c = new Card();
		c.name = "È«±æµ¿";
		c.tel = "010-1111-2222";
		c.email = "hong@naver.com";
		c.age = 28;
		c.cardprint();
		System.out.println("ÀÌ¸§: " + c.name);
		Card c1 = new Card();
		c1.name="±èÀÚ¹Ù";
		c1.cardprint();
	}
}
