package edu.escuelaing.arem.ASE.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList a = new LinkedList();
    	a.addAtHead(9);
    	a.addAtHead(8);
    	a.addAtHead(7);
    	System.out.println(a.pop().getValor());
    	System.out.println(a.pop().getValor());
    	System.out.println(a.pop().getValor());
    }
}
