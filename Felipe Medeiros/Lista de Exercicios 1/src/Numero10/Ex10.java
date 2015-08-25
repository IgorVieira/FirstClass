package Numero10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double l, r;
		
		System.out.println("Digite o lado:");
		l = s.nextDouble();

		r = l * l;

		System.out.println("A área do seu quadrado é igual à:"+r);
	}
	
}