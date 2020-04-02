package exam;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.EmployeeDAO;

public class DBTest {
	public static void main(String[] args) throws SQLException {
		EmployeeDAO employeedao = new EmployeeDAO();
		ResultSet rs = employeedao.method();
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getInt(4) + "\t");
			System.out.print(rs.getString(5) + "\t");
			System.out.print(rs.getInt(6) + "\t");
			System.out.print(rs.getInt(7) + "\t");
			System.out.println(rs.getInt(8));
		}
	}
}
