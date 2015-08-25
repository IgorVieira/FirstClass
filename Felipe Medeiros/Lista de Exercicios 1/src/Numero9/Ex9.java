package Numero9;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double bmai, bmen, h, r;
		
		System.out.println("Digite a base maior:");
		bmai = s.nextDouble();

		System.out.println("Digite a base menor:");
		bmen = s.nextDouble();
		
		System.out.println("Digite a altura:");
		h = s.nextDouble();
		
		r = ((bmai + bmen) * h) /2;
		
		System.out.println("Area do trapézio é igual à:"+r);
	}
	
}