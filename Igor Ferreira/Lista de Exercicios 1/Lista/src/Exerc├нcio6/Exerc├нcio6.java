package Exercício6;

import java.util.Scanner;

public class Exercício6 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	 
	double n;
	double n2;
	double r;
	
	System.out.println("Salário fixo");
	n = s.nextDouble();
	
	System.out.println("Valor das vendas");
	n2 = s.nextDouble();
	
	r = n + (n2 * 0.04);
	
	System.out.println("Salário final: "+r);
	}
}
