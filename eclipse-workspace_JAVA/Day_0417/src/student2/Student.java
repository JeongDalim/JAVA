package student2;

public class Student {
   private int m_nNumber;
   private int m_nScore;
   private String m_strName;
   
   public Student() {
      
   }
   
   public Student(int nNumber, String strName, int nScore) {
      this.m_nNumber = nNumber;
      this.m_strName = strName;
      this.m_nScore = nScore;
   }

   public int getM_nNumber() {
      return m_nNumber;
   }

   public void setM_nNumber(int nNumber) {
      this.m_nNumber = nNumber;
   }

   public int getM_nScore() {
      return m_nScore;
   }

   public void setM_nScore(int nScore) {
      this.m_nScore = nScore;
   }

   public String getM_strName() {
      return m_strName;
   }

   public void setM_strName(String strName) {
      this.m_strName = strName;
   }
}