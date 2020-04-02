package student2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) throws Exception {
		String strTemp = "";
		String[] strAnswerArray = null;
		List<String> sAnswerList = new ArrayList<String>();
		StudentData sData = null;

		System.out.print("Type answers\t: ");
		Scanner scnIn = new Scanner(System.in);
		strTemp = scnIn.nextLine();
		scnIn.close();

		strAnswerArray = strTemp.split(",");
		sData = new StudentData(strAnswerArray);

		Scanner scnFile = new Scanner(new File("c://text//studentcheck.txt"));
		while (scnFile.hasNext()) {
			sAnswerList.add(scnFile.nextLine());
		}
		scnFile.close();

		sData.calScore(sAnswerList);

	}
}