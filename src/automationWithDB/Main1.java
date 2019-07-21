package automation;

import java.sql.SQLException;

public class Main1 {

	DataBaseConnection dbb;
	
	
	public DataBaseConnection getDbb() {
		return this.dbb;
	}
	public static void main(String[] args) throws SQLException {

		DataBaseConnection ob1 = new DataBaseConnection();
		//ob1.dbConnector1("select * from credentials where scenario = 'dssdddsfegwggggfef'; ");
		ob1.dbConnector1("select * from credentials where scenario = 'dssdddsfegwggggfef'; ", "username");
	}

}
