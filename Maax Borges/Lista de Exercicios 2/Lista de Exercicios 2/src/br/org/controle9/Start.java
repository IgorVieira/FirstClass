package br.org.controle9;

import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float n2;
		
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preço de fábrica ."));
		
		
		if(n1 < 12.000){
			n2 = (float) (n1 + (n1 * 0.05));
			JOptionPane.showMessageDialog(null, "O preço do carro é : " +n2);
		
		}else if (n1 > 12.000 && n1 < 25.000){
			n2 = (float) (n1 + (n1 * 0.10)+(n1 * 0.15));
			JOptionPane.showMessageDialog(null, "O preço do carro é : " +n2);	
		
		}else if (n1 > 25.000 ){
			n2 = (float) (n1 + (n1 * 0.15) + (n1 * 0.20));
			JOptionPane.showMessageDialog(null, "O preço do carro é : " +n2);
			
		}

			
}
}
