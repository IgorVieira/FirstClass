package br.org.exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Digite seu peso em kilogramas: ");
		x = s.nextDouble();
		
		y = x*1000;
		
		System.out.print("Seu peso, em gramas é: "+y+".");	

	}

}
