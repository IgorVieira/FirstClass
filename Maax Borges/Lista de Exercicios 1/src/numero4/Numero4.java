package numero4;

import java.util.Scanner;

public class Numero4 {
public static void main (String[]args){
	
Scanner s = new Scanner (System.in);

int x;
int x2;
int R;

System.out.println("Primeiro número, por favor.");
x = s.nextInt();

System.out.println("Segundo número, por favor.");
x2= s.nextInt();

R = (x * 2 + x2 * 3) / 5;

System.out.print("Resultado da média ponderada é = "+ R);







}
}