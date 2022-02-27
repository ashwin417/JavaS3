import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Student extends JFrame implements ActionListener
{
	JTextField tname = new JTextField();
	JTextField tage = new JTextField() ; 
	JTextField tplace = new JTextField() ;
	JTextField troll = new JTextField();
	JButton but;
	
	Student()
	{
		
		
	}
	
	void makingfield()
	{
		Student s = new Student();
		JFrame frame = new JFrame("Student Details");
		setLayout(new BorderLayout());
		JPanel p = new JPanel();
		JLabel ltitle = new JLabel("STUDENT DETAILS");
		
		
		JLabel askroll = new JLabel("Enter the Roll No of Student: ");
		troll.setBounds(210, 45, 270, 40);
		troll.setFont(new Font("Arial", Font.BOLD, 20));
		troll.setEditable(true);
		frame.add(troll);
		
		but= new JButton("Submit");
		but.setBounds(400,90,100,25);
		frame.add(but);
		
		but.addActionListener(s);
		
		JLabel ln = new JLabel("  Name");
		tname.setBounds(100, 150, 270, 40);
		tname.setFont(new Font("Arial", Font.BOLD, 20));
		tname.setEditable(false);
		frame.add(tname);
		
		JLabel la = new JLabel("  Age");
		tage.setBounds(100, 270, 270, 40);
		tage.setFont(new Font("Arial", Font.BOLD, 20));
		tage.setEditable(false);
		frame.add(tage);
		
		JLabel lc = new JLabel("  City : ");
		tplace.setBounds(100, 390, 270, 40);
		tplace.setFont(new Font("Arial", Font.BOLD, 20));
		tplace.setEditable(false);
		frame.add(tplace);
		
		frame.add(ltitle);
		p.add(askroll);
		p.add(ln);
		p.add(la);
		p.add(lc);
		frame.add(p);
		p.setLayout(new GridLayout(4,2));
		frame.setSize(500,500);
		//setVisible(true);
		frame.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		int r=Integer.parseInt(troll.getText());
		databasefn(r);
	}
	
	
	
	void databasefn(int rollnumber)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false","root","ashu");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from studentdetails where No ="+rollnumber);
			while(rs.next())
			{
					tage.setText(Integer.toString(rs.getInt(3)));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		Student s = new Student();
		s.makingfield();
	}
}
