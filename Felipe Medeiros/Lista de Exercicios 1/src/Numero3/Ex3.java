package Numero3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double n, n2, r;

		System.out.println("V�riavel x");
		n = s.nextDouble();

		System.out.println("V�riavel y");
		n2 = s.nextDouble();

		r = n / n2;

		System.out.print("Resultado:\n"+ r);

	}
}
