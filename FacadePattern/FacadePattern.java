package FacadePattern;
import java.sql.Connection;


//CLASS MY SQL HELPER
interface MySqlHelper
{
	public static Connection getMySqlDBConnection()
	{
		//get MySql DB connection using connection parameters
		return null;
	}
	
	void generateMySqlPDFReport(String tableName, Connection con);
	
	void generateMySqlHTMLReport(String tableName, Connection con);
}

public class FacadePattern
{
	//MAIN METHOD
	public static void main(String[] args) 
	{
	

	}
}
