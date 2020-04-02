package student;

import java.io.*;
import java.util.*;

public class StudentExam {
//데이터를 읽어들여서

 public static void main(String[] args) throws FileNotFoundException {
  Scanner scn = new Scanner(System.in); // 키보드로 입력한 정답
  // 정답 {1,3,2,4,5,1,2,3,5,2,3,5,3,2,5,1,5,4,3,4};
  Scanner scn2 = new Scanner(new File("c://text//studentcheck.txt")); // 학생들이 제출한 답
  System.out.print("정답 입력 : ");
  //String[] answer = scn.nextLine().split(","); // 정답
  String[] answer = scn.nextLine().split(" ");
  List<String> list = new ArrayList<String>();
  // list : 학생들의 정답을 모은 배열 , //answer : 정답
  while (scn2.hasNextLine()) {
   list.add(scn2.nextLine()); // 파일에서 읽어오는 정답을 while 안에서 배열로 설정함.
  

  }
  //정답 입력 테스트
  StudentData sd = new StudentData(answer,list);
  sd.dapCheck();
  sd.studentPrint();
  
  //학생답안 출력
  //for (int i = 0; i < list.size(); i++) {
  // System.out.println(list.get(i) + " ");
  //}
  scn.close();
  scn2.close();
 }
}