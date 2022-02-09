/*Program to find sum and factorial of nth number using multi threading*/

import java.util.*;
class multisum extends Thread
{
	int n;
	static int i;
	void sumn(int n)
	{
	this.n = n;
	}
	public void run()
	{
		int sum = 0;
		for(i=0;i<=this.n; i++)
			sum+=i;
		System.out.println("sum = "+sum);
	}
}
class multifact extends Thread 
{
	int n;
	static int i;
	void fact(int n)
	{
		this.n = n;
	}
	public void run()
	{
		int fact = 1;
		for(i=1;i<=this.n;i++)
			fact*=i;
		System.out.println("factorial="+fact);
	}
}

class sumofn
{
	synchronized public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		multisum m = new multisum();
		multifact f = new multifact();
		m.sumn(n);
		f.fact(n);
		m.start();
		f.start();
	}
}
