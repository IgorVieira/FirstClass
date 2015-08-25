package Exercício11;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int d1;
		int d2;
		int n;
		int r;
		
		System.out.print("Diagonal maior:");
		d1 = s.nextInt();
		
		System.out.print("Diagonal menor:");
		d2 = s.nextInt();
		
		System.out.print("Divisor:");
		n = s.nextInt();
		
		r = d1 * d2 / n;
		
		System.out.print("Área do losango:"+r);
	}

}
