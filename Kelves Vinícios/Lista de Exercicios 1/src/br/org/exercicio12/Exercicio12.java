package br.org.exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("Digite o valor do salário mínimo: ");
		x = s.nextDouble();
		
		System.out.print("Entre com o valor do seu salário: ");
		y = s.nextDouble();
		
		z = y/x;
		
		System.out.print("Você recebe "+z+" salários mínimos.");
		

	}

}
