package neel;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	public static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static String DATABASE_URL = "jdbc:mysql://172.17.174.103/neel";
	public static String USER_NAME = "root";
	public static String PASSWORD = "root";

	public static  Connection setUp(){
		Connection connection = null;
		try {
			connection = getConnection();
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*
			 * finally { connection.close(); }
			 */
		return null;
		
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS);
		Connection connection = (Connection) DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
		return connection;
	}
	public static void close(final Connection connection) throws SQLException {
		if (connection != null) {
			Connection.close(connection);
		}
	}

}