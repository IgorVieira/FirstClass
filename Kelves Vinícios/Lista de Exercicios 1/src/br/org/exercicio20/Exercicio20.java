package br.org.exercicio20;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double a = 60, b, cc = 0.5, t = 30;
		
		//System.out.print("Digite o �ngulo formado pela escada e o ch�o: ");
		//a = s.nextDouble();
		
		//System.out.print("Digite a dist�ncia da base da escada ate a parede: ");
		//t = s.nextDouble();
		
		//cc = 0.5;
		
		
		cc = Math.cos(a);
		
		System.out.print(cc);
		//b = t/cc;
		
		//System.out.print("O coseno do �ngulo �: "+cc+" e o comprimento da escada �: "+b+".");

	}

}
