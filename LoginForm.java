import java.awt.*;
class LoginForm
{
	LoginForm()
	{
		
		Frame f=new Frame("LOGING FORM");
		
		Label l1=new Label("USER NAME");
		Label l2= new Label("PASSWORD");
		Button b1= new Button("forgetpassword");
		Button b2= new Button("Login");
		TextField t1= new TextField();
		TextField t2=new TextField();
		
		Panel p= new Panel(new GridLayout(3,2));
		
		
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
		
		
	}
	public static void main(String args[])
	{
		LoginForm l=new  LoginForm();
		
	}
}
		
                                                                                                                                           
