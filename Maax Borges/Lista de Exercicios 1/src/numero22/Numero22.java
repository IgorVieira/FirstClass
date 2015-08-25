package numero22;

import java.util.Scanner;

public class Numero22 {
public static void main (String[]Args){
	
Scanner s = new Scanner (System.in);

float NL;
float ND;

System.out.print("Digite o número de lados do polígono convexo.");
NL = s.nextFloat();

ND = NL * (NL - 3) / 2;

System.out.print("O número de diagonais de tal polígono é  "+ ND);





}
}
