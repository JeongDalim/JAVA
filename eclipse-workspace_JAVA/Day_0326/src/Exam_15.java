import java.io.IOException;

public class Exam_15 {
	public static void main(String[] args) throws IOException {
		System.out.print("���� �Է�= ");

		int var = System.in.read();
		String str = (var >= 48 && var <= 57) ? "" + var : "error";
		System.out.println(str);

		System.out.print("���� �Է�= ");
		char ch = (char) System.in.read();
		String str2 = (ch >= '0' && ch <= '9') ? "" + ch : "error";
		System.out.println(str2);

		System.out.print("���ĺ� �Է�= ");
		char ch2 = (char) System.in.read();
		String str3 = (ch2 >= 'A' && ch2 <= 'Z' || ch2 >= 'a' && ch2 <= 'z') ? "" + ch2 : "error";
		System.out.println(str3);
	}
}
