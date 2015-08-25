package Numero14;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double an, aa, r1, r2, r3, r4;
		
		System.out.println("Digite o Ano de Nascimento:");
		an = s.nextDouble();
		
		System.out.println("Digite o Ano Atual:");
		aa = s.nextDouble();
			
		r1 = aa - an;
		
		r2 = (aa - an) * 12;
		
		r3 = (aa - an) * 365;
		
		r4 = (aa - an) * 52;
		
		System.out.println("Idade em anos: "+r1);
		
		System.out.println("Idade em meses: "+r2);
		
		System.out.println("Idade em dias: "+r3);
		
		System.out.println("Idade em semanas: "+r4);
		
		
	}
}