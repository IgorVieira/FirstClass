package numero5;

import java.util.Scanner;

public class Numero5 {
public static void main (String[]args){

Scanner s = new Scanner (System.in);

float x;
float r;
float novopre�o;


System.out.print("Digite o pre�o, por favor.");
x = s.nextFloat();

r = (float) (x / 100) * 10;

novopre�o = x - r;

System.out.print("Novo pre�o. "+ novopre�o);






}
}
