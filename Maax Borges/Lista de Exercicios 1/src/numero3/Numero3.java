package numero3;

import java.util.Scanner;

public class Numero3 {
public static void main( String[]args){

Scanner s = new Scanner (System.in);

float x;
float x2;
float R;

System.out.println("Primeiro n�mero, por favor.");
x = s.nextFloat();

System.out.println("Segundo n�mero, por favor.");
x2 = s.nextFloat();

R  = x / x2 ;

System.out.print("Resultado da divis�o = "+ R);



}
}
