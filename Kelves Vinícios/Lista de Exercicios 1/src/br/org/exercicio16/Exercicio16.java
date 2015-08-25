package br.org.exercicio16;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double a, b, c, e;
		
		System.out.print("Escreva o valor do primeiro cateto: ");
		b = s.nextDouble();
		
		System.out.print("Escreva o valor do segundo cateto: ");
		c = s.nextDouble();
		
		e = Math.pow(b, 2) + Math.pow(c, 2);
		a = Math.sqrt(e);

		System.out.print("O valor da hipotenusa deste triângulo é: "+a+".");
		
	}

}
