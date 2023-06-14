import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class StudentRegisForm
{
	public static void main(String args[])
	{
		JFrame f= new JFrame("STUDENT REGISRATION FORM");
		JLabel l= new JLabel("NAME");
		JButton b1= new JButton("Clear");
		JButton b2 = new JButton("Submit");
		JLabel l1= new JLabel("DateOfBirth");
		JLabel l3= new JLabel("language");
		JLabel l4= new JLabel("categeroy");
		JRadioButton mal= new JRadioButton("Male");
		JRadioButton femal=new JRadioButton("Female");
		JCheckBox tel = new JCheckBox("Telugu");
		JCheckBox eng = new JCheckBox("English");
		JLabel l2= new JLabel("ADDRESS");
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField(); 	
		//JComboBox c=new JComboBox(s);
		
		
		JPanel p= new JPanel(new GridLayout(7,2));
		 p.add(l);
		 p.add(t1);
		 p.add(l1);
		 p.add(t2);
		 p.add(l4);
		 JPanel sp1 =new JPanel(new GridLayout(1,1));
		 sp1.add(mal);
		 sp1.add(femal);
		 p.add(sp1);
		 //p.add(c);
		 p.add(l3);
		 JPanel sp2=new JPanel(new GridLayout(1,1));
		 sp2.add(tel);
		 sp2.add(eng);
		 p.add(sp2);
		 
		 p.add(l2);
		 p.add(t3);
		 p.add(b1);
		 p.add(b2);
		 ButtonGroup b=new ButtonGroup();
		 b.add(mal);
		 b.add(femal);
		
		 f.add(p);
		 f.setSize(500,500);
		 f.setLayout(new GridLayout(2,2));
		 f.setVisible(true);
		 
		 //f.setDefaultCloseOpertation(f.EXIT_ON_CLOSE);
	}
}

		
		 		
