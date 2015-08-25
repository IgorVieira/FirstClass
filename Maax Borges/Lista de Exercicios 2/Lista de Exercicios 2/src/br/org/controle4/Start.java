package br.org.controle4;


import javax.swing.JOptionPane;


public class Start {

	public static void main (String[] args){

		
		float n1;
		float n2;
		float n3;
		float op;
		
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número ."));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número ."));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a opção :"
				+ "\n 1 - Média entre os números digitados"
				+ "\n 2 - Diferença do maior para o menor"
				+ "\n 3 - Produto entre os dois números digitados"
				+ "\n 4 - Divisão do primero pelo segundo ."));
		 
		if(n3 == 1){ 
	    op = (n1 + n2) / 2;	
		JOptionPane.showMessageDialog(null, "Resultado da Média : " + op);
		}
	
		
		else if (n3 == 2){
		
		if (n1 > n2){	
			op = n1 - n2 ;
		JOptionPane.showMessageDialog(null, "Resultado da diferença : " + op);
		} else if (n2 > n1){
			op = n2 - n1;
			JOptionPane.showMessageDialog(null, "Resultado da diferença :" + op);
		}
		}
		
		
		else if (n3 == 3){
			op = n1 * n2;
		JOptionPane.showMessageDialog(null , "Resultado do produto : " + op);
		}
		
		else if  (n3 == 4){
			op =  n1 / n2;
		JOptionPane.showMessageDialog(null,  "Resultado da Divisão :" + op);
		} 
		
		
		
		

					
		
}		
}


