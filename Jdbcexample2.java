package jdbc;
import java.sql.*;
public class Jdbcexample2
{
public static void main(String[] args) throws Exception {
	int id=9;
	String uname="Depalli";
	String query="insert into Student values (?,?)";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
	PreparedStatement st=con.prepareStatement(query);
	st.setInt(1,id);
	st.setString(2,uname);
	int count=st.executeUpdate();
	System.out.println(count);
}
}
