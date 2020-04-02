package oracle.main;

import oracle.db.DBManager;

public class DBConnectionTest {
	public static void main(String[] args)throws Exception {
		DBManager manager = DBManager.getInstance();
		manager.getConnection();
	}
}
