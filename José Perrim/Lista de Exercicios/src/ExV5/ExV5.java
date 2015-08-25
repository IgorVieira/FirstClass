package ExV5;

import java.util.Scanner;

public class ExV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float n2;
		float r;
		float r1;
		float r2;

		System.out.print("Numero de horas:  ");
		n = s.nextFloat();

		System.out.print("Número de minutos:  ");
		n2 = s.nextFloat();

		r = n * 60;
		r1 = r + n2;
		r2 = r1 * 60;
		
		System.out.print("\nHora indicada convertida em minutos:  "+r);
		System.out.print("\n Total de minutos:  "+r1);
		System.out.print("\n Total de segundo:  "+r2);

	}

}
