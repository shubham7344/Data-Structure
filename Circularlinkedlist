package ds;

public class Circularlinkedlist
{
	 public class Node
	 {  
	        int data;  
	        Node next;  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	
	Node head=null;
	Node tail=null;
	void add(int d)
	{
		Node newnode=new Node(d);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			newnode.next=head;
		}
		else
		{
			Node temp=head;
			newnode.next=temp;
			head=newnode;
			tail.next=newnode;
		}
	}
	public void display()
	{
		  Node temp = head;
		  do {
			   System.out.print(" " + temp.data);
			   temp = temp.next;
			  }
		  while(temp != head);
	}
	
	
	

	public static void main(String[] args) 
	{
		Circularlinkedlist c=new Circularlinkedlist();
		c.add(2);
		c.add(5);
		c.add(7);
		c.add(6);
		c.display();
	}

}
