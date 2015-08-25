package br.org.exercicio17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double r, c, v, a;
		
		System.out.print("Digite o raio para os calculos: ");
		r = s.nextDouble();
		
		c = 2*Math.PI*r;
		a = Math.PI * Math.pow(r , 2);
		v = 4 / 3 * Math.pow(r , 3) * Math.PI;
		
		System.out.print("O cumprimento dessa circunferência é: "+c+", a área desse circulo é: "+a+" e seu volume é "+v+".");
		
	}

}
