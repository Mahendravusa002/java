import javax.swing.*;
class FrameandButton
{
	public static void main(String args[])
	{
		JFrame f= new JFrame("FRAME");
		JButton b= new JButton("CLICK ME");
		f.add(b);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		b.setBounds(170,170,120,50);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}

