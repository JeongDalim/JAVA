package student;

import java.io.*;
import java.util.*;

public class StudentExam {
//�����͸� �о�鿩��

 public static void main(String[] args) throws FileNotFoundException {
  Scanner scn = new Scanner(System.in); // Ű����� �Է��� ����
  // ���� {1,3,2,4,5,1,2,3,5,2,3,5,3,2,5,1,5,4,3,4};
  Scanner scn2 = new Scanner(new File("c://text//studentcheck.txt")); // �л����� ������ ��
  System.out.print("���� �Է� : ");
  //String[] answer = scn.nextLine().split(","); // ����
  String[] answer = scn.nextLine().split(" ");
  List<String> list = new ArrayList<String>();
  // list : �л����� ������ ���� �迭 , //answer : ����
  while (scn2.hasNextLine()) {
   list.add(scn2.nextLine()); // ���Ͽ��� �о���� ������ while �ȿ��� �迭�� ������.
  

  }
  //���� �Է� �׽�Ʈ
  StudentData sd = new StudentData(answer,list);
  sd.dapCheck();
  sd.studentPrint();
  
  //�л���� ���
  //for (int i = 0; i < list.size(); i++) {
  // System.out.println(list.get(i) + " ");
  //}
  scn.close();
  scn2.close();
 }
}