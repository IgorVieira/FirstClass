package ExD5;

import java.util.Scanner;

public class ExD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double n;
		double n2;
		double n3;
		double r;
		
		
		System.out.print("Valor do sal�rio de jo�o:  ");
		n = s.nextDouble();
		
		System.out.print("Valor d� primeira conta a pagar:  ");
		n2 =s.nextDouble();
		
		System.out.print("Valor da segunda conta a pagar:  ");
		n3 = s.nextDouble();
		
		
		
		r = n + (n2 *0.02 + n2) - (n3*0.02 +n3);
		
		System.out.print("O que sobrar� do sal�rio de Jo�o:  "+r);
	}

}
