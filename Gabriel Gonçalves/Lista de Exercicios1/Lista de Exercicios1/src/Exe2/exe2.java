/*Fa�a um programa que receba tr�s n�meros, calcule e mostre a multiplica��o 
 desses n�meros*/

package Exe2;

import java.util.Scanner;

public class exe2 {
  public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
	  
	  
	  int n;
	  int n2;
	  int n3;
	  int r;
	  
   System.out.println("Multiplica��o de 3 N�meros");
   
   System.out.print("Insira um N�mero: ");
         n = s.nextInt();
         
   System.out.print("Insira outro N�mero: ");
	     n2 = s.nextInt();
	     
   System.out.print("Insira Novamente outro N�mero: ");
         n3 = s.nextInt();
         
   r = (n *n2 *n3);
   
   System.out.print("Resultado: " +r);
   
     	  
  }
}
