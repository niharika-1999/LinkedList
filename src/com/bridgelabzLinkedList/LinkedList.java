package com.bridgelabzLinkedList;

public class LinkedList<T>  //<T> is generic parameter
  {
	 public Node<T> head;
	
	 public void insert(T data) //New node is created using insert
	 {
		Node<T> new_node=new Node<>(data);
		new_node.data=data;
		new_node.next=null;
		
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node<T> temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=new_node;
		}
	 }
	 
	 public void addNode(T data)
	 {
		 Node<T> new_node= new Node<>(data);
		 new_node.data=data;
		 new_node.next=null;
			
		 if(head==null)
			{
				head=new_node;
			}
			else
			{
				Node<T> temp=head;
				head = new_node;
				new_node.next = temp;
			}
	 }
		
	 public void display() //Printing LinkedList
	 {
		Node<T> temp = head;
	    while(temp.next!=null)
	    {
	    	System.out.println(temp.data);
		    temp=temp.next;
	    }
	    System.out.println(temp.data);
	
	 }
  }
  
     

     
  
	 

	

