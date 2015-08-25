package Ex5;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float r;

		System.out.print("Preço do produto:  ");
		n = s.nextFloat();

		r = n - (n* 10/100);

		System.out.print("Preço com desconto:  " + r + "R$");

	}

}
