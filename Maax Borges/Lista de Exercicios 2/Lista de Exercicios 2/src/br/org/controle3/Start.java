package br.org.controle3;

import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float n2;
		float n3;
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro n�mero ."));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo n�mero ."));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o terceiro n�mero ."));
		
		if(n1 > n2 && n1 > n3){
			JOptionPane.showMessageDialog(null, "O n�mero "+n1+" � maior!!");
		
		}else if (n2 > n1 && n2 > n3){
			JOptionPane.showMessageDialog(null, "O n�mero "+n2+" � maior!!");	
		
		}else if (n3 > n1 && n3 > n2){
			JOptionPane.showMessageDialog(null, "O n�mero "+n3+" � maior!!");
			
		}

			
}
}
