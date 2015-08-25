package ExD8;

import java.util.Scanner;

public class ExD8 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double n;
		double r;

		System.out.print("A temperatura em °Celcius:  ");
		n = s.nextDouble();

		r = n * 1.8 + 32;
		System.out.print("A temperatura em °Fahrenheit:  " + r);

	}

}
