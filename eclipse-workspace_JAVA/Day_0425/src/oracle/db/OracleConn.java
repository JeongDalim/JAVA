package oracle.db;

import java.sql.*;

public abstract class OracleConn {
	private String myDriver = "oracle.jdbc.driver.OracleDriver";
	private String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String myID = "scott"; // 사용자계정
	private String myPass = "tiger"; // 사용자비번

	protected Connection myConn = null;
	Statement stmt = null;

	public OracleConn() {

	}

	public void makeConn() throws Exception {
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL, myID, myPass);
		System.out.println("연결 성공");
	}

	public abstract void cleanUp() throws Exception;

	public void takeDown() throws Exception {
		cleanUp();
		myConn.close();
	}
	
}