package student;

import java.util.*;

public class StudentData {
 List<Student> list = new ArrayList<Student>();
 String jDap[] = null;
 List<String> hList = null;

 public StudentData() {

 }

 public StudentData(String[] jdap, List<String> hList) {
  this.jDap = jdap;
  this.hList = hList;
 }

 
 public void dapCheck() {

  
  for (int i = 0; i < hList.size(); i++) {
   String[] hak = hList.get(i).split(",");
   int bun = Integer.parseInt(hak[0]);// 번호
   String name = hak[1]; // 이름
   // 채점 시작 수식
   int tot = 0;
   for (int x = 0; x < jDap.length; x++) {
    if (jDap[x].equals(hak[x + 2])) {
     tot += 5;
     System.out.print("O  ");
    } else {
     System.out.print("X  ");
    }

   }
   System.out.print(tot + "\n");
   list.add(new Student(bun, name, tot));
  }
 }
 // 정답 {1,3,2,4,5,1,2,3,5,2,3,5,3,2,5,1,5,4,3,4};
 // Student 객체 출력
 public void studentPrint() {
  System.out.println("   ** Student **");
  System.out.println("번호\t이름\t점수");
  for (int i = 0; i < list.size(); i++) {
   System.out.print(list.get(i).bun + "\t");
   System.out.print(list.get(i).name + "\t");
   System.out.print(list.get(i).score + "\t");
   System.out.println();

  }
 }

}