package br.org.exercicio15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z, w;
		
		System.out.print("Boa tarde, Jo�o. Digite seu sal�rio: ");
		x = s.nextDouble();
		
		System.out.print("Agora, digite o valor da sua primeira conta: ");
		y = s.nextDouble();
		
		System.out.print("Antes de finalizar, digite o valor da segunda conta: ");
		z = s.nextDouble();
		
		w = x - ((y * 1.02) + (z * 1.02));
				
		System.out.print("Jo�o, seu sal�rio ap�s o pagamento das contas � de: "+w+" reais.");

	}

}
