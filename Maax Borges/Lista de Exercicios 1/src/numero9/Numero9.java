package numero9;

import java.util.Scanner;

public class Numero9 {
public static void main (String[]args){

Scanner s = new Scanner (System.in);

float BMaior;
float BMenor;
float altura;
float A;

System.out.print("Digite a maior base do trap�zio");
BMaior = s.nextFloat();

System.out.print("Digite a menor base do trap�zio");
BMenor = s.nextFloat();

System.out.print("Digite a altura do trap�zio");
altura = s.nextFloat();

A = ((float)BMaior + BMenor) * 2;

System.out.print("A �rea deste trap�zio � : "+ A);


}
}