package numero2;

import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int x;
		int x2;
		int x3;
		int R;
		
	System.out.println("Primeiro número, por favor");
    x = s.nextInt();
	
    System.out.println("Segundo número, por favor");
    x2 = s.nextInt();
    
    System.out.println("Terceiro número, por favor");
    x3= s.nextInt();
    
    R = x * x2 * x3;
    
    System.out.print("Resultado da multiplicação "+R);
	}

}
