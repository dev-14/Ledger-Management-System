import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.*;
public class test extends Frame implements ActionListener
{
	JRadioButton r1,r2,r3,r4;
	JFrame f; int j = 2;
	ButtonGroup bg;
	char ch[]=new char[10];
	saveans sa = new saveans();
	String a,b;
 public void abc(String n1,String n2,int i)
{      
	 a = n1;
	 b = n2;
	 f = new JFrame(); 
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setLayout(new BorderLayout());
      JPanel d = new JPanel();
      JButton b;
       JLabel questn,ques,opt1,opt2,opt3,opt4;
       Connection con = null;
       Statement statement = null;
       ResultSet result = null;
       String n="";
       String q="",op1="",op2="",op3="",op4="";
       try
       {
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           con = DriverManager.getConnection("jdbc:ucanaccess://D:\\MINI PROJECT\\Java\\database\\questions.accdb");
           statement = con.createStatement();
           result = statement.executeQuery("SELECT * FROM Sheet1 where ID = "+i);
           while(result.next())
           {
        	   n = result.getString("Q_N");
               q = result.getString("Q");
        	   r1=new JRadioButton(op1 = result.getString("O1"));
        	   r2=new JRadioButton(op2 = result.getString("O2"));
               r3=new JRadioButton(op3 = result.getString("O3"));
        	   r4=new JRadioButton(op4 = result.getString("O4")); 
        	    bg=new ButtonGroup();
        	   bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);
        	   b = new JButton("Next");
             questn = new JLabel(n);
             //questn.setBounds(0, 0,1280, 200);
             ques = new JLabel(q);
             opt1 = new JLabel(op1);
             opt2 = new JLabel(op2);
             opt3 = new JLabel(op3);
             opt4 = new JLabel(op4);
             
             //questn.setSize(1600, 300);
             
             d.add(questn); d.add(ques);
             d.add(r1); //d.add(opt1);
             d.add(r2); //d.add(opt2);
             d.add(r3); //d.add(opt3);
             d.add(r4); //d.add(opt4);
             d.add(b);
             b.addActionListener(this);
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       f.add(d);
       f.show();
       f.setSize(600,300);
}

public void actionPerformed(ActionEvent e)
{
	f.hide();
	if(r1.isSelected()||r2.isSelected()||r4.isSelected()||r3.isSelected())	
	{
		if(r1.isSelected())
			ch[j-2]='A';
		if(r2.isSelected())
			ch[j-2]='B';
		if(r3.isSelected())
			ch[j-2]='C';
		if(r4.isSelected())
			ch[j-2]='D';
		j++;
	   // abc(j);
	}
	if(j==12)
	{
		f.hide();
		int marks=sa.jkl(a,b,ch);
		
		terminate ob1 = new terminate();
		ob1.xyz(marks);
	}
		else
		abc(a,b,j);
		
}
/*public static void main(String args[])
{
 test ob = new test();
 ob.abc(2);
}*/
}