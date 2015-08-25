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
		
		System.out.print("Qual o valor da base maior do trápezio?  ");
		n = s.nextFloat();
		
		System.out.print("Qual o valor da base menor do trápezio?  ");
		n2 = s.nextFloat();
		
		System.out.print("Qual o valor da altura do trápezio?  ");
		n3 = s.nextFloat();
		
		r = ((n + n2)*n3)/2;
		
		System.out.print("A área do trápezio e :  "+r);
	}

}
