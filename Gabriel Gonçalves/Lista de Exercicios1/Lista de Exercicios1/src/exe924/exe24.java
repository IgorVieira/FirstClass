/*Fa�a um programa que receba a quantidade de dinheiro em reais que
 uma pessoa que vai viajar possui. Ela vai passar por varios pa�ses 
 e precisa converter seu dinheiro em dolares, marco alem�o e libra esterlina.
 Sabe-se que a cota��o do d�lar � de R$ 1,80, do marco alem�o � de
 R$ 2,00 e da libra esterlina � de R$ 1,57. O programa deve fazer
 as convers�es e mostr�-las.*/

package exe924;

import java.util.Scanner;

public class exe24 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float q; /*Quantidade de Dinheiro*/
        float d; /*Convers�o do Dolar*/
        float ma; /*Convers�o Marco Alem�o*/
        float le; /*Convers�o Libra Esterlina*/
        
     System.out.println("Conversor de Moeda");
     
     System.out.print("Insira o Valor R$: ");
        q = s.nextFloat();
        
      d = (float) (q /1.80);
      ma = (float) (q /2.00);
      le = (float) (q /1.57);
      
      System.out.print("Convers�o em Dolares: " +d+ 
    		           "\nConvers�o Marco Alem�o: " +ma+ 
    		           "\nLibra Esterlina: " +le);
        
        
        

	}

}
