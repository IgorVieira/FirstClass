package numero24;

import java.util.Scanner;

public class Numero24 {
public static void main (String[]Args){
	
Scanner s = new Scanner (System.in);	

float D;
float DD;
float MA;
float LE;

System.out.print("Digite a quantia do seu dinheiro, em R$");
D = s.nextFloat();

DD = (float) (D / 1.80);
MA = (float) (D / 2.00);
LE = (float) (D / 1.57);

System.out.println("Seu dinheiro em Dólares = " + DD );
System.out.println("Seu dinheiro em Marco Alemão = " + MA);
System.out.println("Seu dinheiro em Libras Esterlinas = " + LE);




	
}
}
