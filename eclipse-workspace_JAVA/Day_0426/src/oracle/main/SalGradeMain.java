package oracle.main;

import oracle.dao.SalGradeDAO;

public class SalGradeMain {
	public static void main(String[] args) throws Exception {
		SalGradeDAO salgrade = new SalGradeDAO();
		System.out.println("GRADE\tLOSAL\tHISAL");
		salgrade.SalGradelist();
	}
}
