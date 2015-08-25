package Numero11;
import java.util.Scanner;
public class Tarefa11 {

	public static void main(String[]args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		float n, n2, r;
		
		System.out.println("diametro maior:");
		n = s.nextInt();
		
		System.out.println("diametro menor");
		n2 = s.nextInt();
		
		
		r = (n * n2) / 2;
		System.out.println("Area:" + r);	
		
		
	}
}
