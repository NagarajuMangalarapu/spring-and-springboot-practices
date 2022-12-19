package dsTest;



	class StackLL
	{
	    private static class Node
	   {
	    int data;
	    Node next;
	   
	   public Node(int data)
	     {
	       this.data = data;
	       next = null;
	     }
	   }
	   static class Stack
	   {
	        public static Node head = null;
	   public static void push(int data)
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
	   public static boolean isEmpty()
	   {
	       return head == null ;
	   }
	   
	   public static int pop()
	   {
	       if(isEmpty())
	       {
	           return -1;
	       }
	       Node top = head;
	       head = head.next;
	       return top.data;
	   }
	   public static int peek()
	   {
	       if(isEmpty())
	       {
	           return -1;
	       }
	       Node top = head;
	       return top.data;
	   }
	   }
	   
	   public static void main(String [] args)
	   {
	       Stack s = new Stack();
	       s.push(15);
	       s.push(9);
	       s.push(47);
	              while(!s.isEmpty()) {
	            System.out.println(s.peek());
	            s.pop();
	        }
	      // System.out.println(s.pop());
	   }
	}
