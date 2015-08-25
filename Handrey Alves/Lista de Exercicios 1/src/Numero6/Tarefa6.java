package Numero6;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n, n2, r, r2;

		System.out.println("Salario:");
		n = s.nextInt();

		System.out.println("soma dos valores das vendas:");
		n2 = s.nextInt();

		r =(float) (n2 * (4.0/100));
	
		System.out.println("Comissão" + r);

		r2 = n + r;
		
		System.out.println("Salario final:" + r2);

	}

}
