package Exercicio2;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double n;
		double n2;
		double n3;
		double r;
		
		System.out.println("Digite um n�mero");
		n = s.nextDouble();
		
		System.out.println("Digite um n�mero");
		n2 = s.nextDouble();
		
		System.out.println("Digite um n�mero");
		n3 = s.nextDouble();
		
		r = n * n2 * n3;
				
		System.out.println("O resultado: "+r);
		
		
		
		
	    
		
	}
}
