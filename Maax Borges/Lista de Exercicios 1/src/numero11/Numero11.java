package numero11;

import java.util.Scanner;

public class Numero11 {
public static void main (String[]args){
	

Scanner s = new Scanner (System.in)	;

float DMaior;
float DMenor;
float �rea;

System.out.print("Digite a maior diagonal do losango.");
DMaior = s.nextFloat();

System.out.print("Digite a menor diagonal do losango.");
DMenor = s.nextFloat();

�rea = ((float)DMaior * DMenor) / 2;

System.out.print("A �rea deste losango � : "+ �rea);


	
	
	
}
}
