package Numero22;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double n, r;

		System.out.println("Digite o n�mero de lados do pol�gono:");
		n = s.nextDouble();
		
		r = n * (n - 3) / 2;
	
		System.out.println("O n�mero de diagonais do pol�gono � igual �:"+r);
				
	
	}
}
