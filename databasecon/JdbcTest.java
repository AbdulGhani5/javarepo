package databasecon;

import java.sql.*;


public class JdbcTest {

	
	public static void main (String[] args)throws Exception {
//this is the test change
String url="jdbc:mysql://localhost:3306/test";

String user="root";
String pass="root";
String Query="select * from student";

 Connection con=DriverManager.getConnection(url,user,pass);
 
 Statement st=con.createStatement();
 
 ResultSet rs=st.executeQuery(Query);
 
 String stu_name;
 int stu_id;
 while(rs.next()){
	 stu_name=rs.getString("name");
	 stu_id=rs.getInt("sr_no");
	 
	 System.out.println(stu_id +" <- - -> " + stu_name);
	 
	 
 }
 
 rs.close();
 st.close();
 con.close();	
	}
	}

