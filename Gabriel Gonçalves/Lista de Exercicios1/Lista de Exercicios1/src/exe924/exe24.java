/*Faça um programa que receba a quantidade de dinheiro em reais que
 uma pessoa que vai viajar possui. Ela vai passar por varios países 
 e precisa converter seu dinheiro em dolares, marco alemão e libra esterlina.
 Sabe-se que a cotação do dólar é de R$ 1,80, do marco alemão é de
 R$ 2,00 e da libra esterlina é de R$ 1,57. O programa deve fazer
 as conversões e mostrá-las.*/

package exe924;

import java.util.Scanner;

public class exe24 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float q; /*Quantidade de Dinheiro*/
        float d; /*Conversão do Dolar*/
        float ma; /*Conversão Marco Alemão*/
        float le; /*Conversão Libra Esterlina*/
        
     System.out.println("Conversor de Moeda");
     
     System.out.print("Insira o Valor R$: ");
        q = s.nextFloat();
        
      d = (float) (q /1.80);
      ma = (float) (q /2.00);
      le = (float) (q /1.57);
      
      System.out.print("Conversão em Dolares: " +d+ 
    		           "\nConversão Marco Alemão: " +ma+ 
    		           "\nLibra Esterlina: " +le);
        
        
        

	}

}
