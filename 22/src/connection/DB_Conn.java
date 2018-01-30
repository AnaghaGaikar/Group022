package connection;
import java.sql.*;
public class DB_Conn {

	public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical_consultancy","root","root");
	}catch(Exception e){System.out.println(e);}
	return con;
    }
}
