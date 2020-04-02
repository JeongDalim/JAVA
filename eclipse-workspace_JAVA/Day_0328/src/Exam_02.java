import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("c://text//indata.txt.txt"));
		while (scn.hasNext()) {
		int str = scn.nextInt();
			System.out.println(str);
		}
		scn.close();
	}
}
