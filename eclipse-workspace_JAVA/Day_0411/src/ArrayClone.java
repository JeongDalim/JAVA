
public class ArrayClone {
	public static void main(String[] args) {
		int[] vararr = { 30, 50, 20, 90, 50, 73, 44, 50, 25 };
		int[] vararr2 = vararr;
		for (int i = 0; i < vararr.length; i++) {
			System.out.print(vararr[i] + "\t");
		}

		System.out.println();
		vararr[0] = 100;
		for (int i = 0; i < vararr2.length; i++) {
			System.out.print(vararr2[i] + "\t");
		}
		System.out.println("===================================");
		for (int i = 0; i < vararr.length; i++) { // 배열복사하는법
			vararr2[i] = vararr[i];
		}
	}
}
