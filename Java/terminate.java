import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class terminate extends Frame implements ActionListener
{
	JFrame f = new JFrame("Terminate");
	JButton jb;
	public void xyz(int marks)
	{
		f.setLayout(new BorderLayout());
		String abc=String.valueOf(marks);
		
		JPanel pi = new JPanel();
		Label l1 = new Label("Thank You..!! Your Test is Submitted");
		Label l2 = new Label("Your Marks are:");
		Label l3 = new Label(abc);
		jb = new JButton("OK");
		//pi.setSize(1920,1080);
		pi.add(l1);
		pi.add(l2);
		pi.add(l3);
		jb.setSize(200, 200);
		//jb.setBounds(960, 540, 700, 700);
		pi.add(jb);
		f.add(pi);
		f.setSize(600,300);
	    f.show();
		jb.addActionListener(this);
		//f.add(di);
	
}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==jb)		
			System.exit(0);
	}
}