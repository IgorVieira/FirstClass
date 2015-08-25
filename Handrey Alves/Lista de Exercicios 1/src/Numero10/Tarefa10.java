package Numero10;
import java.util.Scanner;
public class Tarefa10 {

	public static void main(String[]args){
	
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	
	int n, r;
	
	System.out.println("Lado:");
	n = s.nextInt();
	
	r = n * n;
	System.out.print("Area:"+r);
	}
}
