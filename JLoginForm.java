import javax.swing.*;
import java.lang.Exception;
import java.awt.*;
class JLoginForm
{
	JLoginForm()
	{
		
		JFrame f=new JFrame("LOGING FORM");
		
		JLabel l1=new JLabel("USER NAME");
		JLabel l2= new JLabel("PASSWORD");
		JButton b1= new JButton("forgetpassword");
		JButton b2= new JButton("Login");
		JTextField t1= new JTextField();
		JTextField t2=new JTextField();
		
		JPanel p= new JPanel(new GridLayout(3,4));
		
		
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		
		f.add(p);
		
		f.setSize(500,500);
		f.setLayout(new GridLayout(3,3));
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String args[])
	{
		JLoginForm l=new  JLoginForm();
		
	}
}
