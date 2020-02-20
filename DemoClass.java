package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DemoClass {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/practice";
		String uname="root";
		String pass="root";
		String query="select username from employe1 where username='dileep'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("username");
	}

}
