package Numero14;
import java.util.Scanner;
public class Tarefa14 {

	public static void main(String[]args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		float n, n2, r, r2, r3, r4;
		
		System.out.println("Ano de nacimento:");
		n = s.nextInt();
		
		System.out.println("Ano atual:");
		n2 = s.nextInt();
		
		r = n2 - n ;
		System.out.println("Idade em anos:"+ r);
		
		r2 = r * 12;
		System.out.println("Idade em meses:"+ r2);
		
		r3 = r2 * 4;
		System.out.println("Idade em semanas:"+ r3);
		
		r4 = r3 * 7;
		System.out.println("Idade em dias:"+ r4);
		
		
	}
}
