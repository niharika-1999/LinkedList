package com.bridgelabzLinkedList;

public class LinkedListTest {
	
	public static void main(String[] args)//Main method
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.insert(56);
		list.insert(30);
		list.insert(40);
		list.insert(70);
		list.display();
		if(list.searchLinkedList(40))
		{
			list.delete(list.key);
			list.display();
		}
		list.sizeLinkedList();
	}
}


