package ExD1;

import java.util.Scanner;

public class ExD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float n2;
		float r;

		System.out.print("Tamanho diagonal maior:  ");
		n = s.nextFloat();

		System.out.print("Tamanho da diagonal menor:  ");
		n2 = s.nextFloat();

		r = (n * n2) / 2;
		
		System.out.print("A á area do losango é :  "+r);

	}

}
