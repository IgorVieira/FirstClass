package br.org.exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("Entre com o valor da diagonal maior do losango: ");
		x = s.nextDouble();
		
		System.out.print("Agora, digite o valor da diagonal menor: ");
		y = s.nextDouble();
		
		z = (x * y)/2;
		
		System.out.print("A área desse losango é: "+z+" u.a.");

	}

}
