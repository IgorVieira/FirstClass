package br.org.controle5;

import javax.swing.JOptionPane;


public class Start {

	public static void main (String[] args){

		
		float n1;
		float n2;
		float n3;
		float op;
		float op2;
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número ."));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número ."));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a opção :"
				+ "\n 1 - O primeiro número elevado pelo segundo ; "
				+ "\n 2 - Raiz quadrada de cada um dos números ; "
				+ "\n 3 - Raiz cúbica de cada um dos números ; "));
		 
		if(n3 == 1){ 
	    op = ((float)(Math.pow (n1 , n2)));	
		JOptionPane.showMessageDialog(null, "Resultado do cálculo : " + op);
		}
	
		
		else if (n3 == 2){
		op = ((float)(Math.sqrt(n1)));
		op2 = ((float)(Math.sqrt(n2)));
		
			JOptionPane.showMessageDialog(null, "Resultado da primeira raiz : " + op 
			                              +"\n Resultado da segunda raiz :" + op2);
		}	
		
		else if (n3 == 3){
	    op = (float)Math.cbrt(n1);
	    op2 = (float)Math.cbrt(n2);
	    
	    JOptionPane.showMessageDialog(null, "Resultado da primeira raiz : " + op
	    		                       +"\n Resultado  da segunda raiz : " + op2 );
		}
		

					
		
}		
}


