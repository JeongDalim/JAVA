import java.io.File;
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) throws Exception {
		int cnt = 0; // 데이터 카운트하기
		int tot = 0;// 합계
		int avgcnt = 0;// 평균이상카운트
		int data = 0;// 데이터 1
		String data2;// 데이터2
		double avg;// 평균
		Scanner scn = new Scanner(new File("c://text//indata.txt.txt"));
		while (scn.hasNext()) { // 존재하면 참 존재하지않으면 거짓
			cnt++; // 카운트해주기
			data = scn.nextInt(); // 인트 변수 데이터1에 메모장에 있는 값 넣기
			tot = tot + data; // 합계 구하기
		}
		avg = (double) tot / cnt;
		if(data > avg) {
			avgcnt++;
		}
		Scanner scn1 = new Scanner(new File("c://text//indata.txt.txt")); // 다시 읽기위해
		data2 = scn1.nextLine();// 스트링 변수 data2에 메모장에 있는 값 넣기
		System.out.println("전체 data= " + data2);
		System.out.println("전체 data 수= " + cnt);
		System.out.println("전체 data 총합= " + tot);
		System.out.println("전체 data 평균= " + avg);
		System.out.println("평균이상 data= " + avgcnt);
		scn.close();
		scn1.close();
	}
}
