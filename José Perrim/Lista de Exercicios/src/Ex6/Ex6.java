package Ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		float n;
		float n2;
		float r;

		System.out.print("Valor do salário:  ");
		n = s.nextFloat();

		System.out.print("Valor das vendas:  ");
		n2 = s.nextFloat();

		r = n + n2 * 4/ 100;

		System.out.print("Recebimento com comissão:  "+r);
		
		
	}
}
