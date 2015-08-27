package exercicio1;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Double n1 , n2 , m;
		
		System.out.println("Nota 1:");
		n1 = s.nextDouble();
		
		System.out.println("Nota 2:");
		n2 = s.nextDouble();
		
		m = ((n1 *2  + n2 *3)/5);
		
		System.out.println("Média:" + m);
		
		
	}

}
