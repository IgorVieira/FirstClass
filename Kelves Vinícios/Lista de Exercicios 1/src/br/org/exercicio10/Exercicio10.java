package br.org.exercicio10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	double x, y;
	
	System.out.print("Digite o valor do lado do quadrado: ");
	x = s.nextDouble();
	
	y = Math.pow(x, 2);
	
	System.out.print("O valor da área deste quadrado é: "+y+" u.a.");

	}

}
