package numero22;

import java.util.Scanner;

public class Numero22 {
public static void main (String[]Args){
	
Scanner s = new Scanner (System.in);

float NL;
float ND;

System.out.print("Digite o n�mero de lados do pol�gono convexo.");
NL = s.nextFloat();

ND = NL * (NL - 3) / 2;

System.out.print("O n�mero de diagonais de tal pol�gono �  "+ ND);





}
}
