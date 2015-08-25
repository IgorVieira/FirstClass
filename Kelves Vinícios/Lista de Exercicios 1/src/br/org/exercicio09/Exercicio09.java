package br.org.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	
	double x, y, z, w;
	
	System.out.print("Digite o valor da base maior do trapézio: ");
	x = s.nextDouble();
	
	System.out.print("Agora, insira o valor da base menor do trapézio: ");
	y = s.nextDouble();
	
	System.out.print("Por ultimo, digite o valor da altura deste polígono: ");
	z = s.nextDouble();
	
	w = ((x + y) * z)/2;
			
	System.out.print("A área deste trapézio é: "+w+" unidades de área.");
		
	}

}
