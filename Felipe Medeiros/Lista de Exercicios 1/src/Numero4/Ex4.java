package Numero4;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args){
	
	@SuppressWarnings("resource")
	Scanner s = new Scanner (System.in);
	
	double n, n2, r;
	
	System.out.println("Digite sua 1ª nota");
	n = s.nextDouble();
	
	System.out.println("Digite sua 2ª nota");
	n2 = s.nextDouble();
	
	
	r = ((n * 2)+(n2 * 3))/ 2;
	
	System.out.println("O resultado é:"+r);
	
	}
	
}	