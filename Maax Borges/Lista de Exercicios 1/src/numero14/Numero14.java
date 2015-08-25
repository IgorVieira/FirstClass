package numero14;

import java.util.Scanner;

public class Numero14 {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	
	int AA;
	int AN;
	int Anos;
	int Meses;
	int Dias;
	int Semanas;
	
	
	System.out.print("Digite o ano atual.");
	AA = s.nextInt();
	
	System.out.print("Digite o seu ano de nascimento." );
	AN = s.nextInt();
	
	
	Anos = AA - AN;
	Meses = Anos * 12;
	Dias = Anos * 365;
	Semanas = Anos * 52;
	
	System.out.println("Sua idade em anos = "+ Anos);
	System.out.println("Sua idade em meses = "+ Meses);
	System.out.println("Sua idade em semanas = "+ Semanas);
	System.out.println("Sua idade em dias = "+ Dias);
	

	}

}
