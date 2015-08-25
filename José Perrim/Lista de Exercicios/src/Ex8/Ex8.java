package Ex8;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float r;

		System.out.print("Seu peso em Kg:  ");
		n = s.nextFloat();

		r = n * 1000;

		System.out.print("Seu peso em gramas é :" + r);

	}

}
