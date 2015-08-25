/*Faça um programa que receba três números, calcule e mostre a multiplicação 
 desses números*/

package Exe2;

import java.util.Scanner;

public class exe2 {
  public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
	  
	  
	  int n;
	  int n2;
	  int n3;
	  int r;
	  
   System.out.println("Multiplicação de 3 Números");
   
   System.out.print("Insira um Número: ");
         n = s.nextInt();
         
   System.out.print("Insira outro Número: ");
	     n2 = s.nextInt();
	     
   System.out.print("Insira Novamente outro Número: ");
         n3 = s.nextInt();
         
   r = (n *n2 *n3);
   
   System.out.print("Resultado: " +r);
   
     	  
  }
}
