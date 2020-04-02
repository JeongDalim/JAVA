
public class IntData {
	private int[] sawon = { 67, 20, 80, 50, 77, 95, 35, 45, 68, 81, 45 };

	public IntData() {

	}

	public int search(int var) {
		int cnt = 0;
		for (int i = 0; i < sawon.length; i++) {
			if (var == sawon[i]) {
				cnt = i + 1;
				break;
			}
		}
		return cnt;

	}
}
