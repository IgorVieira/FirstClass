package Exercício3;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n;
		double n2;
		double r;
		
		System.out.println("Digite um número");
		n = s.nextDouble();
		
		System.out.println("Digite um número");
		n2 = s.nextDouble();
		
		r = n / n2;
		 
		System.out.println("O resultado: "+r);
		
	}

}
