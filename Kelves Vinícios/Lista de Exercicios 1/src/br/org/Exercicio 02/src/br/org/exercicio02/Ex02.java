package br.org.exercicio02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x, y, z, m;
		
		System.out.print("Digite o primeiro número: ");
		x = s.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		y = s.nextDouble();
		
		System.out.print("Digite o terceiro número: ");
		z = s.nextDouble();
		
		m = x * y * z;
		
		System.out.print("O resultado da multiplicação é: "+m+".");
	}
}
