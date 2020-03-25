package FacadePattern;
import java.sql.Connection;


//INTERFACE MY SQL HELPER
interface MySqlHelper
{
	public static Connection getMySqlDBConnection()
	{
		return null;
	}

	void generateMySqlPDFReport(String tableName, Connection con);

	void generateMySqlHTMLReport(String tableName, Connection con);
}


//INTERFACE ORACLE HELPER

interface OracleHelper
{

	public static Connection getOracleDBConnection()
	{
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con);

	public void generateOracleHTMLReport(String tableName, Connection con);
}

public class FacadePattern
{
	//MAIN METHOD
	public static void main(String[] args) 
	{


	}
}
