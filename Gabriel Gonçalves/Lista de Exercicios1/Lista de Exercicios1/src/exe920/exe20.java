/*Faça um programa que receba a medida do angulo formado por uma escada apoiada no chão e a 
 distancia em que a escada está da parede. Calcule e mostre a medida da escada para que se 
 possa alcançar sua ponta*/

package exe920;

import java.util.Scanner;

public class exe20 {
  public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
	  
	  double angulo;
	  double altura;
	  double escada;
	  double radiano;
	
  System.out.println("Calculo da Medida da Escada: ");	  
	  
  System.out.print("Digite o Angulo: ");
      angulo = s.nextDouble();
	  
  System.out.print("Digite a Altura: ");
      altura = s.nextDouble();
  
  radiano = angulo * (Math.PI)/180;
  escada = altura / Math.sin(radiano);
  
  System.out.print("A Medida da escada é: " +escada);
  
 
  }
}
