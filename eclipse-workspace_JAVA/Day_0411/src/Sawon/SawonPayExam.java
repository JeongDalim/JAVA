package Sawon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SawonPayExam {
	public static void main(String[] args) {
		List<SawonPay> list = new ArrayList<SawonPay>();
		Scanner scn = new Scanner(System.in);
		SawonPay sawonPay = null;
		while (true) {
			System.out.print("사원정보: ");
			String id = scn.next();
			if (id.equalsIgnoreCase("end")) {
				break;
			}
			int grade = scn.nextInt();
			int workingTime = scn.nextInt();
			if (workingTime >= 50) {
				workingTime = 50;
			}
			sawonPay = new SawonPay(id, grade, workingTime);
			list.add(sawonPay);
		}
		int workingTot = 0;
		int weekPayTot = 0;
		System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			workingTot += list.get(i).getWorkingTime();
			weekPayTot += (int) list.get(i).getWeekPay();
		}
		System.out.println("합계\t\t\t" + workingTot + "\t" + weekPayTot);
		scn.close();
	}
}
