package edu.escuelaing.arem.ASE.app;

public class Node
{
	//Declare class variables
	private Node next;
	private Object valor;
	
	public Node(Object val)
	{
		valor = val;
	}
	
	public Object getValor()
	{
		return valor;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public Node getNext() {
		return next;
	}
}