package Numero6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double fixo, venda, comissao , r;
		
		System.out.println("Digite o seu salário:");
		fixo = s.nextDouble();
		
		System.out.println("Digite o valor total de vendas:");
		venda = s.nextDouble();
		
		comissao = 0.04 * venda;
		
		r = fixo + comissao ;
		
		System.out.println("Seu salário final é:"+r);
		
		System.out.println("Sua comissao é:"+comissao);
		
	    System.out.println("Salário fixo:"+fixo);
		
	}
		
}	
