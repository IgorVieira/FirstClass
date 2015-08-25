package Numero11;

import java.util.Scanner;

public class Ex11 {


	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		double dmai, dmen, r;
		
		System.out.println("Digite a diagonal maior:");
		dmai = s.nextDouble();

		System.out.println("Digite a diagonal menor:");
		dmen = s.nextDouble();
		
		r = (dmai * dmen) /2;
		
		System.out.println("Area do losango é igual à:"+r);
	}
	
}
