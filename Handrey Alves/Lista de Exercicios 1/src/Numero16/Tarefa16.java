package Numero16;
import java.util.Scanner;
public class Tarefa16 {

	
	public static void main(String[]args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double n, n2, r, r2;
		
		System.out.println("Cateto 1:");
		n = s.nextInt();
		
		System.out.println("Cateto 2:");
		n2 = s.nextInt();
		
		r = Math.pow(n,2) + Math.pow(n2,2);
		
		r2 = Math.sqrt(r);
		System.out.println("Hipotenusa:"+r2);
		
		
		
		
		
		
		

		
		
	}
}
