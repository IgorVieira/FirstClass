package ExD2;

import java.util.Scanner;

public class ExD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		float n;
		float r;
		
		System.out.print("Sal�rio recebido :  ");
		n = s.nextFloat();
		
		r = n / 724;
		
		System.out.print("Quantidade de s�lario minimos recebido:  "+r);

	}

}
