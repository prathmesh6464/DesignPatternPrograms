package FacadePattern;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//INTERFACE MY SQL HELPER
interface MySqlHelper
{
	void getMySqlDbConnection() throws Exception;
}


//INTERFACE ORACLE HELPER

interface OracleHelper 
{
	void getOracleDbConnection() throws Exception;
}


//CLASS CONNECTION DATABASE ACTS AS A FACADE
class ConnectionDatabase implements MySqlHelper,OracleHelper
{
	public void getMySqlDbConnection() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306//FacadePatternDataBase";
		String userName = "root";
		String password = "";
		String query = "select * from Student";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connectionWithMysql = DriverManager.getConnection(url, userName, password);
		java.sql.Statement statement = connectionWithMysql.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		while(resultSet.next())
		{
			int studentRollNumber = resultSet.getInt(1);
			String studentName = resultSet.getString(2);
			System.out.println(studentName);
			System.out.println(studentRollNumber);
		}		
	}

	public void getOracleDbConnection() throws Exception
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "admin";
		String query = "select * from customers";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connectionWithOracle = DriverManager.getConnection(url, userName, password);
		Statement statement = connectionWithOracle.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		while(resultSet.next())
		{
			int customerID = resultSet.getInt("customer_id");
			String customerName = resultSet.getString("customer_name");
			String customerCity = resultSet.getString("city");
			System.out.println("Cutomer id : "+customerID);
			System.out.println("Cutomer name : "+customerName);
			System.out.println("Cutomer city : "+customerCity);				
		}	
		connectionWithOracle.close();
	}
}


//CLASS FACADE PATTERN
public class FacadePattern
{
	//MAIN METHOD
	public static void main(String[] args) throws Exception
	{
		ConnectionDatabase connectionDatabaseObject =  new ConnectionDatabase();
		connectionDatabaseObject.getMySqlDbConnection();
		connectionDatabaseObject.getOracleDbConnection();
	}
}
