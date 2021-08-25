import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.*;
public class quest
{
 public static void main(String args[])
{
      String colna[] = {"Question NO","question","option1","option2","option3","option4"};
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setLayout(new BorderLayout());
      DefaultTableModel model = new DefaultTableModel();
      model.setColumnIdentifiers(colna);
      JTable table = new JTable();
      table.setModel(model);
      table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
      table.setFillsViewportHeight(true);
      JScrollPane scroll = new JScrollPane(table);
      JRadioButton r1=new JRadioButton();
      JRadioButton r2=new JRadioButton();
      JRadioButton r3=new JRadioButton();
      JRadioButton r4=new JRadioButton();
      scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
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
           result = statement.executeQuery("SELECT * FROM Sheet1");
           while(result.next())
           {
             n = result.getString("Q_N");
             q = result.getString("Q");
             op1 = result.getString("O1");
             op2 = result.getString("O2");
             op3 = result.getString("O3");
             op4 = result.getString("O4");
             model.addRow(new Object[] {n,q,op1,op2,op3,op4});              
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       f.add(scroll);
       f.setVisible(true);
       f.setSize(1920,1080);
}
}