package Exercício17;

import java.util.Scanner;

public class Exercício17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double r;
		double c;
		double a;
		double v;
		
		System.out.println("Raio da esfera: ");
		r = s.nextDouble();
		
		c = 2 * Math.PI * r;
		a = Math.PI * Math.pow(r,2);
		v = 3/4 * Math.PI * Math.pow(r,3);
		
		System.out.println("Comprimentoda esfera: "+c);
		System.out.println("Área da esfera: "+a);
		System.out.println("Volume da esfera: "+v);
	}

}
