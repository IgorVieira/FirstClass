package ExD3;

import java.util.Scanner;

public class ExD3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int n;
		int n3;
		int r;
		int r2;
		int r3;
		int r4;

		System.out.print("Tabuada de :  ");
		n = s.nextInt();

		System.out.print("Por:  ");
		n3 = s.nextInt();

		r = n + n3;
		r2 = n - n3;
		r3 = n * n3;
		r4 = n / n3;
		
		System.out.print("Resultado: "+r);
		System.out.print("Resultado: "+r2);
		System.out.print("Resultado: "+r3);
		System.out.print("Resultado: "+r4);

	}
}
