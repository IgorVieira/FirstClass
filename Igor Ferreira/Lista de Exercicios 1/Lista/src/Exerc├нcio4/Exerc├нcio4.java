package Exerc�cio4;

import java.io.InputStream;
import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	double n;
	double n2;
	double m;
	
	System.out.println ("Nota 1");
	n = s.nextDouble();
	
	System.out.println("Nota 2");
	n2 = s.nextDouble();
	
	m = ((n * 2) + (n2 * 3)) / 5;
			
	System.out.println("A m�dia ponderada: "+m);	
	
}	
}
