package Numero15;
import java.util.Scanner;
public class Tarefa15 {
		
	public static void main(String[]args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double n, n2, n3, m, m2, r; 
		
		System.out.println("Salario:");
		n = s.nextInt();
		
		System.out.println("valor da conta 1:");
		n2 = s.nextInt();
				
		System.out.println("valor da conta 2:");
		n3 = s.nextInt();
		
		m = (double) n2 + (0.02 * n2);
		
		m2 = (double) n3 + (0.02 * n3);
		
		r = n - m - m2;
		System.out.println("Restante:"+r);
		
		
		
		
		
		
	}
}
