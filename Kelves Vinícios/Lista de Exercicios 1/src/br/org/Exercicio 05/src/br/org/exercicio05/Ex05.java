package br.org.exercicio05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Digite o pre�o do produto a receber o desconto: ");
		x = s.nextDouble();
		
		y = x*0.9;
		
		System.out.print("O pre�o com desconto �: "+y+" reais.");
	}
}
