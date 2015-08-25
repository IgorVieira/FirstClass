package Numero1;

import java.util.Scanner;

public class Ex1 {

	  public static void main(String[] args)	{
	              //System.out.print("Hello Word");
	        	 
	        @SuppressWarnings("resource")
	        Scanner s = new Scanner(System.in);
	        
	        int n, n2, r;
	        
	        System.out.print("Digite algum numero aleatorio q vier na sua cabeça...Qualquer numero:");
	        n = s.nextInt();
	        
	        System.out.print("Digite algum outro numero aleatorio q vier na sua cabeça...Qualquer numero:");
	        n2 = s.nextInt();
	        
	        r = n - n2;
	        
	        System.out.print("O resultado preciso dessa subtração e Alpacas...mintira, é :"+r);
		    
		
		
	         }

}
