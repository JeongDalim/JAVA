package oracle.sql;

public class OracleExam_02 {

	public static void main(String[] args) throws Exception {
		OracleSQL os = new OracleSQL();
		os.makeConn();
		os.deptSelect();
	}
}