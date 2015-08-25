package Exercicio6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int f;
		int c1;
		int c;
		int v;
		int r;
		
		System.out.print("Salário fixo:");
		f = s.nextInt();
		
		System.out.print("Valor das vendas:");
		v = s.nextInt();
		
		System.out.print("Comissão:");
		c1 = s.nextInt();
		
		c = v + c1;
		
		System.out.print("valor da comissão:\n"+c);
		
		r = f + c;
		
		System.out.print("Salário final:\n"+r);
				
		
		
	}

}
