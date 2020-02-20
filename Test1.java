package jdbcpractice;
import java.sql.*;
public class Test1 {
	public static void main(String[] args)throws SQLException {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			System.out.println("connected");
			PreparedStatement ps= con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, 10);
			ps.setFloat(2, 234556);
			ps.setString(3,"Thilaka");
			ps.setInt(4, 43);
			ps.executeUpdate();
			ps.close();  
			ps=con.prepareStatement("select* from employee"); 
			 ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("eno"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getFloat("ksal"));
			}
			}
		catch( ClassNotFoundException se)
		{
			System.out.println(se);
		}
		finally
		{
			con.setAutocommit();
		}
		}
	}
