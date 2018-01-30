package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// TODO: Auto-generated Javadoc
/**
 * The Class MyConnection.
 */
public class MyConnection {
	
	/** The con. */
	private Connection con ;
	
	/**
	 * Gets the conn.
	 *
	 * @return the conn
	 */
	public Connection getConn() {
		try {
			if(con == null || con.isClosed())
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical_consultancy","root","root");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
