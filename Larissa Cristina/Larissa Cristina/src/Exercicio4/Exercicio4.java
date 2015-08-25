package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n1;
		int n2;
		int r1;
		int r2;
		int r;
		
		System.out.print("Digite uma nota:");
		n1 = s.nextInt();
		
		System.out.print("Digite uma outra nota:");
		n2 = s.nextInt();
		
		r1 = n1 * n2;
		
		System.out.print("O primeiro resultado é:\n"+r1);
		
		System.out.print("Digite um divisor:");
		r2 = s.nextInt();
		
		r = r1 / r2; 
		
		System.out.print("O resultado final é:"+r);
		
		
	}

}
