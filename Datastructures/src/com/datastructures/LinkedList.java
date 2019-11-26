package com.datastructures;

//creation of linkedlist
public class LinkedList {

	Node head;
	static class Node
	{
		int d;
		Node next;
		Node (int data)
		{
			d=data;
			next=null;
		}
	}
	
	//insert node at start
	public void push(int new_data)
	{
	    Node new_node = new Node(new_data);
	    new_node.next=head;
	    head=new_node;
	}
	
	//insert node after given node
	
	public void insertafter(Node prevnode,int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=prevnode.next;
		prevnode.next=new_node;
	}
	
	//insert at last 
	
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		
		Node last=head;
		
		while(last.next!=null)
		{
			last=last.next;
		}
		
		last.next=new_node;
		new_node.next=null;
	}
	
	//Delete node
	
	public void delete(int key)
	{
		Node temp=head;
		Node prev=null;
		if(temp.d==key)
		{
			head=temp.next;
			return;
		}
		
		while(temp.d!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		
		
		prev.next=temp.next;
		
		
	}
	
	public void printlist()
	{
		
		Node n=head;
		
		while(n!=null)
		{
			System.out.print(n.d+" ");
			n=n.next;
			
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.head=new Node(1);
		Node second =new Node(5);
		Node third = new Node(9);
		
		ll.head.next=second;
		second.next=third;
		
		ll.push(11);
		ll.insertafter(ll.head.next.next,3);
		ll.append(25);
		ll.delete(3);
		ll.printlist();
		
		
	}
	
}