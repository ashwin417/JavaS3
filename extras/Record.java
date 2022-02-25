import java.sql.*;
class Record
{
public static void main(String[] args)
{
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Local Instance MySQL80","root","ashu");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from studentdetails");
	while(rs.next())
		System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4));
	con.close();
	}
catch(Exception e){
	System.out.println(e);}
}
}