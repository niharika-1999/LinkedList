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
	 
	 public void addNode(T data)//Method to add at start 
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
	 
	 public void insertBetween(int index, T data)//Method to add in between 
	 {
		 Node<T> new_node= new Node<>(data);
		 new_node.data=data;
		 new_node.next=null;
		 
		 if(index==0)
		 {
			 addNode(data);
		 }
		 else
		 {
			 Node<T> temp = head;
			 for(int i=0;i<index-1;i++)
			 {
				 temp=temp.next;
			 }
			 new_node.next=temp.next;
			 temp.next=new_node;
		 }
			 
	 }
	 
		
	 public void display() //Printing LinkedList
	 {
		Node<T> temp = head;
	    while(temp.next!=null)
	    {
	    	System.out.print(temp.data + "->");
		    temp=temp.next;
	    }
	    System.out.println(temp.data);
	
	 }
	 
	 public void pop()//Method to delete first element
	 {
		 head=head.next;
	 }
	 
	 public void popLast()//Method to delete last element
	 {
		 int index=0;
		 Node<T> temp=head;
		 while(temp.next!=null)
		 {
			 temp=temp.next;
			 index++;
		 }
		 delete(index);
	 }
	 public void delete(int index)
	 {
		 if(index==0)
		 {
			 pop();
		 }
		 else
		 {
			Node<T> temp=head;
			Node<T> newTemp = null;
			for(int i=0;i<index-1;i++)
			{
				temp=temp.next;
			}
			newTemp=temp.next;
			temp.next=newTemp.next;
		 }
	 }
  }
	
		 
	 
  
	 
	 
	 
	
	

  
  
  
     
     
     
  
	 

	

