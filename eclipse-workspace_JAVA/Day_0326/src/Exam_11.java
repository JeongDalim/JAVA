
//조건연산자2
import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력= ");
		int var = scn.nextInt();

		String str = (var % 7 == 0 && var % 5 == 0) ? "" + var : "error!"; //""+를 해주면 손쉽게 int를 String으로 바꿀 수 있다.
		System.out.println(str);
			/* 또는
			 * 	if (var%5==0 || var%7==0) {
		     	    System.out.println(var);
	        	}else {
			        System.out.println("error!");
	        	}
		     */
		scn.close();
	}
}
