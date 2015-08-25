package Numero2;

import java.util.Scanner;

public class Tarefa2 {

	
	      public static void main (String[] args) {
	    	  
	    	  
	    	@SuppressWarnings("resource")  
	    	Scanner s = new Scanner(System.in);
	    	 
	    	int n, n2, n3, r;  
	    	
	    	System.out.println("Digite um numero querquer acima de 0 e inteiro:");  
	    	 n = s.nextInt(); 
	    	  
	    	System.out.println("Digite algum outro numero:");  
	    	  n2 = s.nextInt();
	    	  
	    	System.out.println("Digite um terceiro numero:");
	    	n3 = s.nextInt();
	    	  
	    	  r = n*n2*n3;
	    	  
	    	System.out.println("A resposta é:"+r);
	    	
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	      }

}
