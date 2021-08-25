import java.awt.TextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class login extends Frame implements ActionListener,MouseListener
{
	TextField obj1,obj2;
	Label l1,l2;
	String str,str2;
JFrame f=new JFrame("login page");
public void panel()
{
	f.setSize(700,300);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel jp=new JPanel();
	jp.setLayout(new FlowLayout());
	 obj1=new TextField(30);
	 obj2=new TextField(30);
	 l1=new Label("Name");
	 l2=new Label("Email ID");
	 l2.setBounds(0,200,100,20);
	//obj2.setEchoChar('*');
	JButton button=new JButton("Register");
	button.setBounds(300,200,50,15);
	jp.add(l1); jp.add(obj1);
	jp.add(l2); jp.add(obj2);
	button.addActionListener(this);
	jp.add(button);
	f.add(jp);
	f.show();
//	str = obj1.getText();
//	str2 = obj2.getText();
	
}
public void actionPerformed(ActionEvent e)
{	
	 str=obj1.getText();
	 str2=obj2.getText();
	 int a=str.length();
	 int b=str2.length();
	//System.out.println("hi"+str+"n");
	//System.out.println("hij"+str2+"n");	
	/*if(a==0||b==0)
	{
		f.hide();
		panel();
	}*/
	/*else
	{		
	ob.c(str,str2);
	test ob1 = new test();
	ob1.abc(2);
}*/
	 if(a!=0 && b!=0)
		{		 
			test ob1 = new test();
			ob1.abc(str,str2,2);
		}
}
public void mouseClicked(MouseEvent e)
{
	
}
public void mousePressed(MouseEvent e)
{
	
}
public void mouseExited(MouseEvent e)
{
	
}
public void mouseEntered(MouseEvent e)
{
	
}
public void mouseReleased(MouseEvent e)
{
	
}

}
