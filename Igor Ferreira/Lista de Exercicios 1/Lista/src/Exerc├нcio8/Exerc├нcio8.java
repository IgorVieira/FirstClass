 package Exerc�cio8;

import java.util.Scanner;

public class Exerc�cio8 {
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
