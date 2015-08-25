package br.org.controle7;

import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float sf;
		
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário do funcionário ."));
		
		
		if(n1 > 300.00){
			sf = (float) (n1 + (n1 * 0.15));
			JOptionPane.showMessageDialog(null, "O salário reajustado do funcionário é : " + sf);
		
		}else if (n1 < 300.00){
			sf = (float) (n1 + (n1 * 0.35));
			JOptionPane.showMessageDialog(null, "O salário reajustado do funcionário é : " + sf);
			
		
		
		}

			
}
}
