package Numero2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double n;
		double n2;
		double n3;
		double r;

		System.out.println("V�riavel x:");
		n = s.nextDouble();

		System.out.println("V�riavel y");
		n2 = s.nextDouble();

		System.out.println("V�riavel z");
		n3 = s.nextDouble();

		r = n * n2 * n3;

		System.out.println("Resultado:" + r);

	}

}
