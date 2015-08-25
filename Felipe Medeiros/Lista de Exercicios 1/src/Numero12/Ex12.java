package Numero12;

import java.util.Scanner;

public class Ex12 {

public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double min, empregado, r;
		
		System.out.println("Digite o salário mínimo:");
		min = s.nextDouble();
		
		System.out.println("Digite o valor do salário do empregado:");
		empregado = s.nextDouble();
		
		r = empregado / min;
		
		System.out.println("O empregado ganha (salários mínimos):"+r);
		
		
	}
		
}	

