package br.org.controle6;

import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float sf;
	
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o sal�rio do funcion�rio ."));
		
		if(n1 > 500.00){
			JOptionPane.showMessageDialog(null, "O funcion�rio n�o tem direito ao aumento.");
		
		}else if (n1 < 500.00){
			
	    sf = (float) ((float) n1 + (n1 * 0.30));
			
			JOptionPane.showMessageDialog(null, "O novo sal�rio do funcion�rio � : " + sf);	
		
		

		}			
}
}



