
//���ǿ�����2
import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�����Է�= ");
		int var = scn.nextInt();

		String str = (var % 7 == 0 && var % 5 == 0) ? "" + var : "error!"; //""+�� ���ָ� �ս��� int�� String���� �ٲ� �� �ִ�.
		System.out.println(str);
			/* �Ǵ�
			 * 	if (var%5==0 || var%7==0) {
		     	    System.out.println(var);
	        	}else {
			        System.out.println("error!");
	        	}
		     */
		scn.close();
	}
}
