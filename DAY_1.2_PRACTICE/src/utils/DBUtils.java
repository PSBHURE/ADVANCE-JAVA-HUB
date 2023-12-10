package utils;
import java.sql.*;
public class DBUtils {
	private static Connection cn;
	public static Connection openConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn=DriverManager.getConnection(url, "root", "1998");
				return cn;
	}
	public  static void closeConnection() throws SQLException
	{
		if(cn!=null)
			cn.close();
	}
}
