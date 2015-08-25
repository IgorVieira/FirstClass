package br.org.controle3;

import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float n2;
		float n3;
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número ."));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número ."));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o terceiro número ."));
		
		if(n1 > n2 && n1 > n3){
			JOptionPane.showMessageDialog(null, "O número "+n1+" é maior!!");
		
		}else if (n2 > n1 && n2 > n3){
			JOptionPane.showMessageDialog(null, "O número "+n2+" é maior!!");	
		
		}else if (n3 > n1 && n3 > n2){
			JOptionPane.showMessageDialog(null, "O número "+n3+" é maior!!");
			
		}

			
}
}
