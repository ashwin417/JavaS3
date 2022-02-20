import java.util.*;

class exp1
{
	class Node
	{
		int info;
		Node prev, next;
		public Node(int info)
		{
			this.info = info;
		}
	}
	Node head=null, tail = null;
	void InsertFirst(int item)
	{
		Node p = new Node(item);
		p.info = item;
		p.prev = null;
		p.next = head;
		if(head==null)
			head=tail=p;
		else
			head.prev = p;
			head = p;
	}
	void InsertBefore(int item, int item1)
	{
		Node curr = head;
		Node p ;
		p= new Node(item);
		while(curr!=null && curr.info!=item1)
			curr = curr.next;
		if(curr == null)
			System.out.print("Element not present");
		else{
			p.info = item;
			p.next = curr;
			p.prev = curr.prev;
			if(curr == null)
			{
				head=p;
			}
			else
			{
				curr.prev.next = p;
			}
			curr.prev =p;
		}
		
	}
	
	void InsertAfter(int item, int item1)
	{
		Node curr = head;
		Node p = new Node(item);
		while(curr!=null && curr.info!=item1)
			{curr = curr.next;}
		if(curr == null)
			System.out.print("Element not present");
		else{
			p.info = item;
			p.prev = curr;
			p.next = curr.next;
			if(curr.next == null)
			{
				tail = p;
			}
			else{
				curr.next.prev = p;
			}
			curr.next = p;
		}
	}
	public void Delete(int item)
	{
		Node curr = head;
		while(curr!=null && curr.info != item)
		{
			curr = curr.next;
		}
		if(curr == null)
			System.out.print("No element");
		else 
		{
			
			if(curr == head)
			{
				head = curr.next;
			}
			else
			{
				curr.prev.next=curr.next;
			}
			if(curr == tail)
			{
				tail = curr.prev;
			}
			else
			{
				curr.next.prev=curr.prev;
			}
			System.out.print("List after Deletion is : ");
			Display();
		}
		
	}
	
	public void Display()
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.print(curr.info);
			curr=curr.next;
			if(curr!=null)
			{
				System.out.print("->");
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		int ch,item,item1,o;
		exp1 e = new exp1();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("\nOptions are : \n1. Insert \n2. Display \n3. Delete\n4.Exit\n Enter your Option : ");
			ch = sc.nextInt();
			switch(ch){
				case 1:
				{
					System.out.print("Enter the item to be inserted : ");
					item = sc.nextInt();
					System.out.print("\n 1.At Beginning \t 2.Before Any Element \t 3.After any Element\nEnter your Choice : ");
					o = sc.nextInt();
					switch(o)
					{
						
						case 1: e.InsertFirst(item);
								break;
						case 2: System.out.print("\n Enter the Before Element : ");
								item1 = sc.nextInt();
								e.InsertBefore(item,item1);
								break;
						case 3:	System.out.print("\n Enter the After Element : ");
								item1 = sc.nextInt();
								e.InsertAfter(item,item1);
								break;
					}
				} break;
						case 2: e.Display(); break;
						
						case 3:
							System.out.print("Enter the element to be deleted : ");
							item = sc.nextInt();
							e.Delete(item);
							break;
						case 4: break;
						default : System.out.print("Wrong option"); break;
			}
		}while(ch!=4);
	}

}
