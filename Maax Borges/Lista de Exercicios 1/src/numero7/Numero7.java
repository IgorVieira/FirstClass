package numero7;

import java.util.Scanner;

public class Numero7 {

	public static void main(String[] args) {

		
Scanner s = new Scanner (System.in);

float peso;
float redu��o1;
float redu��o2;
float novopeso1;
float novopeso2;


System.out.print("Digite o seu peso.");
peso = s.nextFloat();

redu��o1 = (float)((float)peso *  0.15);
redu��o2 = (float)((float)peso * 0.20);

novopeso1 = (float) peso - redu��o1;
novopeso2 = (float) peso - redu��o2;


System.out.println("Peso ap�s 15% de emagrecimento.  "+novopeso1);
System.out.println("Peso ap�s 20% de emagreciento.  "+novopeso2);





	}

}
