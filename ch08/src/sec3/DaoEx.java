package sec3;

public class DaoEx {

	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args){
		dbwork(new OracleDao());
		dbwork(new MySqlDao());
	}

	private static void dbwork(OracleDao dao) {
		System.out.println("");
	}

}
