package br.org.controle8;

import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float n2;
		
	
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o saldo ."));
		
	
		
		if( n1 < 200.00){
			n2 = (float) (n1 + (n1 * 0.10));
			JOptionPane.showMessageDialog(null, "O valor do crédito é : "+ n2);
		
		}else if (n1 > 200.00 && n1 < 300){
			n2 = (float) (n1 + (n1 * 0.20));
			JOptionPane.showMessageDialog(null, "O valor do crédito é : "+ n2);	
		
		}else if (n1 > 300.00 && n1 < 400.00){
			n2 = (float) (n1 + (n1 * 0.25));
			JOptionPane.showMessageDialog(null, "O valor do crédito é : "+ n2);
			
		}else if (n1 > 400.00){
			n2 = (float) (n1 + (n1 * 0.30 	));
			JOptionPane.showMessageDialog(null, "O valor do crédito é : "+ n2);
			
		}

			
}
}
