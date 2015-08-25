/*Faça um programa que receba uma temperatura em Celsius, calcule e  
  mostre essa temperatura em Fahrenheit, 
  Sabe-se que F = 180*(C + 32)/100*/


package exe918;

import java.util.Scanner;

public class exe18 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		   float c; /*Celsius*/
		   float f; /*Fahrenheit*/
		   
    System.out.println("Conversor de Temperatura: ");
	
    System.out.print("Insira a Temperatura em Celsius: ");
          c = s.nextFloat();
          
          f = (float) ((1.8 * c)+32);
          
     System.out.print("Temperatura Convertida: " +f+ "F");
     
	
	}

}
