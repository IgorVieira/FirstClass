package Ex9;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		float n;
		float n2;
		float n3;
		float r;
		
		System.out.print("Qual o valor da base maior do tr�pezio?  ");
		n = s.nextFloat();
		
		System.out.print("Qual o valor da base menor do tr�pezio?  ");
		n2 = s.nextFloat();
		
		System.out.print("Qual o valor da altura do tr�pezio?  ");
		n3 = s.nextFloat();
		
		r = ((n + n2)*n3)/2;
		
		System.out.print("A �rea do tr�pezio e :  "+r);
	}

}
