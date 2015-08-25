package br.org.exercicio03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("Digite um número: ");
		x = s.nextDouble();
		
		System.out.print("Digite um segundo número, diferente de zero: ");
		y = s.nextDouble();
		
		z = x/y;
		
		System.out.print("O resultado da divisão é: "+z+".");
	}
}
