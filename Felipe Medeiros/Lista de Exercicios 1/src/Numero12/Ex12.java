package Numero12;

import java.util.Scanner;

public class Ex12 {

public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double min, empregado, r;
		
		System.out.println("Digite o sal�rio m�nimo:");
		min = s.nextDouble();
		
		System.out.println("Digite o valor do sal�rio do empregado:");
		empregado = s.nextDouble();
		
		r = empregado / min;
		
		System.out.println("O empregado ganha (sal�rios m�nimos):"+r);
		
		
	}
		
}	

