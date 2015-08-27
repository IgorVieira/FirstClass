package exercicio1;

import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		Double x , y , r1 , r2 , r3 , r4;
		
		System.out.println("Ano de nascimento:");
		x = s.nextDouble();
		
		System.out.println("Ano atual:");
		y = s.nextDouble();
		
		r1 = y - x;
		
		System.out.println("Idade em anos:"+ r1);
		
		r2 = (y - x) *12;
		
		System.out.println("Idade em meses:"+ r2);
		
		r3 = (y - x) *12*4;
		
		System.out.println("Idade em semanas:"+ r3);
		
		r4 = (y - x) *365;
		
		System.out.println("Idade em dias:"+ r4);
		
		
		
		
		
	}

}
