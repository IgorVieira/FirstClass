package numero11;

import java.util.Scanner;

public class Numero11 {
public static void main (String[]args){
	

Scanner s = new Scanner (System.in)	;

float DMaior;
float DMenor;
float Área;

System.out.print("Digite a maior diagonal do losango.");
DMaior = s.nextFloat();

System.out.print("Digite a menor diagonal do losango.");
DMenor = s.nextFloat();

Área = ((float)DMaior * DMenor) / 2;

System.out.print("A Área deste losango é : "+ Área);


	
	
	
}
}
