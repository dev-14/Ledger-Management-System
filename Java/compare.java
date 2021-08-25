import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class compare {
public int c(String un,String m)
//public static void main(String args[])
{
	Connection con=null;
	Statement statement=null;
	ResultSet result=null,result1 = null;
	String ans[] = new String[10];
	String uans[] = new String[10];
	//String un = "abc";
	//String m = "abc";
	String str,em;
	int marks = 0;
	int i =0;
	try
	{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		con=DriverManager.getConnection("jdbc:ucanaccess://D:\\MINI PROJECT\\Java\\database\\questions.accdb");
		statement=con.createStatement();			
		result1 = statement.executeQuery("Select * from Sheet1");
		//System.out.println("Executed 1");
		while(result1.next())
		{
			ans[i] = result1.getString("answer");			
			//System.out.println(ans[i]);
			i++;
		}
		result = statement.executeQuery("Select * from answers");
		//System.out.println("Executed 2");		
		while(result.next())
		{
			str = result.getString("User_Name");
			em = result.getString("Email_ID");			
			if(str.equals(un)&& em.equals(m))
			{
			uans[0] = result.getString("Q1");
			uans[1] = result.getString("Q2");
			uans[2] = result.getString("Q3");
			uans[3] = result.getString("Q4");
			uans[4] = result.getString("Q5");
			uans[5] = result.getString("Q6");
			uans[6] = result.getString("Q7");
			uans[7] = result.getString("Q8");
			uans[8] = result.getString("Q9");
			uans[9] = result.getString("Q10");
							
		}
		}
	    for(int j = 0;j<=9;j++)
	    {
	    	if(ans[j].equals(uans[j]))
	    		marks++;
	    }
	    System.out.println(marks);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return marks;
}

}
