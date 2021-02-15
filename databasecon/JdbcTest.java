package databasecon;
import java.sql.*;



//import com.mysql.jdbc.Statement;
public class JdbcTest {

public static void main (String[] args)throws Exception {
	
	String url="jdbc:mysql://localhost:3306/test";
	String uname="root";
	String pass="root";
	String sql="select * from student";
	try{  	
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
PreparedStatement pst=con.prepareStatement(sql);

ResultSet  rs=pst.executeQuery();

while (rs.next()) {
	

String sname=rs.getString("name");
int rno=rs.getInt("sr_no");
System.out.println(rno +"<->" +sname);	
}
rs.close();
pst.close();
con.close();
	

}catch(Exception e){ System.out.println(e);}  
}
}




