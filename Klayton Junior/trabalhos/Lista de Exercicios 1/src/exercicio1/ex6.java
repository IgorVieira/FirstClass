package exercicio1;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		Double x, c, sf;
		
		System.out.println("Salário fixo:");
		x = s.nextDouble();
		
		System.out.println("Número de vendas:");
		c = s.nextDouble();
		
		sf = x + c*4*Math.pow(10, -2);
		
		System.out.println("Salário final:" + sf);
		
	

	}

}
