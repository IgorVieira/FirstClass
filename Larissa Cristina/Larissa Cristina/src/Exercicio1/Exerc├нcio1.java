package Exercicio1;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n;
		int n1;
		int r;
		
		System.out.print("Digite um n�mero:");
		n = s.nextInt();
		
		System.out.print("Digite outro n�mero:");
		n1 = s.nextInt();
		
		r = n - n1;
		
		System.out.print("O resultado �:"+r);
	
	}

}
