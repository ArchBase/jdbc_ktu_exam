import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class CreateTable {
	// JDBC driver name and database URL
	static final String DB = "jdbc:mysql://localhost:3306/lab";
	
	// 1. Database User name & Password
	static final String USER = "root";
	static final String PWD = "root";
	
	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;
		try {
			// 2. Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// 3. Open a connection
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB, USER,PWD);
			
			// 4. Execute a query
			System.out.println("Creating Table..");
			statement = con.createStatement();
			
			String sql = "create table user (roll_number int, first_name varchar(50), last_name varchar(50), age int)";
			
			int i = statement.executeUpdate(sql);
			System.out.println("Table Created, rows effected="+i);
            statement.close();
            con.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Ending Program..");
	}
}