package dsTest;

public class LL {
	
Node head;
private int size;
	public LL()
	{
	this.size=0;
	}
	
	public class Node
	{
		String data;
		Node next;
	public Node(String data)
	{
		this.data = data;
		this.next = null;
		size++;
	}
	}
   
	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
				
	}
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
			
		}
		Node curNode = head;
		while(curNode.next!=null)
		{
			curNode = curNode.next;
			
		}
		curNode.next = newNode;
	//	Node lastNode = head.next;
		//while(last)
		
	}
	 public String middleElement()
	    {
	        Node fastpt = head;
	        Node slowpt = head;
	        while(fastpt!=null && fastpt.next != null)
	        {
	            fastpt = fastpt.next.next;
	            slowpt = slowpt.next;
	        }
	        return slowpt.data;
	    }
	 
	public void printList()
	{
		if(head == null)
		{
			System.out.println("list is empty");
			return;
		}
		Node currNode = head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+"-->");
			currNode=currNode.next;
		}
		System.out.println("null");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL ll = new LL();
		//ll.addFirst("3");
		ll.addFirst("4");
		ll.addFirst("6");
		ll.addFirst("jai");
		ll.addLast("Hey");
		ll.addLast("Nag");
		
		ll.printList();
		System.out.println(ll.middleElement());

	}

}
