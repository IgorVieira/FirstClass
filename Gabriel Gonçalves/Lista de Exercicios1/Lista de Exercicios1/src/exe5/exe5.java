/*Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, 
 sabendo-se que sofre um desconte de 10% */

package exe5;

import java.util.Scanner;

public class exe5 {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
          
      
       float n;
       float n2;
       float r;
       
       
       
   System.out.println("Calculo Mercadoria a 10%");
   
   
   System.out.print("Insira o Valor da Mercadoria: ");
       n  = s.nextFloat();
           
       n2 = (10 *n)/100;

       r = n +n2;
     
   System.out.print("Resutado: " +r);
   
	   
   }
}
