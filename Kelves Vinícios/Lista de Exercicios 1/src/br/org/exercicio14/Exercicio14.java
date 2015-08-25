package br.org.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z, w, a, b;
		
		System.out.print("Escreva seu ano de nascimento: ");
		x = s.nextDouble();
		
		System.out.print("Agora, digite o ano atual: ");
		y = s.nextDouble();
		
		z = y - x;
		w = z * 12;
		a = z * 365;
		b = z * 54;
		
		System.out.print("Sua idade é: "+z+" anos, ou "+w+" meses, ou "+b+" semanas, ou "+a+" dias.");

	}

}
