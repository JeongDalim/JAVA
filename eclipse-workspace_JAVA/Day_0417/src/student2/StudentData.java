package student2;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
   private String[] m_strAnswerArray = null;
   private List<Student> m_sList = null;
   
   public StudentData(){
      this.m_sList = new ArrayList<Student>();
   }
   
   public StudentData(String[] strAnswerArray) {
      this.m_sList = new ArrayList<Student>();
      this.m_strAnswerArray = strAnswerArray;
   }

   public void calScore(List<String> sAnswerList) {
      int i = 0;
      int j = 0;
      int nScore = 0;
      double[] dPercentArray = new double[20];
      String[] strTempArray = null;
      Student sTemp = null;
      
      
      for(i = 0 ; i < sAnswerList.size() ; ++i) {
         nScore = 0;
         
         strTempArray = sAnswerList.get(i).split(",");
         
         System.out.print(strTempArray[0] + " ");
         System.out.print(strTempArray[1] + "\t");
         
         for(j = 0 ; j < this.m_strAnswerArray.length ; ++j) {
            if(this.m_strAnswerArray[j].equals(strTempArray[j + 2])) {
               ++dPercentArray[j];
               nScore = nScore + 5;
               System.out.print("O\t");
            } else {
               System.out.print("X\t");
            }
         }
         System.out.println(nScore);
         
         sTemp = new Student(Integer.parseInt(strTempArray[0]), strTempArray[1], nScore);
         this.m_sList.add(sTemp);
      }
      
      for(i = 0 ; i < dPercentArray.length ; ++i) {
         dPercentArray[i] = (dPercentArray[i] / sAnswerList.size()) * 100;
      }
      
      System.out.print("\t");
      
      for(i = 0 ; i < dPercentArray.length ; ++i) {
         System.out.print(dPercentArray[i] + "%\t");
      }
      System.out.println();
   }
}