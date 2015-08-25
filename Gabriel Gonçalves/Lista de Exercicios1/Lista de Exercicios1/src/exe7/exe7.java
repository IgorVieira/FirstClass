/*Faça um programa que receba o peso de uma pessoa e calcule: 
 a) O novo peso se a pessoa engordar 15% referente ao peso digitado;
 b) O novo peso se a pessoa emagrecer 20% referente ao peso digitado;
 */

package exe7;

import java.util.Scanner;

public class exe7 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		
		   int n;
		   int p1;
		   int p2;
		   int r;
		   int r2;
		
   System.out.println("Calcule de Peso sobre 15% e 20%: ");
   
   System.out.print("Insira o peso desejado: ");
           n = s.nextInt();
           
          p1 = 15*n /100;
          
          r = n +p1;
          
   System.out.println("Novo peso após engordar 15%: " +r);
   
         p2 = 20*n /100;
         
         r2 = n - p2;
         
   System.out.print("Novo peso após emagrecer 20%: " +r2);
   	
	}

}
