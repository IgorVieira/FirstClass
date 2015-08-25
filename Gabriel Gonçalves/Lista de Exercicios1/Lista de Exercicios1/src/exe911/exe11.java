/*Faça um programa que calcule a area de um Losango, Formula = L = (D*d)/2 */

package exe911;

import java.util.Scanner;

public class exe11 {
  public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
	  
       float d1; /*Diagonal Maior*/
       float d2; /*Diagonal Menor*/
       float r; /*Resultado*/
       
   System.out.println("Calculo da area de um Losango: ");
   
   System.out.print("Insira o valor da Diagonal Maior: ");
       d1 = s.nextFloat();
       
    System.out.print("Insira o valor da Diagonal Menor: ");
	   d2 = s.nextFloat();  
	   
	   r = (d1 *d2)/2;
	  
	System.out.print("Resultado: " +r);
	  
	  
  }
}
