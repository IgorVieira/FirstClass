package ExD7;

import java.util.Scanner;

public class ExD7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double n;
		double r;
		double r2;
		double r3;

		System.out.print("Raio :  ");
		n = s.nextDouble();

		r = 2 * Math.PI * n;
		r2 = Math.PI * Math.pow(n, 2);
		r3 = 0.75 * Math.PI * Math.pow(n, 3);

		System.out.print("\nComprimento da esfera:  " + r);
		System.out.print("\n¡rea da esfera:  " + r2);
		System.out.print("\nVolume da esfera:  "+r3);

	}
}
