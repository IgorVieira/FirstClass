package Exercício15;

import java.util.Scanner;

public class Exercício15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n;
		double n2;
		double n3;
		double r;
		
		System.out.println("Salário: ");
		n = s.nextDouble();
		
		System.out.println("Valor da primeira conta: ");
		n2 = s.nextDouble();
		
		System.out.println("Valor da segunda conta: ");
		n3 = s.nextDouble();
		
		r = n - ((n2 * 0.02 + n2) +(n3 * 0.02 + n3));
		
		System.out.println("Restante do salário: "+r);
		
		
	}

}
