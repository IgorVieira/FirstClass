package Exercício9;

import java.util.Scanner;

public class Exercício9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int b1;
		int b2;
		int al;
		@SuppressWarnings("unused")
		int n;
		int r;
		
		System.out.print("Base maior:");
		b1 = s.nextInt();
		
		System.out.print("Base menor:");
		b2 = s.nextInt();
		
		System.out.print("altura:");
		al = s.nextInt();
		
		System.out.print("Divisor:");
		n = s.nextInt();
		
		r = b1 + b2 * al / 2;
		
		System.out.print("A área do trapézio:"+r);
	}

}
