package automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

	public static void main(String[] args) throws SQLException {
		

	}
	
	public static void dbConnector() {
		String host = "localhost";
		String port = "3306";

		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port + "/qadbt", "root", "Jordan23@");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentials where scenario = 'dsfegwggggfef'");
		while(rs.next()) {
		System.out.println(rs.getString("username"));
		//System.out.println(rs.getString("password"));
		}
		}catch (Exception e) {
			System.out.println("Error in the connection \n"+ "jdbc:mysql://"+ host + ":" + port + "/qadbt");
			
		}
		
	}
	
	public static String dbConnector1(String BDquery, String username) throws SQLException {
		String host = "localhost";
		String port = "3306";
		String query=null;
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port + "/qadbt", "root", "Jordan23@");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(""+BDquery+"");
		while(rs.next()) {
		System.out.println(rs.getString(""+username+""));
		query=rs.getString(""+username+"");
		}
		return query;
		
	}

}
