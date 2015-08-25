package br.org.exercicio06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z, w;
		
		System.out.print("Digite seu salário fixo: ");
		x = s.nextDouble();
		
		System.out.print("Agora, digite o valor das vendas: ");
		y = s.nextDouble();
		
		z = (y * 0.04);
		w = (x + z);
		
		System.out.print("Sua comissão foi de: "+z+" reais, e seu salário é: "+w+" reais.");
	}
}
