package br.org.controle15;


import javax.swing.JOptionPane;


public class Start {

	public static void main(String[] args) {
	
		
		float n1;
		float n2;
	
		
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preço ."));
		
		if(n1 < 30.00){
			n2 = (float) n1;
			JOptionPane.showMessageDialog(null, "O novo preço é : " + n2);
		
		}else if (n1 >30.00 && n1<= 100.00){
			n2 = (float) (n1 -(n1 * 0.10));
			JOptionPane.showMessageDialog(null, "O novo preço é : " + n2);	
		
		}else if (n1 > 100.00 ){
			n2 = (float) (n1 +(n1 * 0.15));
			JOptionPane.showMessageDialog(null, "O novo preço é : " + n2);
		}
		}
	    }