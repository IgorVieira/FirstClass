package Exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int p;
		int n;
		int p1;
		int n2;
		int p2;
		
		System.out.print("Digite o peso:");
		p = s.nextInt();
		
		System.out.print("Digite a massa:");
		n = s.nextInt();
		
		p1 = p + n;
		
		System.out.print("Novo peso:\n"+p1);
		
		System.out.print("Digite o novo peso:\n");
		p1 = s.nextInt();
		
		System.out.print("Digite a massa:");
		n2 = s.nextInt();
		
		p2 = p1 - n2;
		
		System.out.print("Digite o novo peso:"+p2);
	
		
		
		
		
	}

}
