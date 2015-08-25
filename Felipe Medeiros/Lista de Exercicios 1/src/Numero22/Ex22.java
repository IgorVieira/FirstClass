package Numero22;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double n, r;

		System.out.println("Digite o número de lados do polígono:");
		n = s.nextDouble();
		
		r = n * (n - 3) / 2;
	
		System.out.println("O número de diagonais do polígono é igual à:"+r);
				
	
	}
}
