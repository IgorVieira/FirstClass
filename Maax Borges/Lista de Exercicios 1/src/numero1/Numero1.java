package numero1;

import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
		
Scanner s = new Scanner (System.in);

int x;
int x2;
int r;

System.out.println("Primeiro n�mero, por favor.");
x = s.nextInt();

System.out.println("Segundo n�mero, por favor.");
x2 = s.nextInt();

r = x - x2;

System.out.print("O Resultado da subtra��o � "+ r);



	}

}
