package br.org.exercicio18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double t, f;
		
		System.out.print("Escreva o valor da temperatura em Celsius: ");
		t = s.nextDouble();
		
		f = 1.8*t + 32;
		
		System.out.print("O valor da temperatura em Fahrenheit é: "+f+".");

	}

}
