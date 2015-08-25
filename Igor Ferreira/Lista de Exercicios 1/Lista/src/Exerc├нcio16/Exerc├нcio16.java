package Exercício16;

import java.util.Scanner;

public class Exercício16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a;
		double b;
		double r;
		double r2;
		
		System.out.println("Cateto 1: ");
		a = s.nextDouble();
		
		System.out.println("Cateto 2: ");
		b = s.nextDouble();
		
        r = Math.pow(a,2) + Math.pow(b,2);
        r2 = Math.sqrt(r);
		
		System.out.println("Hipotenusa: "+r2);
		
	}

}
