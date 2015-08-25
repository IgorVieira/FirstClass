package br.org.exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("Digite seu peso atual: ");
		x = s.nextDouble();
		
		y = x*1.15;
		z = x*0.8;
		
		System.out.println("Se você engordar 15%, seu peso será: "+y+".");
		System.out.println("Se você emagrecre 20%, seu peso será: "+z+".");
		
	}
}