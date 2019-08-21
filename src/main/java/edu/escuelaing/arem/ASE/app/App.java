package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Esta aplicacion permite calcular la media y desviacion estandar de los datos ingresados en un archivo de texto
 *
 */
public class App {
	public static void main(String[] args) throws NumberFormatException, IOException
    {
		LinkedList a = new LinkedList();
		LinkedList b = new LinkedList();
    	BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
        	Integer val = Integer.parseInt(str);
			a.addAtHead(val);
			b.addAtHead(val);
		}
		double media = calcMedia(a);
		double desviacion = calcDesv(b,media);
		System.out.println("La media es " + media);
		System.out.println("La desviacion es " + desviacion);
	}
	
	/**
	 * este metodo calcula la media de una lista de numeros
	 * @param lis es una LinkedList de valores
	 * @return un real con la media de la lista de valores
	 */
	public static double calcMedia(LinkedList lis){
		int suma = 0;
		int lon = lis.getLength();
		for(int i = 0; i < lon; i++){
			suma += lis.pop().getValor();
		}
		double media = suma / lon;
		return media;
	}

	/**
	 * calcula la desviacion estandar de una lista de numeros dada su media
	 * @param lis es una LinkedList de valores
	 * @param med es la media del arreglo de valores
	 * @return un real con la desviacion estandar de la lista de valores
	 */
	public static double calcDesv(LinkedList lis, double med){
		int suma = 0;
		int lon = lis.getLength();
		for(int i = 0; i < lon; i++){
			int valor = lis.pop().getValor();
			suma += Math.pow((valor - med), 2);
		}
		double desvia = Math.pow((suma / (lon - 1)), (1/2));
		return desvia;
	}
}
