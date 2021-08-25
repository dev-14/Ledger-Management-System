import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class saveans 
{
 public int jkl(String a,String b,char ch[])
 {   int mark = 0;
	 String n1=a;
	 String n2=b;
	  Connection con=null;
		Statement statement=null;
		ResultSet result=null;
		//System.out.println(ans+" "+i);
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			//System.out.println("Driver Connected");
			con=DriverManager.getConnection("jdbc:ucanaccess://D:\\MINI PROJECT\\Java\\database\\questions.accdb");
			//System.out.println("Database Connected");
			statement=con.createStatement();
			//System.out.println("Statement Connected");
			statement.executeUpdate("insert into answers(User_Name,Email_ID,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10) values('"+a+"','"+b+"','"+ch[0]+"','"+ch[1]+"','"+ch[2]+"','"+ch[3]+"','"+ch[4]+"','"+ch[5]+"','"+ch[6]+"','"+ch[7]+"','"+ch[8]+"','"+ch[9]+"')");
			//System.out.println("Update Connected");
			compare com=new compare();
			mark=com.c(n1,n2);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return mark;	
 }
}

