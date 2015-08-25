package br.org.exercicio04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, m;
		
		System.out.print("Entre com a primeira nota: ");
		x = s.nextDouble();
		
		System.out.print("Agora, a segunda nota: ");
		y = s.nextDouble();
		
		m = ((x*2) + (y*3))/5;
		
		System.out.print("Sua média é: "+m+".");
	}
}
