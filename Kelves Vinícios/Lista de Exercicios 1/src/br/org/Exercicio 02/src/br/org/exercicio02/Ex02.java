package br.org.exercicio02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x, y, z, m;
		
		System.out.print("Digite o primeiro n�mero: ");
		x = s.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		y = s.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		z = s.nextDouble();
		
		m = x * y * z;
		
		System.out.print("O resultado da multiplica��o �: "+m+".");
	}
}
