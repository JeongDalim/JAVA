package oracle.sql;

public class OracleExam_01 {

	public static void main(String[] args) throws Exception {
		OracleSQL os = new OracleSQL();
		os.makeConn();
		int row = os.deptInsert();
		if (row != 0) {
			System.out.println("��ϼ���");
		} else {
			System.out.println("��Ͻ���");
		}
		os.takeDown();
	}

}