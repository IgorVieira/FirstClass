package numero9;

import java.util.Scanner;

public class Numero9 {
public static void main (String[]args){

Scanner s = new Scanner (System.in);

float BMaior;
float BMenor;
float altura;
float A;

System.out.print("Digite a maior base do trapézio");
BMaior = s.nextFloat();

System.out.print("Digite a menor base do trapézio");
BMenor = s.nextFloat();

System.out.print("Digite a altura do trapézio");
altura = s.nextFloat();

A = ((float)BMaior + BMenor) * 2;

System.out.print("A Área deste trapézio é : "+ A);


}
}