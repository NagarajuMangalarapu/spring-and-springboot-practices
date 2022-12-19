package dsTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TreeTopView {
	public class Node
	{
		int data;
		Node left;
		Node right;
		public int height;
		
	}
	
	public void topview(Node node)
	{
		if(node == null)
		return;
		TreeMap<Integer,Integer>  t = new TreeMap<Integer,Integer>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty())
		{
			Node temp = q.remove();
			int hd = temp.height;
			if(t.get(hd) == null)
				{
				t.put(hd,temp.data);
				
				};
			if(temp.left!=null)
			{
			  temp.left.height = hd-1;
			  q.add(temp.left);
			}
			
			if(temp.right!=null)
			{
			  temp.right.height = hd+1;
			  q.add(temp.right);
			}
		}
		
		System.out.println(t.values());
		
		
	}
	
	public void bottomview(Node node)
	{
		if(node == null)
		return;
		TreeMap<Integer,Integer>  t = new TreeMap<Integer,Integer>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);                                                        
		while(!q.isEmpty())
		{
			Node temp = q.remove();
			int hd = temp.height;
			
				t.put(hd,temp.data);
				
			
			if(temp.left!=null)
			{
			  temp.left.height = hd-1;
			  q.add(temp.left);
			}
			
			if(temp.right!=null)
			{
			  temp.right.height = hd+1;
			  q.add(temp.right);
			}
		}
		
		System.out.println(t.values());
		
		
	}
	public Node createNode(int value)
		{   Node newNode = new Node();
		    newNode.data = value;
		    newNode.left = null;
		    newNode.right = null;
			return newNode;
		}
	

	public static void main(String[] args) {
		TreeTopView l = new TreeTopView();
		
		Node root = l.createNode(1);
		root.left=l.createNode(2);
		root.left.left = l.createNode(4);
		root.left.right = l.createNode(5);
		root.right = l.createNode(3);
		root.right.left =l.createNode(8);
		root.left.right.right = l.createNode(7);
		root.left.right.left = l.createNode(6);
	l.topview(root);
	l.bottomview(root);
	}

}
