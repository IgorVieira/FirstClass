/*Faça um programa que Calcule a Area de um Quadrado*/

package exe910;

import java.util.Scanner;

public class exe10 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
	int l; /*Lado*/
	int r; /*Resultado*/
		
 System.out.println("Calculo da Area de um Quadrado");
 
 System.out.print("Insira o valor do lado referente ao quadrado: ");
      l = s.nextInt();
      
      r = l *l;
      
 System.out.print("Resultado²: " +r);
		
	
	}

}
