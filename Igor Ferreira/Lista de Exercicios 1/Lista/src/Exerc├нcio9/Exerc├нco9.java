package Exercício9;

import java.util.Scanner;

public class Exercíco9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a1;
		double a2;
		double h;
		double at;
		
		System.out.println("Área da maior: ");
		a1 = s.nextDouble();
		
		System.out.println("Área da menor: ");
		a2 = s.nextDouble();
		
		System.out.println("Altura");
		h = s.nextDouble();
		
		at = ((a1 + a2) * h) / 2;
		
		System.out.println("Área do trapézio: "+at);
		
		
		
		
		
	}

}
