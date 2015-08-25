/*Faça um programa que receba o raio, calcule e mostre:   
 a) o comprimento de uma esfera C = 2*pi*R; 
 b) a área de uma esfera A = pi*R²
 c) o volume de uma esfera V = 3/4*pi*R³; */
 

package exe917;

import java.util.Scanner;

public class exe17 {
   public static void main(String[] args){
	   Scanner s = new Scanner(System.in);
	   
	     float r; /*Raio*/
	     float e; /*Esfera*/
	     float a; /*area*/
         float v; /*Volume*/
         
	   System.out.println("Calculo de Esfera");
	   
	   System.out.print("Insira o Raio da Esfera: ");
	     r = s.nextFloat();
	
	     e = (float) (2*3.14 *r);
	     a = (float) (3.14*(r*r));
	     v = (float) (0.75*3.14*(r*r*r));
	     
	     
	   System.out.print("Valor do Comprimento da esfera: " +e + 
			            "\nÁrea de uma esfera: " +a+ 
			            "\nVolume da Esfera: " +v);  
	     
   }
}
