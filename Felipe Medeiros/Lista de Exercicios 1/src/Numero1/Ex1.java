package Numero1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int n, n2, r;

		System.out.println("V�riavel x");
		n = s.nextInt();

		System.out.println("V�riavel y");
		n2 = s.nextInt();

		r = n - n2;

		System.out.print("Resultado:\n" + r);

	}
}
