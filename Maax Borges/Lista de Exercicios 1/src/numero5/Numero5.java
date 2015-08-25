package numero5;

import java.util.Scanner;

public class Numero5 {
public static void main (String[]args){

Scanner s = new Scanner (System.in);

float x;
float r;
float novopreço;


System.out.print("Digite o preço, por favor.");
x = s.nextFloat();

r = (float) (x / 100) * 10;

novopreço = x - r;

System.out.print("Novo preço. "+ novopreço);






}
}
