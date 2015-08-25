package numero7;

import java.util.Scanner;

public class Numero7 {

	public static void main(String[] args) {

		
Scanner s = new Scanner (System.in);

float peso;
float redução1;
float redução2;
float novopeso1;
float novopeso2;


System.out.print("Digite o seu peso.");
peso = s.nextFloat();

redução1 = (float)((float)peso *  0.15);
redução2 = (float)((float)peso * 0.20);

novopeso1 = (float) peso - redução1;
novopeso2 = (float) peso - redução2;


System.out.println("Peso após 15% de emagrecimento.  "+novopeso1);
System.out.println("Peso após 20% de emagreciento.  "+novopeso2);





	}

}
