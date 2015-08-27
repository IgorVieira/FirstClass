package exercicio1;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
       
		
		Scanner s = new Scanner(System.in);
		
		Double c1 , c2 ,r  , h;
		
		System.out.println("Valor de um cateto:");
		c1 = s.nextDouble();
		
		System.out.println("Valor do outro cateto:");
		c2 = s.nextDouble();
		
		h = Math.pow(c1, 2) + Math.pow(c2, 2);
		 				
		r = Math.sqrt(h);
		
		System.out.println("Valor da hipotenusa:" + r);
		
		
		
		

	}

}
