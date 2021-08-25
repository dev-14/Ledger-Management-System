import java.sql.*;
public class question_display {
public static void d()
{
	
	Connection con=null;
	Statement statement=null;
	ResultSet result=null;
	try
	{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		con=DriverManager.getConnection("jdbc:ucanaccess://D:\\MINI PROJECT\\Java\\database\\questions.accdb");
		statement=con.createStatement();
		result=statement.executeQuery("SELECT * FROM Sheet1");
		while(result.next())
		{
			System.out.println(result.getString("Q_N")+"\t"+result.getString("Q")+result.getString("O1")+"\t"+result.getString("O2")+"\t"+result.getString("O3")+"\t"+result.getString("O4"));
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
