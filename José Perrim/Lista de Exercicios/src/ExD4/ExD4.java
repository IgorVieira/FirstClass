package ExD4;

import java.util.Scanner;

public class ExD4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		int n;
		int n2;
		int r;
		int r2;
		int r3;
		int r4;
		
		System.out.print("Ano atual:  ");
		n = s.nextInt();
		
		System.out.print("Ano de nascimento:  ");
		n2 = s.nextInt();
		
		r = n - n2;
		r2 = r*12;
		r3 = r * 365;
		r4 = r* 52;
		
		System.out.print("Você tem: " +r+ "anos");
		System.out.print("\n"+r2+ "Meses");
		System.out.print("\n"+r3+ "dias");
		System.out.print("\n"+r4+ "semanas");
				
	}

}
