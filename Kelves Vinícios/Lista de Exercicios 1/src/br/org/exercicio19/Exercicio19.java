package br.org.exercicio19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z, m;
		
		System.out.print("Digite a largura do c�modo: ");
		x = s.nextDouble();
		
		System.out.print("Agora, digite o comprimento do c�modo: ");
		y = s.nextDouble();
		
		z = x * y;
		m = z*18;
		
		System.out.print("A �rea a ser iluminada � de: "+z+" m� e ser� necessario utilizar "+m+" W de pot�ncia de ilumina��o.");
		

	}

}
