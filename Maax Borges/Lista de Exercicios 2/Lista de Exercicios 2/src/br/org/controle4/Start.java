package br.org.controle4;


import javax.swing.JOptionPane;


public class Start {

	public static void main (String[] args){

		
		float n1;
		float n2;
		float n3;
		float op;
		
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro n�mero ."));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo n�mero ."));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a op��o :"
				+ "\n 1 - M�dia entre os n�meros digitados"
				+ "\n 2 - Diferen�a do maior para o menor"
				+ "\n 3 - Produto entre os dois n�meros digitados"
				+ "\n 4 - Divis�o do primero pelo segundo ."));
		 
		if(n3 == 1){ 
	    op = (n1 + n2) / 2;	
		JOptionPane.showMessageDialog(null, "Resultado da M�dia : " + op);
		}
	
		
		else if (n3 == 2){
		
		if (n1 > n2){	
			op = n1 - n2 ;
		JOptionPane.showMessageDialog(null, "Resultado da diferen�a : " + op);
		} else if (n2 > n1){
			op = n2 - n1;
			JOptionPane.showMessageDialog(null, "Resultado da diferen�a :" + op);
		}
		}
		
		
		else if (n3 == 3){
			op = n1 * n2;
		JOptionPane.showMessageDialog(null , "Resultado do produto : " + op);
		}
		
		else if  (n3 == 4){
			op =  n1 / n2;
		JOptionPane.showMessageDialog(null,  "Resultado da Divis�o :" + op);
		} 
		
		
		
		

					
		
}		
}


