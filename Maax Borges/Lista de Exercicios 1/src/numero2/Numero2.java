package numero2;

import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int x;
		int x2;
		int x3;
		int R;
		
	System.out.println("Primeiro n�mero, por favor");
    x = s.nextInt();
	
    System.out.println("Segundo n�mero, por favor");
    x2 = s.nextInt();
    
    System.out.println("Terceiro n�mero, por favor");
    x3= s.nextInt();
    
    R = x * x2 * x3;
    
    System.out.print("Resultado da multiplica��o "+R);
	}

}
