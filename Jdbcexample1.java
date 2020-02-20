package jdbc;
/*1.import the package--->java.sql
 * 2.load and register the driver--->com.mysql.jdbc.Driver
 * 3.create connection--->create object connection interface
 * 4.create Statement--->create object of statement interface
 * 5.execute query--->
 * 6.process the result
 * 7.close
 */
import java.sql.*;
public class Jdbcexample1 {

	public static void main(String[] args) throws Exception
	{
	Class.forName("com.mysql.jdbc.Driver");//we have to use qualified name
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from Student");
	while(rs.next())
	{
	String name=rs.getInt("id")+": "+rs.getString("uname");
	System.out.println(name);
	}
	st.close();
	con.close();
	}

}
