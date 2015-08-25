package Ex3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		float n;
		float n2;
		float r;
		
		System.out.print("Um número diferente de 0:  ");
		n = s.nextFloat();
		
		System.out.print("Outro número diferente de 0:  ");
		n2 = s.nextFloat();
		
		r = n / n2;
		
		System.out.print("Redultado:  "+r);
				
		
	}
}
