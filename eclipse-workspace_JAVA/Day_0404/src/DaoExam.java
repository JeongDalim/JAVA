

public class DaoExam {
	private static void doWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] arg) {
		
		DataAccessObject o = new OracleDao();
		DataAccessObject m = new MysqlDao();
		doWork(o);
		doWork(m);

		System.out.println("==================");

		DataAccessObject dao = new DataAccessObject() {

			@Override
			public void select() {
				System.out.println("Oracle DB���� �˻�");
				System.out.println("Mysql DB���� �˻�");
			}

			@Override
			public void insert() {
				System.out.println("Oracle DB���� ����");
				System.out.println("Mysql DB���� ����");
			}

			@Override
			public void update() {
				System.out.println("Oracle DB���� ����");
				System.out.println("Mysql DB���� ����");
			}

			@Override
			public void delete() {
				System.out.println("Oracle DB���� ����");
				System.out.println("Mysql DB���� ����");
			}
		};
		doWork(dao);
	}
}