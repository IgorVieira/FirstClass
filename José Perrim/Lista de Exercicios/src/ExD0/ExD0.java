package ExD0;

import java.util.Scanner;

public class ExD0 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float r;

		System.out.print("O valor de um lado de um quadrado:  ");
		n = s.nextFloat();

		r = n * n;
		System.out.print("A área do quadrado é :  " + r);

	}

}
