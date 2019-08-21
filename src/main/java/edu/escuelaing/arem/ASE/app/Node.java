package edu.escuelaing.arem.ASE.app;

/**
 * Esta clase implementa cada nodo de una linked list
 *
 */

public class Node
{
	private Node next;
	private int valor;
	
	public Node(int val)
	{
		valor = val;
	}
	
	/**
	 * devuelve el valor contenido en el nodo
	 * @return un entero con el valor del nodo
	 */
	public int getValor()
	{
		return valor;
	}
	
	/**
	 * asigna como siguiente a un nodo
	 * @param un nodo
	 */
	public void setNext(Node n) {
		next = n;
	}
	
	/**
	 * obtiene el siguiente nodo de la lista
	 * @return un nodo
	 */
	public Node getNext() {
		return next;
	}
}