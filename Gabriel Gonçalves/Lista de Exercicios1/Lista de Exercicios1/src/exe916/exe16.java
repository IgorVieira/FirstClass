/*Faça um programa que receba o valor dos catetos de um triângulo,
 calcule e mostre o valor da Hipotenusa.*/

package exe916;

import java.util.Scanner;

public class exe16 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		float h; /*Hipotenusa*/
		float c1; /*Cateto1*/
		float c2; /*Cateto2*/
		float r;  /*Resultado*/
		
   System.out.println("Calculo da Hipotenusa");
   
   System.out.print("Insira o Valor do Cateto1: ");
        c1 = s.nextFloat();
        
   System.out.print("Insira o Valor do Cateto2: ");
        c2 = s.nextFloat();
        
    r = ((c1* c1) +(c2*c2));
    h = (float) Math.sqrt(r);
    
    System.out.print("Valor da Hipotenusa: " +h);
		
	}

}
