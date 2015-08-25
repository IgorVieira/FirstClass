package br.org.exercicio01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("Digite um número: ");
		x = s.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		y = s.nextDouble();
		
		z = x - y;
				
		System.out.print("A subtração dos números é: "+z+".");		
	}
}
