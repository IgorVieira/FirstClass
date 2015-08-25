package Ex7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float r;
		float r2;

		System.out.print("Seu peso aqui:  ");
		n = s.nextFloat();

		r = n * 15 / 100 + n;
		r2 = n * 20 / 100 + n;

		System.out.print("Caso engorde,15%, seu peso seria :  " + r);
		System.out.print("\nCaso engorde ,20%, seu peso seira :  "+r2);

	}
}
