package numero8;

import java.util.Scanner;

public class Numero8 {
public static void main (String[]args){
	
Scanner s = new Scanner (System.in);

float peso;
float pesoemgramas;

System.out.println("Digite o seu peso.");
peso = s.nextFloat();

pesoemgramas = (float) peso * 1000;

System.out.print("Este é o seu peso, em gramas. ");
System.out.print(pesoemgramas);


	
	
}
}
