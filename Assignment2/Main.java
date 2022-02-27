package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Main extends JFrame implements ActionListener
{
    JTextField tname = new JTextField();
    JTextField tage = new JTextField() ;
    JTextField tplace = new JTextField() ;
    JTextField troll = new JTextField();
    JButton but;



    void makingfield()  // Function to create Frame, Panel and Layout
    {

        JFrame frame = new JFrame("Student Details");
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setBackground(Color.orange);
        JLabel ltitle = new JLabel("STUDENT DETAILS");
        ltitle.setBounds(180,100,150,30);
        ltitle.setFont(new Font("Arial",Font.ITALIC,15));

        JLabel askroll = new JLabel("  Enter the Roll No of Student: ");
        troll.setBounds(210, 45, 100, 30);
        troll.setFont(new Font("Arial", Font.BOLD, 20));
        troll.setEditable(true);
        frame.add(troll);

        but= new JButton("Submit");
        but.setBounds(350,45,100,25);
        frame.add(but);

        but.addActionListener(this);

        JLabel ln = new JLabel("  Name : ");
        tname.setBounds(50, 160, 150, 30);
        tname.setFont(new Font("Arial", Font.BOLD, 20));
        tname.setEditable(false);
        frame.add(tname);

        JLabel la = new JLabel("  Age : ");
        tage.setBounds(50, 270, 150, 30);
        tage.setFont(new Font("Arial", Font.BOLD, 20));
        tage.setEditable(false);
        frame.add(tage);

        JLabel lc = new JLabel("  City : ");
        tplace.setBounds(50, 390, 150, 30);
        tplace.setFont(new Font("Arial", Font.BOLD, 20));
        tplace.setEditable(false);
        frame.add(tplace);

        frame.add(ltitle);
        p.add(askroll);
        p.add(ln);
        p.add(la);
        p.add(lc);
        frame.add(p);
        p.setLayout(new GridLayout(4,1));
        frame.setSize(500,500);

        frame.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        int r=Integer.parseInt(troll.getText());
        databasefn(r);
    }



    void databasefn(int rollnumber) //Program to connect with Database and Display contents through Window
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false","root","ashu");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from studentdetails where No ="+rollnumber);
            while(rs.next())
            {
                tname.setText(rs.getString(2));
                tage.setText(Integer.toString(rs.getInt(3)));
                tplace.setText(rs.getString(4));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }




    public static void main(String[] args)
    {
        Main s = new Main();
        s.makingfield();
    }
}
