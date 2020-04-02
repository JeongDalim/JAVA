package Lotto;

public class LottoClass {
	int[] result = new int[6];
	String str;

	public LottoClass() {

	}

	public LottoClass(int[] result, String str) {
		this.result = result;
		this.str = str;
	}

	public void print() {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "\t");
		}
		System.out.println(str);
	}
}
