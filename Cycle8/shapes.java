import java.awt.*;
import java.awt.event.*;
class shapes extends Frame implements ItemListener
{
	String clr="";
	shapes()
	{
		Checkbox c1,c2,c3;
		CheckboxGroup cbg=new CheckboxGroup();
		c1=new Checkbox("Line",true,cbg);
		c2=new Checkbox("Rectangle",true,cbg);
		c3=new Checkbox("Oval",true,cbg);
		setSize(500,500);
		setTitle("Shapes");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(c1); 
		add(c2); 
		add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] args)
	{
		new shapes();
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		clr=(e.getItem()).toString();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		if(clr.equals("Line"))
		{ 
			g.setColor(Color.red);        
			g.drawLine(50,100,350,100);
			
		} 
		if(clr.equals("Rectangle"))
		{ 
			g.setColor(Color.blue);
			g.drawRect(5,40,90,55);
			
		}
		if(clr.equals("Oval"))
		{ 
			g.setColor(Color.magenta);
			g.drawOval(195,100,90,55);
		}
		
	}
}
