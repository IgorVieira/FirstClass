package Numero12;
import java.util.Scanner;
public class Tarefa12 {

	public static void main(String[]args){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		float n, n2, r;
		
		System.out.println("valor do salario minimo:");
		n = s.nextInt();
		
		System.out.println("Quanto voce recebe:");
		n2 = s.nextInt();
		
		r = n2 / n;
		System.out.println("Quantidade de salarios:" + r);
		
	}
}
