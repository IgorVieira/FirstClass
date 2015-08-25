/*Faça um programa que receba uma hora(uma variavel para horas  
 e outra para minutos), calcule e mostre: 
 a) a hora digitada convertida em minutos
 b)o total dos minutos, ou seja os minutos digitados mais a 
 conversão anterior.
 c)o total dos minutos convertidos em segundos */

package exe925;

import java.util.Scanner;

public class exe25 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		   int h; /*Horas*/
           int m; /*Minutos*/
           int c1; /*Conversão de Horas para Minutos*/
           int c2; /*Soma dos minutos*/
           int c3; /*Conversão de minutos em segundos*/
           
      System.out.println("Conversor de Horas /Minutos/Segundos");
      
      System.out.print("Digite a variavel Hora: ");
          h = s.nextInt();
          
      System.out.print("Insira a Variavel Minutos: ");
          m = s.nextInt();
              
      c1 = h *60;
      c2 = c1 +m;
      c3 = c2 *60;
      
      System.out.println("Conversão das horas em Minutos: " +c1+" Minutos");
      
      System.out.println("Soma dos minutos convertidos: " +c2+ " Minutos");
      
      System.out.println("Conversão do total dos minutos em Segundos: " +c3+ " Segundos");
           
           

	}

}
