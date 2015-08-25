 package Exercício8;

import java.util.Scanner;

public class Exercício8 {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	double n;
	double r;
	
	System.out.println("Peso em quilos: ");
	n = s.nextDouble();
	
	r = n * Math.pow(10,3);
	
	System.out.println ("Peso em gramas: "+r);

	}
}
