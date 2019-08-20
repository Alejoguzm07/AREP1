package edu.escuelaing.arem.ASE.app;

public class LinkedList {
	private int length;
	private Node head;
	
	public LinkedList() {
		length = 0;
		head = null;
	}
	
	public void addAtHead(Object val)
	{
		if(head != null) {
			Node temp = head;
			head = new Node(val);
			head.setNext(temp);
		}else {
			head = new Node(val);
		}		
		length++;
	}
	
	public void addAtTail(Object val)
	{
		if(head != null) {
			Node temp = head;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}		
			temp.setNext(new Node(val));
		}else {
			head = new Node(val);
		}
		length++;
	}
	
	public Node pop() {
		Node temp = head;
		head = head.getNext();
		return temp;
		
	}
	
	public int getLength() {
		return length;
	}
}
