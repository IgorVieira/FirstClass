package Exercicio1;

import java.util.Scanner;

public class Exerc�cio1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double n;
		double n2;
		double r;
		 
		System.out.println("Digite um n�mero");
		n = s.nextDouble();
		
		System.out.println("Digite um n�mero");
		n2 = s.nextDouble();
		
		r = n - n2;
		
		System.out.println("O resultado: "+r);
		
		
		
		
	}

}
