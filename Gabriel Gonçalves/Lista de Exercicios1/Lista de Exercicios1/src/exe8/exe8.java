/*Faça um programa que converta o peso de uma pessoa de Kg para g*/

package exe8;

import java.util.Scanner;

public class exe8 {
     public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
    	
    	
    	int n;
        int r;
    	
    System.out.println("Conversor de Grandezas Kg/g: ");
    
    System.out.print("Insira o peso em Kg: ");
       n = s.nextInt();
       
       r = n *1000;
     
     System.out.print("Peso em Gramas: " +r);
     
    	 
    	 
     }
}
