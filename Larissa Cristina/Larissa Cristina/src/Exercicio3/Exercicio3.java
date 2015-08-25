package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n1;
		int n2;
		int r;
		
		System.out.print("Digite um número:");
		n1 = s.nextInt();
		
		System.out.print("Digite um outro número:");
		n2 = s.nextInt();
		
		r = n1 / n2;
		
		System.out.print("O resultado é:"+r);
	}

}
