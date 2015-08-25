package Ex4;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float n2;
		float r;

		System.out.print("Sua nota na primeira prova:  ");
		n = s.nextFloat();

		System.out.print("Nota dá sua secuda prova:  ");
		n2 = s.nextFloat();
		r = ((n * 2) + (n2 * 3)) / 5;

		System.out.print("Média:  " + r);

	}
}
