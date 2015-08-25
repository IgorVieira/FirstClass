package Numero9;
import java.util.Scanner;
public class Tarefa9 {

	
	
		public static void main(String[]args){
					
		
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			
			float n, n2, n3, r;
			
			System.out.println("Base maior:");
			n = s.nextInt();
			
			System.out.println("Base menor");
			n2 = s.nextInt();
			
			System.out.println("Altura");
			n3 = s.nextInt();
			
			r = ((n + n2) * n3) / 2;
			System.out.println("Area:" + r);	
			
			
			
			
			
			
		}
}
