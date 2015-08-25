package ExD6;

import java.util.Scanner;

public class ExD6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float n2;
		float r;

		System.out.print("Valor do primeiro cateto :  ");
		n = s.nextFloat();

		System.out.print("Valor do segundo cateto:  ");
		n2 = s.nextFloat();

		r = (float) (Math.pow(n, 2) + Math.pow(n2, 2));

		System.out.print("O Valor da hipotenusa é:  "+r);
	}
}
