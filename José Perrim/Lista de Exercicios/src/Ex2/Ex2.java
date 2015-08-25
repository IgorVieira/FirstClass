package Ex2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int n;
		int n2;
		int n3;
		int r;

		System.out.print("Digite um número inteiro aqui:  ");
		n = s.nextInt();

		System.out.print("Digite outro número inteiro aqui:  ");
		n2 = s.nextInt();

		System.out.print("Digite o terceiro número inteiro aqui:");
		n3 = s.nextInt();

		r = n * n2 * n3;

		System.out.print("Resultado" + r);

	}

}
