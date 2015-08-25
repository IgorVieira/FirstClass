package br.org.exercicio19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z, m;
		
		System.out.print("Digite a largura do cômodo: ");
		x = s.nextDouble();
		
		System.out.print("Agora, digite o comprimento do cômodo: ");
		y = s.nextDouble();
		
		z = x * y;
		m = z*18;
		
		System.out.print("A área a ser iluminada é de: "+z+" m² e será necessario utilizar "+m+" W de potência de iluminação.");
		

	}

}
