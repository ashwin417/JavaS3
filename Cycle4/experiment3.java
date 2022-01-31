import java.util.*;
public class experiment3
{
	public static void main(String[] args)
	{
		garbagedetails g = new garbagedetails();
		g.read();
		g.display();
		g = null;
		System.gc();
		
	}
	
	
}

class garbagedetails
{
	String name, Address;
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Name : ");
		name = sc.nextLine();
		System.out.print("Enter The Address : ");
		Address = sc.nextLine();
	}
	void display()
	{
		System.out.println("Name : " + name + "\nAddress : "+ Address);

	}
	protected void finalize() throws Throwable
	{
		System.out.println("Object is garbage collected");
	}
	
}
