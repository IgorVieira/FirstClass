package br.org.exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("Digite o valor do sal�rio m�nimo: ");
		x = s.nextDouble();
		
		System.out.print("Entre com o valor do seu sal�rio: ");
		y = s.nextDouble();
		
		z = y/x;
		
		System.out.print("Voc� recebe "+z+" sal�rios m�nimos.");
		

	}

}
