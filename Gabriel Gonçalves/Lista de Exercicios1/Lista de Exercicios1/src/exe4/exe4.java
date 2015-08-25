/*Faça um programa que receba duas notas, Calcule e mostra a media ponderada dessas notas,  
considerando peso 2 para a primeira e peso 3 para a segunda */

package exe4;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
    	
    float p1;
    float p2;
    float c1;
    System.out.println("Media Ponderada");
    
    System.out.print("Insira o Valor da P1: ");
       p1 = s.nextFloat();
       
    System.out.print("Insira o Valor da P2: ");
      p2 = s.nextFloat();
    	
      c1 = (p1*2 + p2*3)/5;
    System.out.print("Resultado da Media: " +c1);		
    }
	
}
