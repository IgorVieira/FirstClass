package br.org.controle5;

import javax.swing.JOptionPane;


public class Start {

	public static void main (String[] args){

		
		float n1;
		float n2;
		float n3;
		float op;
		float op2;
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro n�mero ."));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo n�mero ."));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a op��o :"
				+ "\n 1 - O primeiro n�mero elevado pelo segundo ; "
				+ "\n 2 - Raiz quadrada de cada um dos n�meros ; "
				+ "\n 3 - Raiz c�bica de cada um dos n�meros ; "));
		 
		if(n3 == 1){ 
	    op = ((float)(Math.pow (n1 , n2)));	
		JOptionPane.showMessageDialog(null, "Resultado do c�lculo : " + op);
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


