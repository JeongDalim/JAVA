package oracletest;

import java.sql.*;

public class OracleSQL_01 {
	public static void main(String[] args) {
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // 사용자계정
		String myPass = "tiger"; // 사용자비번

		Connection myConn = null; // 커넥션 정보
		Statement stmt = null; // sql문 정보 저장,일회성
		String sql = "";

		try {
			// 드라이버 로딩
			Class.forName(myDriver);
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			sql = "insert into dept values(90,'홍길동','서울')";
			stmt = myConn.createStatement();
			int row = stmt.executeUpdate(sql); // executeUpdate()의 리턴타입은 1 또는 0 이다
			if (row != 0) {
				System.out.println("정상 등록되었습니다.");
			}
		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e.getStackTrace());
		} finally {
			try {
				stmt.close();
				myConn.close();
			} catch (Exception e) {
				System.out.println("시스템을 종료합니다.");
			}
		}
	}
}
