package br.org.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	
	double x, y, z, w;
	
	System.out.print("Digite o valor da base maior do trap�zio: ");
	x = s.nextDouble();
	
	System.out.print("Agora, insira o valor da base menor do trap�zio: ");
	y = s.nextDouble();
	
	System.out.print("Por ultimo, digite o valor da altura deste pol�gono: ");
	z = s.nextDouble();
	
	w = ((x + y) * z)/2;
			
	System.out.print("A �rea deste trap�zio �: "+w+" unidades de �rea.");
		
	}

}
