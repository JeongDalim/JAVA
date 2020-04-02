package oracle.db;

import java.sql.*;

public abstract class OracleConn {
	private String myDriver = "oracle.jdbc.driver.OracleDriver";
	private String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String myID = "scott"; // ����ڰ���
	private String myPass = "tiger"; // ����ں��

	protected Connection myConn = null;
	Statement stmt = null;

	public OracleConn() {

	}

	public void makeConn() throws Exception {
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL, myID, myPass);
		System.out.println("���� ����");
	}

	public abstract void cleanUp() throws Exception;

	public void takeDown() throws Exception {
		cleanUp();
		myConn.close();
	}
	
}